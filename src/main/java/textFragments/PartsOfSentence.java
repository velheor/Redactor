package textFragments;

public class PartsOfSentence {

    private StringBuilder word = new StringBuilder();
    private char mark = ' ';

    public String getWord() {
        return word.toString();
    }

    public void setLetterInWord(Character letter) {
        word.append(letter);
    }

    public void setMark(Character mark) {
        this.mark = mark;
    }

    public Character getMark() {
        return this.mark;
    }


}
