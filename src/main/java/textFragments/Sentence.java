package textFragments;

import java.util.ArrayList;
import java.util.List;

public class Sentence{
    private List<PartsOfSentence> sentences = new ArrayList<PartsOfSentence>();
    private Integer countOfWord = 0;

    public void addToSentence(PartsOfSentence partsOfSentence) {
        sentences.add(partsOfSentence);
    }

    public List<PartsOfSentence> getSentence() {
        return sentences;
    }

    public void increaseCountOfWord() {
        countOfWord++;
    }

    public int getSentenceLength() {
        return countOfWord;
    }

}
