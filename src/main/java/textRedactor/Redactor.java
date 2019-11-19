package textRedactor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import textFragments.Paragraph;
import textFragments.Sentence;
import textFragments.Text;

public class Redactor {
    private static Logger logger = LoggerFactory.getLogger(Redactor.class);

    public static Text sortBySizeOfSentence(Text text) {
        logger.info("Sorted by size of sentence");
        Text textSortedBySizeOfSentence = translateTextInOneParagraph(text);
        for (int i = 0; i < textSortedBySizeOfSentence.getText().get(0).getLength(); i++) {
            for (int j = i + 1; j < textSortedBySizeOfSentence.getText().get(0).getLength(); j++) {
                Sentence sentence1 = textSortedBySizeOfSentence.getText().get(0).getParagraph().get(i);
                Sentence sentence2 = textSortedBySizeOfSentence.getText().get(0).getParagraph().get(j);
                if (sentence1.getSentenceLength() < sentence2.getSentenceLength()) {
                    textSortedBySizeOfSentence.getText().get(0).replaceSentenceInParagraph(i, sentence2);
                    textSortedBySizeOfSentence.getText().get(0).replaceSentenceInParagraph(j, sentence1);
                    i = 0;
                }
            }
        }
        return textSortedBySizeOfSentence;
    }

    public static Text translateTextInOneParagraph(Text text) {
        logger.info("Translated text in one Paragraph");
        Text textInOneParagraph = new Text();
        Paragraph paragraphOnly = new Paragraph();
        for (Paragraph paragraph : text.getText()) {
            for (Sentence sentence : paragraph.getParagraph()) {
                paragraphOnly.addToParagraph(sentence);
            }
        }
        textInOneParagraph.addToText(paragraphOnly);
        return textInOneParagraph;
    }
}
