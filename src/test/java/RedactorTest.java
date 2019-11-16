import InputFile.InputFromFile;
import org.junit.Before;
import org.junit.Test;
import textFragments.PartsOfSentence;
import textFragments.Sentence;
import textFragments.Text;
import textParser.TextParser;
import textRedactor.Redactor;

import static java.util.Objects.deepEquals;


public class RedactorTest {
    private Text text = new Text();
    private Sentence sentence = new Sentence();
    private PartsOfSentence partsOfSentence = new PartsOfSentence();

    @Before
    public void setUp() {
        String input = "Press f. I am test.";
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch == ' ' || ch == ',' || ch == '.' || ch == '!' || ch == '?') {
                if (this.partsOfSentence.getWord().length() != 0) {
                    this.sentence.addToSentence(this.partsOfSentence);
                    this.sentence.increaseCountOfWord();
                    this.partsOfSentence = new PartsOfSentence();
                }
                if (ch != ' ') {
                    this.partsOfSentence.setMark(ch);
                    this.sentence.addToSentence(this.partsOfSentence);
                }
                if (ch == '.' || ch == '!' || ch == '?') {
                    this.text.addToText(this.sentence);
                    this.sentence = new Sentence();
                }
            } else {
                this.partsOfSentence.setLetterInWord(ch);
            }
        }
    }

    @Test
    public void sortBySizeOfSentence() {
        Text actual = Redactor.sortBySizeOfSentence(TextParser.parse(InputFromFile.readFromFile(InputFromFile.openFile())));
        Text expected = this.text;
        deepEquals(actual, expected);
    }
}
