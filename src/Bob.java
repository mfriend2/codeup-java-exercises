import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Say something to Bob!");
        String statement = scanner.nextLine();
        String response = "";
        if (statement.endsWith("?")) System.out.println(response = "Sure");
        else if (statement.endsWith("!")) System.out.println(response = "Whoa, chill out!");
        else if (statement.equals("")) System.out.println(response = "Fine. Be that way!");
        else System.out.println(response = "Whatever.");
    }
}
