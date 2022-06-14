import java.util.Scanner;

public class ConsoleAdventureGame {

    public static void gameStart() {
        int heroHealth = 100;
        int mummyHealth = 100;
        String ruins = "ruins";
        String castle = "castle";
        String forest = "forest";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you want to start the game? [Y/N]");
        String startGame = scanner.next();
        do {
            System.out.println("Enter your first name:");
            String playerName = scanner.next();
            System.out.printf("Hello %s!\n", playerName);
            System.out.printf("Where would you like to travel? [The %s, the %s, or the %s]\n", ruins, castle, forest);
            String location = scanner.next();
            System.out.printf("%s has chosen to travel to the %s.\n", playerName, location);
            if (location.equalsIgnoreCase("ruins")) {
                System.out.println("You have encountered a mummy!");
                System.out.println("Would you like to run or attack? [RUN/ATTACK]");
                String runOrAttack = scanner.next();
                if (runOrAttack.equalsIgnoreCase("run")) break;
                while (mummyHealth > 0 && heroHealth > 0) {
                    int enemyDamage = enemyAttackPower();
                    int heroDamage = heroAttackPower();
                    mummyHealth -= heroDamage;
                    System.out.printf("You attacked the mummy and dealt %d damage. %s's health is %d the mummy's health is %d.\n", heroDamage, playerName, heroHealth, mummyHealth);
                    if (mummyHealth <= 0) {
                        System.out.println("The mummy has died.");
                        break;
                    }
                    heroHealth -= enemyDamage;
                    System.out.printf("The mummy attacks back and deals %d damage to %s. %s has %d health remaining and the mummy has %d health remaining.\n", enemyDamage, playerName, playerName, heroHealth, mummyHealth);
                    if (heroHealth <= 0) {
                        System.out.printf("%s has died.\n", playerName);
                        break;
                    }
                }
            }
            if (heroHealth <= 0) break;
            if (mummyHealth <= 0) break;
        } while (startGame.equalsIgnoreCase("y"));
    }

    public static int enemyAttackPower() {
        int attackPower = (int) (Math.random() * 10) + 1;
        return attackPower;
    }

    public static int heroAttackPower() {
        int attackPower = (int) (Math.random() * 10) + 1;
        return attackPower;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        gameStart();
    }
}
