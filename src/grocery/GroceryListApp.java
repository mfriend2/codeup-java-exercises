package grocery;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class GroceryListApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Would you like to create a grocery list? [Y/N]");
        String decision = scanner.next();
        HashMap<String, ArrayList<GroceryItem>> categories = new HashMap();
        ArrayList<GroceryItem> fruits = new ArrayList<>();
        ArrayList<GroceryItem> vegetables = new ArrayList<>();
        ArrayList<GroceryItem> dairy = new ArrayList<>();
        ArrayList<GroceryItem> meats = new ArrayList<>();
        ArrayList<GroceryItem> cannedGoods = new ArrayList<>();
        ArrayList<GroceryItem> frozens = new ArrayList<>();
        ArrayList<GroceryItem> boxedFood = new ArrayList<>();
        ArrayList<GroceryItem> others = new ArrayList<>();
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
                        GroceryItem newItem = new GroceryItem(itemName, amount, "Fruits");
                        fruits.add(newItem);
                        categories.put("Fruit", fruits);
                    }
                    if (category == 2) {
                        System.out.println("Enter the name of the item:");
                        scanner.nextLine();
                        String itemName = scanner.nextLine();
                        System.out.println("How many of " + itemName + " will you need?");
                        int amount = scanner.nextInt();
                        GroceryItem newItem = new GroceryItem(itemName, amount, "Vegetables");
                        vegetables.add(newItem);
                        categories.put("Vegetables", vegetables);
                    }
                    if (category == 3) {
                        System.out.println("Enter the name of the item:");
                        scanner.nextLine();
                        String itemName = scanner.nextLine();
                        System.out.println("How many of " + itemName + " will you need?");
                        int amount = scanner.nextInt();
                        GroceryItem newItem = new GroceryItem(itemName, amount, "Dairy");
                        dairy.add(newItem);
                        categories.put("Dairy", dairy);
                    }
                    if (category == 4) {
                        System.out.println("Enter the name of the item:");
                        scanner.nextLine();
                        String itemName = scanner.nextLine();
                        System.out.println("How many of " + itemName + " will you need?");
                        int amount = scanner.nextInt();
                        GroceryItem newItem = new GroceryItem(itemName, amount, "Meats");
                        meats.add(newItem);
                        categories.put("Meats", meats);
                    }
                    if (category == 5) {
                        System.out.println("Enter the name of the item:");
                        scanner.nextLine();
                        String itemName = scanner.nextLine();
                        System.out.println("How many of " + itemName + " will you need?");
                        int amount = scanner.nextInt();
                        GroceryItem newItem = new GroceryItem(itemName, amount, "Canned Goods");
                        cannedGoods.add(newItem);
                        categories.put("Canned Goods", cannedGoods);
                    }
                    if (category == 6) {
                        System.out.println("Enter the name of the item:");
                        scanner.nextLine();
                        String itemName = scanner.nextLine();
                        System.out.println("How many of " + itemName + " will you need?");
                        int amount = scanner.nextInt();
                        GroceryItem newItem = new GroceryItem(itemName, amount, "Frozen");
                        frozens.add(newItem);
                        categories.put("Frozen", frozens);
                    }
                    if (category == 7) {
                        System.out.println("Enter the name of the item:");
                        scanner.nextLine();
                        String itemName = scanner.nextLine();
                        System.out.println("How many of " + itemName + " will you need?");
                        int amount = scanner.nextInt();
                        GroceryItem newItem = new GroceryItem(itemName, amount, "Boxed Food");
                        boxedFood.add(newItem);
                        categories.put("Boxed Food", boxedFood);
                    }
                    if (category == 8) {
                        System.out.println("Enter the name of the item:");
                        scanner.nextLine();
                        String itemName = scanner.nextLine();
                        System.out.println("How many of " + itemName + " will you need?");
                        int amount = scanner.nextInt();
                        GroceryItem newItem = new GroceryItem(itemName, amount, "Other");
                        others.add(newItem);
                        categories.put("Other", others);
                    }
                }
                if (decision2.equalsIgnoreCase("n")) {
                    for (ArrayList<GroceryItem> value : categories.values()) {
                        for (GroceryItem groceryItem : value) {
                            System.out.println(groceryItem.getCategory() + " - " + groceryItem.getName() + " - " + groceryItem.getQuantity());
                        }
                    }
                    break;
                }
            }
        }
    }
}
