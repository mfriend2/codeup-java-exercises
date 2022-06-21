import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class GroceryListApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Would you like to create a grocery list? [Y/N]");
        String decision = scanner.next();
        HashMap<String, Integer> groceryItems = new HashMap<>();
        HashMap<String, HashMap<String, Integer>> categories = new HashMap();
        if (decision.equalsIgnoreCase("y")) {
            while (true) {
                System.out.println("Do you want to enter a new item? [Y/N]");
                String decision2 = scanner.next();
                if (decision2.equalsIgnoreCase("y")) {
                    System.out.printf("Choose category:%n1 - Fruit%n2 - Vegetables%n3 - Dairy%n4 - Meat%n5 - Canned Good%n6 - Frozen%n7 - Boxed Food%n8 - Other%n");
                    int category = scanner.nextInt();
                    if (category == 1) {
                        System.out.println("Enter the name of the item:");
                        scanner.nextLine();
                        String itemName = scanner.nextLine();
                        System.out.println("How many of " + itemName + " will you need?");
                        int amount = scanner.nextInt();
                        groceryItems.put(itemName, amount);
                        categories.put("Fruit",new HashMap<>());
                    }
                    if (category == 2) {
                        System.out.println("Enter the name of the item:");
                        scanner.nextLine();
                        String itemName = scanner.nextLine();
                        System.out.println("How many of " + itemName + " will you need?");
                        int amount = scanner.nextInt();
                        groceryItems.put(itemName, amount);
                        categories.put("Vegetables", groceryItems);
                    }
                    if (category == 3) {
                        System.out.println("Enter the name of the item:");
                        scanner.nextLine();
                        String itemName = scanner.nextLine();
                        System.out.println("How many of " + itemName + " will you need?");
                        int amount = scanner.nextInt();
                        groceryItems.put(itemName, amount);
                        categories.put("Dairy", groceryItems);
                    }
                    if (category == 4) {
                        System.out.println("Enter the name of the item:");
                        scanner.nextLine();
                        String itemName = scanner.nextLine();
                        System.out.println("How many of " + itemName + " will you need?");
                        int amount = scanner.nextInt();
                        groceryItems.put(itemName, amount);
                        categories.put("Meat", groceryItems);
                    }
                    if (category == 5) {
                        System.out.println("Enter the name of the item:");
                        scanner.nextLine();
                        String itemName = scanner.nextLine();
                        System.out.println("How many of " + itemName + " will you need?");
                        int amount = scanner.nextInt();
                        groceryItems.put(itemName, amount);
                        categories.put("Canned Good", groceryItems);
                    }
                    if (category == 6) {
                        System.out.println("Enter the name of the item:");
                        scanner.nextLine();
                        String itemName = scanner.nextLine();
                        System.out.println("How many of " + itemName + " will you need?");
                        int amount = scanner.nextInt();
                        groceryItems.put(itemName, amount);
                        categories.put("Frozen", groceryItems);
                    }
                    if (category == 7) {
                        System.out.println("Enter the name of the item:");
                        scanner.nextLine();
                        String itemName = scanner.nextLine();
                        System.out.println("How many of " + itemName + " will you need?");
                        int amount = scanner.nextInt();
                        groceryItems.put(itemName, amount);
                        categories.put("Boxed Foods", groceryItems);
                    }
                    if (category == 8) {
                        System.out.println("Enter the name of the item:");
                        scanner.nextLine();
                        String itemName = scanner.nextLine();
                        System.out.println("How many of " + itemName + " will you need?");
                        int amount = scanner.nextInt();
                        groceryItems.put(itemName, amount);
                        categories.put("Other", groceryItems);
                    }
                }
                if (decision2.equalsIgnoreCase("n")) {
                    System.out.println(categories);
                    break;
                }
            }
        }
    }
}
