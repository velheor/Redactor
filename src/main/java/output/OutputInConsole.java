package output;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import textFragments.*;

public class OutputInConsole {
    private static Logger logger = LoggerFactory.getLogger(OutputInConsole.class);
    public static void output(Text text) {
        logger.info("Information output");
        for (Sentence sentence : text.getText()) {
            for (PartsOfSentence word : sentence.getSentence()) {
                if (word.getMark() == ' ') {
                    System.out.print(' ');
                    System.out.print(word.getWord());
                } else {
                    System.out.print(word.getMark());
                }
            }
        }
    }
}
