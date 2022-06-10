import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class ConsoleExercises {
    public static void main(String[] args) {

        double pi = 3.14159;
        System.out.printf("The value of pi is approximately %.2f.%n", pi);

        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\n");

        System.out.println("Enter a number:");
        int yourNumber = scanner.nextInt();
        System.out.println("You entered: " + yourNumber);
        System.out.println("Enter 3 words:");
        String word1 = scanner.next();
        String word2 = scanner.next();
        String word3 = scanner.next();
        System.out.println("You entered: " + word1 + ", " + word2 + ", " + word3);
        scanner.nextLine();
        System.out.println("Enter a sentence:");
        String yourSentence = scanner.nextLine();
        System.out.println("You entered: " + yourSentence);
        System.out.println("Enter the length of your classroom:");
        double length = scanner.nextDouble();
        System.out.println("The length you entered is " + length + ".");
        System.out.println("Enter the width of your classroom:");
        double width = scanner.nextDouble();
        System.out.println("The width you entered is " + width + ".");
        System.out.println("Enter the height of your classroom:");
        double height = scanner.nextDouble();
        System.out.println("The height your entered is " + height + ".");
        double roomArea = length * width;
        double roomPerimeter = (2 * length) + (2 * width);
        double roomVolume = height * roomArea;
        System.out.printf("The area of your classroom is %.2f. The perimeter of your classroom is %.2f. The volume of your classroom is %.2f", roomArea, roomPerimeter, roomVolume);
    }
}
