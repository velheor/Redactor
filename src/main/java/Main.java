import InputFile.InputFromFile;
import output.OutputInConsole;
import textParser.TextParser;

import java.io.IOException;

public class Main {
    public static void main(String[] args){
        InputFromFile inputFromFile = new InputFromFile();
        OutputInConsole outputInConsole = new OutputInConsole();
        TextParser textParser = new TextParser();
        outputInConsole.output(textParser.parse(inputFromFile.readFromFile()));
    }
}
