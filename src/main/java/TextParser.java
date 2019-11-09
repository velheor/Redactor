import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TextParser {

    public static Text parser() {
        Word word = new Word();
        Sentence sentence = new Sentence();
        Mark mark = new Mark();
        Text text = new Text();
        try (FileReader reader = new FileReader("src/Text.txt")) {
            int ch;
            while ((ch = reader.read()) != -1) {
                if (ch == ' ' || ch == ',' || ch == '.' || ch == '!' || ch == '?') {
                    if (word.getWord().length() != 0) {
                        sentence.addToSentence(word);
                        sentence.increaseCountOfWord();
                        word = new Word();
                    }
                    if (ch != ' ') {
                        mark.setMark((char) ch);
                        sentence.addToSentence(mark);
                    }
                    if (ch == '.' || ch == '!' || ch == '?') {
                        text.addToText(sentence);
                        sentence = new Sentence();
                    }
                } else {
                    word.setLetterInWord((char) ch);
                }
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return text;
    }

    public static Text sortBySizeOfSentence(Text text) {
        for (int i = 0; i < text.getLength(); i++) {
            for (int j = i + 1; j < text.getLength(); j++) {
                Sentence sentence1 = text.getText().get(i);
                Sentence sentence2 = text.getText().get(j);
                if (sentence1.getSentenceLength() < sentence2.getSentenceLength()) {
                    text.replaceSentenceInText(i, sentence2);
                    text.replaceSentenceInText(j, sentence1);
                    i = 0;
                }
            }
        }
        return text;
    }

    public static void outPut(Text text) {
        for (Sentence sentence : text.getText()) {
            for (Object word : sentence.getSentence()) {
                if (word instanceof Word) {
                    System.out.print(' ');
                    ((Word) word).showInfo();
                } else {
                    ((Mark) word).showInfo();
                }
            }
        }
    }
}
