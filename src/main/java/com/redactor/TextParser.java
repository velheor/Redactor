package com.redactor;

import com.redactor.fragments.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*; 

public class TextParser {
    private static Logger logger = LoggerFactory.getLogger(TextParser.class);

    private static List<Character> sentenceSeparator = new ArrayList<>(
      Arrays.asList('.', '!', '?')
    );

    private static List<Character> listChars = new ArrayList<>(
            Arrays.asList(' ', ',', '.', '!', '?')
    );

    public static Text parse(String sourceText) {
        logger.info("Text parsed");
        StringBuilder sb = new StringBuilder();
        Sentence sentence = new Sentence();
        Paragraph paragraph = new Paragraph();
        Text text = new Text();
        char[] letters = sourceText.toCharArray();
        for (int i = 0; i < sourceText.length(); i++) {
            char ch = letters[i];
            if (ch == '\r' && letters[i + 1] == '\n') {
                text.addParagraph(paragraph);
                paragraph = new Paragraph();
            }
            if (listChars.contains(ch)) {
                if (sb.length() != 0) {
                    sentence.addToSentence(new Word(sb.toString()));
                    sb.setLength(0);
                }
                if (ch != ' ') {
                    sentence.addToSentence(new Mark(ch));
                    sb.setLength(0);
                }
                if (sentenceSeparator.contains(ch)) {
                    paragraph.addSentence(sentence);
                    sentence = new Sentence();
                }
            } else {
                sb.append(ch);
            }
        }
        text.addParagraph(paragraph);
        return text;
    }
}
