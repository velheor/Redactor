package textParser;
import textFragments.Mark;
import textFragments.Sentence;
import textFragments.Text;
import textFragments.Word;

public class TextParser {
    public Text parse(String textFromFile) {
        Word word = new Word();
        Sentence sentence = new Sentence();
        Mark mark = new Mark();
        Text text = new Text();
        char[] letters = textFromFile.toCharArray();
        for (int i = 0; i < textFromFile.length(); i++) {
            if (letters[i] == ' ' || letters[i] == ',' || letters[i] == '.' || letters[i] == '!' || letters[i] == '?') {
                if (word.getWord().length() != 0) {
                    sentence.addToSentence(word);
                    sentence.increaseCountOfWord();
                    word = new Word();
                }
                if (letters[i] != ' ') {
                    mark.setMark(letters[i]);
                    sentence.addToSentence(mark);
                }
                if (letters[i] == '.' || letters[i] == '!' || letters[i] == '?') {
                    text.addToText(sentence);
                    sentence = new Sentence();
                }
            } else {
                word.setLetterInWord(letters[i]);
            }
        }
        return text;
    }


}
