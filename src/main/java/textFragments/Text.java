package textFragments;
import java.util.ArrayList;
import java.util.List;

public class Text {
    private List<Sentence> text = new ArrayList<>();

    public void addToText(Sentence senetence) {
        text.add(senetence);
    }

    public void replaceSentenceInText(int i, Sentence sentence) {
        text.set(i, sentence);
    }

    public List<Sentence> getText() {
        return text;
    }

    public int getLength() {
        return text.size();
    }
}
