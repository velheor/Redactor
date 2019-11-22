package com.redactor.fragments;

import java.util.ArrayList;
import java.util.List;

public class Text {
    private List<Paragraph> paragraphs = new ArrayList<>();

    public List<Sentence> toSentences() {
        List<Sentence> sentences = new ArrayList<>();
        for (Paragraph paragraph : this.getParagraphs()) {
            for (Sentence sentence : paragraph.getSentences()) {
                sentences.add(sentence);
            }
        }
        return sentences;
    }

    public void addParagraph(Paragraph paragraph) {
        paragraphs.add(paragraph);
    }

    public List<Paragraph> getParagraphs() {
        return paragraphs;
    }

    public int size() {
        return paragraphs.size();
    }

    public String toString() {
      StringBuilder sb = new StringBuilder();
      for (Paragraph paragraph: this.getParagraphs()) {
          for (Sentence sentence : paragraph.getSentences()) {
              for (SentencePart sp : sentence.getSentencePart()) {
                  switch (sp.getType()) {
                    case WORD:
                      sb.append(" ");
                      sb.append(((Word) sp).getWord());
                      break;
                    case MARK:
                      sb.append(((Mark) sp).getMark());
                      break;
                  }
              }
          }
      }
      return sb.toString();
    }
}
