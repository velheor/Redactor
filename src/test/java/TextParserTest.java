import InputFile.InputFromFile;
import org.junit.Before;
import org.junit.Test;
import textFragments.Paragraph;
import textFragments.PartsOfSentence;
import textFragments.Sentence;
import textFragments.Text;
import textParser.TextParser;

import java.util.Objects;

import static java.util.Objects.deepEquals;

/*public class TextParserTest {
    private Text text = new Text();
    private Sentence sentence = new Sentence();
    private PartsOfSentence partsOfSentence = new PartsOfSentence();
    private Paragraph paragraph = new Paragraph();
    @Before
    public void setUp() {
        String input = "Press f. I am test.";
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (Objects.equals(partsOfSentence.getMarks(), ch)) {
                if (partsOfSentence.getWord().length() != 0) {
                    sentence.addToSentence(partsOfSentence);
                    sentence.increaseCountOfWord();
                } else if (ch != ' ') {
                    partsOfSentence.setMark(ch);
                    sentence.addToSentence(partsOfSentence);
                }
                if (ch == '.' || ch == '!' || ch == '?') {
                    paragraph.addToParagraph(sentence);
                    sentence = new Sentence();
                }
                if(ch == '\r' && ch == '\n'){
                    paragraph = new Paragraph();
                }
                partsOfSentence = new PartsOfSentence();
            } else {
                partsOfSentence.setLetterInWord(ch);
            }
    }

    /*@Test
    public void parser() {
        Text actual = TextParser.parse(InputFromFile.readFromFile(InputFromFile.openFile()));
        Text expected = this.text;
        deepEquals(actual, expected);
    }*/
//}