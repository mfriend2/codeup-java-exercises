import java.util.Scanner;

public class HighLow {

    public static int randomNumber() {
        int num = (int) (Math.random() * 100) + 1;
        return num;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberToGuess = randomNumber();
        int numberOfGuesses = 0;
        System.out.println("Guess a random number between 1 and 100.");
        while (true) {
            int guessedNum = scanner.nextInt();
            numberOfGuesses++;
            if (numberOfGuesses == 10) break;
            if (guessedNum < numberToGuess) System.out.println("Higher");
            if (guessedNum > numberToGuess) System.out.println("Lower");
            if (guessedNum == numberToGuess) {
                System.out.printf("Good guess %d was the right number.\n", numberToGuess);
                System.out.printf("You guessed %d times.\n", numberOfGuesses);
                break;
            }
        }
    }
}
