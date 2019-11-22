package com.redactor;

import org.junit.Test;

import static org.junit.Assert.*;

import com.redactor.fragments.*;

import java.util.List;

public class TextParserTest {
    @Test
    public void testParse() {
        Text actual = TextParser.parse("asdasd.\r\nasdasdas.\r\n");
        assertEquals(3, actual.size());
    }

    @Test
    public void testCountOfWordsInSentence() {
        Text testText = TextParser.parse("first second third.\r\nasdasdas.\r\n");
        List<Paragraph> paragraphsActual = testText.getParagraphs();
        Paragraph testParagraph = paragraphsActual.get(0);
        List<Sentence> sentenceInFirstParagraph = testParagraph.getSentences();
        Sentence firstSentence = sentenceInFirstParagraph.get(0);
        assertEquals(3, firstSentence.getSentenceLength());
    }

    @Test
    public void testCountOfSentencesInParagraphs() {
        Text testText = TextParser.parse("first second third. Second sentence.\r\nasdasdas.\r\n");
        Paragraph testParagraph = testText.getParagraphs().get(0);
        assertEquals(2, testParagraph.size());
    }
}
