import java.util.ArrayList;
import java.util.List;

public class Word {
    private StringBuilder word = new StringBuilder();

    public StringBuilder getWord() {
        return word;
    }

    public void setLetterInWord(char letter) {
        word.append(letter);
    }

    public void showInfo() {
        System.out.print(this.word);
    }


}
