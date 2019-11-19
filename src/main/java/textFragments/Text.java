package textFragments;

import java.util.ArrayList;
import java.util.List;

public class Text {
    private List<Paragraph> text = new ArrayList<>();

    public void addToText(Paragraph paragraph) {
        text.add(paragraph);
    }

    public List<Paragraph> getText() {
        return text;
    }

    public int getLength() {
        return text.size();
    }
}
