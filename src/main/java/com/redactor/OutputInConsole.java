package com.redactor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.redactor.fragments.*;

public class OutputInConsole {
    private static Logger logger = LoggerFactory.getLogger(OutputInConsole.class);

    public static void output(Text text) {
        logger.info("Information output");
        for (Paragraph paragraph : text.getParagraphs()) {
            for (Sentence sentence : paragraph.getSentences()) {
                for (SentencePart sp : sentence.getSentence()) {
                    switch (sp.getType()) {
                      case WORD:
                        System.out.print(' ');
                        System.out.print(((Word) sp).getWord());
                      case MARK:
                        System.out.print(((Mark) sp).getMark());
                    }
                }
            }
        }
    }
}
