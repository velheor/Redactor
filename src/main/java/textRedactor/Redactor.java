package textRedactor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import textFragments.Sentence;
import textFragments.Text;

public class Redactor {
    private static Logger logger = LoggerFactory.getLogger(Redactor.class);

    public static Text sortBySizeOfSentence(Text text) {
        logger.info("Sorted by size of sentence");
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
}
