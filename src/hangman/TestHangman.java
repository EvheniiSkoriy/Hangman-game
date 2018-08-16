package hangman;

import java.util.Scanner;

public class TestHangman {

    public static void main(String[] args) {
        Hangman hg = new Hangman("abracadabra");
        Scanner s = new Scanner(System.in);

        String selection;
        System.out.println("For exit input 1");

        do {
            System.out.println("Guess word");
            System.out.println(hg.getWord());

            selection = s.nextLine();
            while (!selection.matches("[a-z]") && !selection.matches("1")) {
                System.out.println("Enter correct char ");
                selection = s.nextLine();
            }
            if (hg.makeGuess(selection.charAt(0))) {
                hg.setCountGuess(hg.getCountGuess() + 1);
            } else if ((selection.charAt(0) == '1')) {
            } else {
                hg.setIncorrectGuess(hg.getIncorrectGuess() + 1);
            }
            hg.getDisguisedWord(selection.charAt(0));
            System.out.println("The number of guesses made: " + hg.getCountGuess());
            System.out.println("The number of incorrect guesses: " + hg.getIncorrectGuess());

            if (hg.isFound()) {
                System.out.println(hg.getWord());
                System.out.println("YOU ARE GUESS!!!!");
                break;
            }
            System.out.println("------------");
        } while (!selection.equals("1"));

    }

}
