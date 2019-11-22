package com.redactor;

import com.redactor.fragments.Sentence;
import com.redactor.fragments.Text;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.Objects.deepEquals;
import static org.junit.Assert.assertEquals;

public class RedactorTest {
    @Test
    public void testRedactor() {
        Text testText = TextParser.parse("one two free four.\r\none two.");
        List<Sentence> actual = Redactor.sortBySizeOfSentence(testText);
        List<Sentence> expected = new ArrayList<>();
        Sentence sentence = testText.getParagraphs().get(1).getSentences().get(0);
        Sentence sentence1 = testText.getParagraphs().get(0).getSentences().get(0);
        expected.add(sentence);
        expected.add(sentence1);
        assertEquals(true, deepEquals(actual, expected));
    }
}
