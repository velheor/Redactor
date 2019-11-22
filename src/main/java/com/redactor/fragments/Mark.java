package com.redactor.fragments;

public class Mark extends SentencePart {
    private SentencePartType type = SentencePartType.MARK;
    private char mark = ' ';

    public Mark(char mark) {
      this.mark = mark;
    }

    public Character getMark() {
        return this.mark;
    }

    public SentencePartType getType() {
      return this.type;
    }
}
