import output.OutputInConsole;
import textParser.TextParser;

public class Main {
    public static void main(String[] args) {
        TextParser textParser = new TextParser();
        OutputInConsole outputInConsole = new OutputInConsole();
        outputInConsole.output(textParser.sortBySizeOfSentence(textParser.parser()));
    }


}
