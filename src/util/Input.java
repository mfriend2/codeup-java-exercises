package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner = new Scanner(System.in);

    public String getString() {
        System.out.println("Enter a string.");
        return scanner.nextLine();
    }

    public boolean yesNo() {
        System.out.println("Would you like to make another circle?");
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

    int enteredInt;

    public int getInt() {
        System.out.println("Enter a whole number.");
        try {
            enteredInt = Integer.parseInt(getString());
            System.out.println(enteredInt + " is an integer.");
            return enteredInt;
        } catch (Exception e) {
            System.err.println("Uh oh you did not enter an integer!");
            e.printStackTrace();
            return getInt();
        }
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

    double enteredDub;

    public double getDouble() {
        System.out.println("Enter a decimal number.");
        try {
            enteredDub = Double.parseDouble(getString());
            System.out.println(enteredDub + " is a double.");
            return enteredDub;
        } catch (Exception e) {
            System.err.println("Uh oh you did not enter a double!");
            e.printStackTrace();
            return getDouble();
        }
    }
}
