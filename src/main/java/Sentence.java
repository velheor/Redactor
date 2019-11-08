import java.util.ArrayList;
import java.util.List;

public class Sentence {
    private List<String> sentences = new ArrayList<String>();
    private Integer countOfWord = 0;

    public void addToSentence(String word) {
        sentences.add(word);
    }

    public List<String> getSentence() {
        return sentences;
    }

    public void increaseCountOfWord(){
        this.countOfWord ++;
    }
    public int getSentenceLength(){
        return this.countOfWord;
    }
}
