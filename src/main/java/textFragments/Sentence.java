package textFragments;

import java.util.ArrayList;
import java.util.List;

public class Sentence extends Word{
    private List<PartsOfSentence> sentences = new ArrayList<PartsOfSentence>();
    private Integer countOfWord = 0;

    public void addToSentence(PartsOfSentence word) {
        sentences.add(word);
    }

    public List<PartsOfSentence> getSentence() {
        return sentences;
    }

    public void increaseCountOfWord() {
        this.countOfWord++;
    }

    public int getSentenceLength() {
        return this.countOfWord;
    }

}
