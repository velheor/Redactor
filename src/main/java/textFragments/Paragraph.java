package textFragments;

import java.util.ArrayList;
import java.util.List;

public class Paragraph {
    private List<Sentence> paragraph = new ArrayList<>();

    public void addToParagraph(Sentence senetence) {
        paragraph.add(senetence);
    }

    public void replaceSentenceInParagraph(int i, Sentence sentence) {
        paragraph.set(i, sentence);
    }

    public List<Sentence> getParagraph() {
        return paragraph;
    }

    public int getLength() {
        return paragraph.size();
    }
}
