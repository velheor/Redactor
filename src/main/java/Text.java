import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Text extends Sentence {
    private List<List> text = new ArrayList<List>();

    public void addToText(List senetences) {
        text.add(senetences);
    }

    public List getText() {
        return text;
    }
}
