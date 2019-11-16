package textParser;

import textFragments.PartsOfSentence;
import textFragments.Sentence;
import textFragments.Text;

public class TextParser {
    public static Text parse(String textFromFile) {
        PartsOfSentence partsOfSentence = new PartsOfSentence();
        Sentence sentence = new Sentence();
        Text text = new Text();
        char[] letters = textFromFile.toCharArray();
        for (int i = 0; i < textFromFile.length(); i++) {
            if (letters[i] == ' ' || letters[i] == ',' || letters[i] == '.' || letters[i] == '!' || letters[i] == '?') {
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
                    text.addToText(sentence);
                    sentence = new Sentence();
                }
            } else {
                partsOfSentence.setLetterInWord(letters[i]);
            }
        }
        return text;
    }


}
