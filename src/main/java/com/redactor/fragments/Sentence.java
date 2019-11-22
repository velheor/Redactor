package com.redactor.fragments;

import java.util.ArrayList;
import java.util.List;

public class Sentence {
    private List<SentencePart> sentences = new ArrayList<>();
    private Integer countOfWord = 0;

    public void addToSentence(SentencePart partsOfSentence) {
        if (partsOfSentence.getType() == SentencePartType.WORD) {
          this.countOfWord += 1;
        }
        sentences.add(partsOfSentence);
    }

    public List<SentencePart> getSentencePart() {
        return sentences;
    }

    public int getSentenceLength() {
        return countOfWord;
    }
}
