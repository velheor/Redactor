import InputFile.InputFromFile;
import output.OutputInConsole;
import textParser.TextParser;

public class Main {
    public static void main(String[] args){
        OutputInConsole.output(TextParser.parse(InputFromFile.readFromFile(InputFromFile.openFile())));
    }
}
