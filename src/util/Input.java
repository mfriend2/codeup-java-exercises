package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner = new Scanner(System.in);

    public String getString() {
        System.out.println("Enter a string.");
        scanner.nextLine();
        return scanner.nextLine();
    }

    public boolean yesNo() {
        System.out.println("Do you agree?");
        String input = scanner.next();
        if (input.equalsIgnoreCase("yes") || input.equalsIgnoreCase("y") || input.equalsIgnoreCase("yeah")) {
            return true;
        } else {
            return false;
        }
    }

    public int getInt(int min, int max) {
        System.out.printf("Enter a number between %d and %d.\n", min, max);
        int input = scanner.nextInt();
        while (input > max || input < min) {
            System.out.println("Try Again");
            return getInt(min, max);
        }
        return input;
    }

    public int getInt() {
        System.out.println("Enter a number.");
        return scanner.nextInt();
    }

    public double getDouble(double min, double max) {
        System.out.printf("Enter a decimal number between %.2f and %.2f.\n", min, max);
        double input = scanner.nextDouble();
        while (input > max || input < min) {
            System.out.println("Try Again");
            return getDouble(min, max);
        }
        return input;
    }

    public double getDouble() {
        System.out.println("Enter a decimal number.");
        return scanner.nextDouble();
    }
}
