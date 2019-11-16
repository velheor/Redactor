package InputFile;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class InputFromFile {
    private static Logger logger = LoggerFactory.getLogger(InputFromFile.class);

    public static FileReader openFile() {
        FileReader reader = null;
        try {reader = new FileReader("src/Text.txt");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return reader;
    }

    public static String readFromFile(FileReader reader) throws IOException {
        logger.info("Text read");
        String text = "";
        int ch;
        while ((ch = reader.read()) != -1) {
            text = text + (char) ch;
        }
        return text;
    }
}