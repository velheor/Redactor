/*import org.junit.Before;
import org.junit.Test;
import textFragments.Mark;
import textFragments.Sentence;
import textFragments.Text;
import textFragments.Word;
import textParser.TextParser;

import static java.util.Objects.deepEquals;

public class TextParserTest {
    private Text text = new Text();
    private Word word = new Word();
    private Sentence sentence = new Sentence();
    private Mark mark = new Mark();

    @Before
    public void setUp() {
        String input = "Press f. I am test.";
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch == ' ' || ch == ',' || ch == '.' || ch == '!' || ch == '?') {
                if (this.word.getWord().length() != 0) {
                    this.sentence.addToSentence(this.word);
                    this.sentence.increaseCountOfWord();
                    this.word = new Word();
                }
                if (ch != ' ') {
                    this.mark.setMark(ch);
                    this.sentence.addToSentence(this.mark);
                }
                if (ch == '.' || ch == '!' || ch == '?') {
                    this.text.addToText(this.sentence);
                    this.sentence = new Sentence();
                }
            } else {
                this.word.setLetterInWord(ch);
            }
        }
    }

    @Test
    public void parser() {
        TextParser textParser = new TextParser();
        Text actual = textParser.parse();
        Text expected = this.text;
        deepEquals(actual, expected);
    }

    @Test
    public void sortBySizeOfSentence() {
        TextParser textParser = new TextParser();
        Text actual = textParser.sortBySizeOfSentence(this.text);
        Text expected = this.text;
        deepEquals(actual, expected);
    }

}*/