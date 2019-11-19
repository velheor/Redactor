package com.redactor.fragments;

public class Word extends SentencePart {
    private SentencePartType type = SentencePartType.WORD;
    private String word;

    public Word(String word) {
      this.word = word;
    }

    public SentencePartType getType() {
      return this.type;
    }

    public String getWord() {
        return this.word;
    }
}
