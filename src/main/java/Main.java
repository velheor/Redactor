import InputFile.InputFromFile;
import output.OutputInConsole;
import textParser.TextParser;
import textRedactor.Redactor;

public class Main {
    public static void main(String[] args) {
        OutputInConsole.output(TextParser.parse(InputFromFile.readFromFile(InputFromFile.openFile())));
        Redactor.sortBySizeOfSentence(TextParser.parse(InputFromFile.readFromFile(InputFromFile.openFile())));
    }
}
