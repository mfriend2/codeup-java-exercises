import java.util.Arrays;
import java.util.Scanner;

public class MethodsExercises {

    public static int addition(int num1, int num2) {
        return num1 + num2;
    }

    public static int additionRecursion(int num1, int num2) {
        if (num2 == 0) {
            return num1;
        } else {
            return additionRecursion(num1, num2 - 1) + 1;
        }
    }

    public static int subtraction(int num1, int num2) {
        return num1 - num2;
    }

    public static int subtractionRecursion(int num1, int num2) {
        if (num2 == 0) {
            return num1;
        } else {
            return subtractionRecursion(num1, num2 - 1) - 1;
        }
    }

    public static int multiplication(int num1, int num2) {
        // Method without using *
        int sum = 0;
        for (int x = 1; x <= num1; x++) {
            sum += num2;
        }
        return sum;
//        return num1 * num2;
    }

    public static int multiplicationRecursion(int num1, int num2) {
        if (num1 == 0 || num2 == 0) {
            return 0;
        } else {
            return multiplicationRecursion(num1, num2 - 1) + num1;
        }
    }

    public static int division(int num1, int num2) {
        return num1 / num2;
    }

    public static int divisionRecursion(int num1, int num2) {
        if (num2 == 0) {
            return 0;
        } else if (num1 - num2 == 0) {
            return 1;
        } else if (num1 < num2) {
            return 0;
        } else {
            return divisionRecursion(num1 - num2, num2) + 1;
        }
    }

    public static int modulus(int num1, int num2) {
        return num1 % num2;
    }

    public static int modulusRecursion(int num1, int num2) {
        if (num1 < num2) {
            return num1;
        }
        return modulusRecursion(num1 - num2, num2);
    }

    public static void getInteger(int min, int max) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter a number between %d and %d.\n", min, max);
        int userInput = scanner.nextInt();
        if (userInput > max || userInput < min) {
            System.out.printf("%d is not between %d and %d. Try again.\n", userInput, min, max);
            getInteger(min, max);
        } else {
            System.out.printf("%d is between %d and %d.", userInput, min, max);
        }
    }

    public static long factorial(long num) {
        long sum = 1;
        for (long x = 1; x <= num; x++) {
            sum *= x;
        }
        return sum;
    }

    public static long highestFactorial() {
        long sum = 1;
        long highFact = 0;
        while (sum >= 0) {
            sum = factorial(highFact);
            if (sum < 0) highFact--;
            else highFact++;
        }
        return highFact;
    }

    public static int[] diceRoll (int sides) {
        int dice1 = (int) (Math.random() * sides) + 1;
        int dice2 = (int) (Math.random() * sides) + 1;
        int[] result = new int[2];
        result[0] = dice1;
        result[1] = dice2;
        return result;
    }




    public static void main(String[] args) {

//            System.out.println(addition(1, 2));
//            System.out.println(subtraction(1, 2));
//            System.out.println(multiplication(9, 3));
//            System.out.println(division(1, 2));
//            System.out.println(modulus(1, 2));
//            System.out.println(additionRecursion(1, 2));
//            System.out.println(subtractionRecursion(1, 2));
//            System.out.println(multiplicationRecursion(6, 5));
//            System.out.println(divisionRecursion(4, 2));
//            System.out.println(modulusRecursion(6, 2));
//            getInteger(1,10);
//        System.out.println(factorial(3));
        Scanner scanner =new Scanner(System.in);
//        while (true) {
//            System.out.printf("Enter a number between 1 and %d\n", highestFactorial());
//            long num = scanner.nextLong();
//            System.out.println(factorial(num));
//            System.out.println("Would you like to continue? [Y/N]");
//            String decision = scanner.next();
//            if (decision.equalsIgnoreCase("n")) {
//                break;
//            }
//        }
//        System.out.println(highestFactorial());
        while (true) {
            System.out.println("Enter the number of sides on the dice:");
            int sides = scanner.nextInt();
            System.out.println("Roll the dice! [Y/N]");
            String roll = scanner.next();
            if (roll.equalsIgnoreCase("y")) System.out.println(Arrays.toString(diceRoll(sides)));
            if (roll.equalsIgnoreCase("n")) break;
            System.out.println("Would you like to roll again? [Y/N]");
            String rollAgain = scanner.next();
            if (rollAgain.equalsIgnoreCase("n")) break;
        }
    }
}
