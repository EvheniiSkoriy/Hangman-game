package hangman;

public class Hangman {

    private String secretWord;
    private String word;
    private int countGuess;
    private int incorrectGuess;

    /**
     *
     * @param secretWord word that you will be guessing
     */
    public Hangman(String secretWord) {
        this.secretWord = secretWord;
        this.countGuess = 0;
        this.incorrectGuess = 0;
        this.word = "";
        for (int i = 0; i < secretWord.length(); i++) {
            this.word += "?";
        }
    }

    public String getSecretWord() {
        return secretWord;
    }

    public int getCountGuess() {
        return countGuess;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public int getIncorrectGuess() {
        return incorrectGuess;
    }

    public void setIncorrectGuess(int incorrectGuess) {
        this.incorrectGuess = incorrectGuess;
    }

    public void setSecretWord(String secretWord) {
        this.secretWord = secretWord;
    }

    public void setCountGuess(int countGuess) {
        this.countGuess = countGuess;
    }

    /**
     * Checks if you guess the word
     *
     * @return true if you guess a word , else - false
     */
    public boolean isFound() {
        assert (secretWord != null && secretWord.length() != 0);
        return secretWord.equals(word);
    }

    /**
     * Guesses that character a is in the word
     *
     * @param a symbol that user input from keyboard
     * @return true if secret word has a guess symbol, else - false
     */
    public boolean makeGuess(char a) {
        assert (a != ' ');
        int i = 0;
        while (i < secretWord.length()) {
            if (secretWord.charAt(i) == a) {

                return true;
            }
            i++;
        }
        return false;
    }

    /**
     * Change string Word on correctly guessed letters in their correct
     * positions
     *
     * @param a char that user input from keyboard
     * @return change a word to guess the symbols
     */
    public String getDisguisedWord(char a) {
        assert (a != ' ');
        int i = 0;
        while (i < secretWord.length()) {
            if (secretWord.charAt(i) == a) {
                word = word.substring(0, i) + a + word.substring(i + 1);
            }
            i++;
        }

        return word;
    }

}
