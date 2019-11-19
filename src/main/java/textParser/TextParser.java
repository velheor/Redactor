package textParser;

import textFragments.*;

public class TextParser {
    public static Text parse(String textFromFile) {
        PartsOfSentence partsOfSentence = new PartsOfSentence();
        Sentence sentence = new Sentence();
        Paragraph paragraph = new Paragraph();
        Text text = new Text();
        PunctuationMarks punctuationMarks = new PunctuationMarks();
        punctuationMarks.charArrayToList();
        char[] letters = textFromFile.toCharArray();
        for (int i = 0; i < textFromFile.length(); i++) {
            if (letters[i] == '\r' && letters[i + 1] == '\n') {
                text.addToText(paragraph);
                paragraph = new Paragraph();
            }
            if (punctuationMarks.getListChars().contains(letters[i])) {
                if (partsOfSentence.getWord().length() != 0) {
                    sentence.addToSentence(partsOfSentence);
                    sentence.increaseCountOfWord();
                    partsOfSentence = new PartsOfSentence();
                }
                if (letters[i] != ' ') {
                    partsOfSentence.setMark(letters[i]);
                    sentence.addToSentence(partsOfSentence);
                    partsOfSentence = new PartsOfSentence();
                }
                if (letters[i] == '.' || letters[i] == '!' || letters[i] == '?') {
                    paragraph.addToParagraph(sentence);
                    sentence = new Sentence();
                }
            } else {
                partsOfSentence.setLetterInWord(letters[i]);
            }
        }
        text.addToText(paragraph);
        return text;
    }
}
