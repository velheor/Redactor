import java.util.ArrayList;
import java.util.List;

public class Sentence extends Word {
    private List<String> sentences = new ArrayList<String>();

    public void addToSentence(String word) {
        sentences.add(word);
    }

    public List<String> getSentence() {
        return sentences;
    }
}
