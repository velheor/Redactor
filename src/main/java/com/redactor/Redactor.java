package com.redactor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.redactor.fragments.Paragraph;
import com.redactor.fragments.Sentence;
import com.redactor.fragments.Text;
import java.util.*; 

public class Redactor {
    private static Logger logger = LoggerFactory.getLogger(Redactor.class);

    public static List<Sentence> sortBySizeOfSentence(Text text) {
        logger.info("Sorted by size of sentence");
        List<Sentence> sentences = text.toSentences();
        Collections.sort(sentences, Comparator.comparing(Sentence::getSentenceLength));
        return sentences;
    }

}
