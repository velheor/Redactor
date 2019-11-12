package output;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import textFragments.Mark;
import textFragments.Sentence;
import textFragments.Text;
import textFragments.Word;
import textParser.TextParser;

public class OutputInConsole {
    private static Logger logger = LoggerFactory.getLogger(TextParser.class);
    public static void output(Text text) {
        logger.info("Information output");
        for (Sentence sentence : text.getText()) {
            for (Object word : sentence.getSentence()) {
                if (word instanceof Word) {
                    System.out.print(' ');
                    System.out.print(((Word) word).getWord().toString());
                } else {
                    System.out.print(((Mark) word).getMark().toString());
                }
            }
        }
    }
}
