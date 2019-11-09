import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        TextParser textParser = new TextParser();
        textParser.outPut(textParser.sortBySizeOfSentence(textParser.parser()));
    }

}
