public class MethodsExercises {

    public static int addition (int num1, int num2) {
        return num1 + num2;
    }

    public static int additionRecursion (int num1, int num2) {
       if (num2 == 0 ) {
           return num1;
       }
       else {
           return additionRecursion(num1, num2 - 1) + 1;
       }
    }

    public static int subtraction (int num1, int num2) {
        return num1 - num2;
    }

    public static int subtractionRecursion (int num1, int num2) {
        if (num2 == 0 ) {
            return num1;
        }
        else {
            return subtractionRecursion(num1, num2 - 1) - 1;
        }
    }

    public static int multiplication (int num1, int num2) {
        // Method without using *
        int sum = 0;
        for (int x = 1;x <= num1;x++) {
            sum += num2;
        }
        return sum;
//        return num1 * num2;
    }

    public static int multiplicationRecursion (int num1, int num2) {
        if (num1 == 0 || num2 == 0) {
            return 0;
        }
        else {
            return multiplicationRecursion(num1, num2 - 1) + num1;
        }
    }

    public static int division (int num1, int num2) {
        return num1 / num2;
    }

    public static int divisionRecursion (int num1, int num2) {
        if ( num2 == 0) {
            return 0;
        }
        else if (num1 - num2 == 0) {
            return 1;
        }
        else if (num1 < num2) {
            return 0;
        }
        else {
            return divisionRecursion(num1 - num2, num2) + 1;
        }
    }

    public static int modulus (int num1, int num2) {
        return num1 % num2;
    }

    public static void main(String[] args) {

        System.out.println(addition(1, 2));
        System.out.println(subtraction(1, 2));
        System.out.println(multiplication(9, 3));
        System.out.println(division(1, 2));
        System.out.println(modulus(1, 2));
        System.out.println(additionRecursion(1, 2));
        System.out.println(subtractionRecursion(1, 2));
        System.out.println(multiplicationRecursion(6, 5));
        System.out.println(divisionRecursion(4, 2));

    }
}
