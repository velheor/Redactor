package com.redactor;

public class Main {
    public static void main(String[] args) {
        OutputInConsole.output(TextParser.parse(InputFromFile.readFromFile(InputFromFile.openFile(""))));
        Redactor.sortBySizeOfSentence(TextParser.parse(InputFromFile.readFromFile(InputFromFile.openFile(""))));
    }
}
