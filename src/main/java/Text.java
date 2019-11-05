import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Text extends Sentence {
    private List<List> text = new ArrayList<>();

    public void addToText(List senetence) {
        text.add(senetence);
    }

    public List<List> getText() {
        return text;
    }
}
