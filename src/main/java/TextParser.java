import java.util.ArrayList;
import java.util.List;

public class TextParser {
    public static Text textParser() {
        Word word = new Word();
        Sentence sentence = new Sentence();
        Mark mark = new Mark();
        Text text = new Text();
        String input = "This is test! I am test.";
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch == ' ' || ch == ',' || ch == '.' || ch == '!' || ch == '?') {
                if (word.getWord().length() != 0) {
                    sentence.addToSentence(word.getWord().toString());
                    word = new Word();
                }
                mark.setMark(ch);
                sentence.addToSentence(Character.toString(ch));
                if (ch == '.' || ch == '!' || ch == '?') {
                    text.addToText(sentence.getSentence());
                    sentence = new Sentence();
                }
            } else {
                word.setLetterInWord(ch);
            }
        }
        return text;
    }

    public static void output() {
        Text text = textParser();
        Mark mark;
        for (List sentence : text.getText()) {
            for (Object word : sentence) {
                System.out.print(word);
            }
        }
    }
}
