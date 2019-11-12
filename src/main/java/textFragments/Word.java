package textFragments;

public class Word {
    private StringBuilder word = new StringBuilder();

    public StringBuilder getWord() {
        return word;
    }

    public void setLetterInWord(char letter) {
        word.append(letter);
    }
}
