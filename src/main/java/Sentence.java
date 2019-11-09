import java.util.ArrayList;
import java.util.List;

public class Sentence {
    private List<Object> sentences = new ArrayList<Object>();
    private Integer countOfWord = 0;

    public void addToSentence(Object word) {
        sentences.add(word);
    }

    public List<Object> getSentence() {
        return sentences;
    }

    public void increaseCountOfWord() {
        this.countOfWord++;
    }

    public int getSentenceLength() {
        return this.countOfWord;
    }
}
