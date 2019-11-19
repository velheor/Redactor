package textFragments;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PunctuationMarks {
    private char[] marks = {' ', ',', '.', '!', '?'};

    private List<Character> listChars = new ArrayList<Character>();

    public void charArrayToList() {
        for (char c : marks) {
            listChars.add(c);
        }
    }

    public List<Character> getListChars() {
        return listChars;
    }
}