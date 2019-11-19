package com.redactor.fragments;

import java.util.ArrayList;
import java.util.List;

public class Paragraph {
    private List<Sentence> sentences = new ArrayList<>();

    public void addSentence(Sentence senetence) {
        sentences.add(senetence);
    }

    public void replaceSentence(int i, Sentence sentence) {
        sentences.set(i, sentence);
    }

    public List<Sentence> getSentences() {
        return sentences;
    }

    public int size() {
        return sentences.size();
    }
}
