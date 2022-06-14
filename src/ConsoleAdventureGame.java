import java.util.Scanner;

public class ConsoleAdventureGame {

    public static void gameStart() {
        while (true) {
            int heroHealth = 100;
            int mummyHealth = 100;
            int dragonHealth = 100;
            int ogreHealth = 100;
            int potionRemaining = 3;
            int potionIncrease = drinkPotion();
            int armor = wearArmor();
            int armorRemaining = 1;
            String ruins = "ruins";
            String castle = "castle";
            String forest = "forest";
            Scanner scanner = new Scanner(System.in);
            System.out.println("Do you want to start the game? [Y/N]");
            String startGame = scanner.next();
            while (startGame.equalsIgnoreCase("y")) {
                System.out.println("Enter your first name:");
                String playerName = scanner.next();
                System.out.printf("Hello %s!\n", playerName);
                System.out.printf("Where would you like to travel? [%s, %s, or %s]\n", ruins.toUpperCase(), castle.toUpperCase(), forest.toUpperCase());
                String location = scanner.next();
                System.out.printf("%s has chosen to travel to the %s.\n", playerName, location);
                if (location.equalsIgnoreCase("ruins")) {
                    System.out.println("You have encountered a mummy!");
                    System.out.println("Would you like to run or attack? [RUN/ATTACK]");
                    String runOrAttack = scanner.next();
                    if (runOrAttack.equalsIgnoreCase("run")) {
                        System.out.println("You were too afraid to fight. You have dishonored your family.");
                        break;
                    }
                    System.out.println("Would you like to wear your armor? [Y/N]");
                    String wearArmor = scanner.next();
                    if (wearArmor.equalsIgnoreCase("y") && armorRemaining > 0) {
                        heroHealth += armor;
                        armorRemaining--;
                        System.out.printf("Your health has increased to %d. You have %d armor remaining.", heroHealth, armorRemaining);
                    }
                    while (mummyHealth > 0 && heroHealth > 0) {
                        int enemyDamage = mummyAttackPower();
                        int heroDamage = heroAttackPower();
                        mummyHealth -= heroDamage;
                        System.out.printf("You attacked the mummy and dealt %d damage.\n%s's health is %d and the mummy's health is %d.\n", heroDamage, playerName, heroHealth, mummyHealth);
                        if (mummyHealth <= 0) {
                            System.out.println("The mummy has died.");
                            break;
                        }
                        heroHealth -= enemyDamage;
                        System.out.printf("The mummy attacks back and deals %d damage to %s.\n%s has %d health remaining and the mummy has %d health remaining.\n", enemyDamage, playerName, playerName, heroHealth, mummyHealth);
                        while (potionRemaining > 0) {
                            System.out.println("Would you like to drink a potion to increase your health by 5? [Y/N]");
                            String potionDrink = scanner.next();
                            if (potionDrink.equalsIgnoreCase("n")) break;
                            if (potionDrink.equalsIgnoreCase("y")) {
                                heroHealth += potionIncrease;
                                potionRemaining--;
                                System.out.printf("Your health is now %d. You have %d potions remaining.", heroHealth, potionRemaining);
                                break;
                            }
                        }
                        if (heroHealth <= 0) {
                            System.out.printf("%s has died.\n", playerName);
                            break;
                        }
                    }
                }
                if (location.equalsIgnoreCase("castle")) {
                    System.out.println("You have encountered a dragon!");
                    System.out.println("Would you like to run or attack? [RUN/ATTACK]");
                    String runOrAttack = scanner.next();
                    if (runOrAttack.equalsIgnoreCase("run")) {
                        System.out.println("You were to afraid too fight. You have dishonored your family.");
                        break;
                    }
                    System.out.println("Would you like to wear your armor? [Y/N]");
                    String wearArmor = scanner.next();
                    if (wearArmor.equalsIgnoreCase("y") && armorRemaining > 0) {
                        heroHealth += armor;
                        armorRemaining--;
                        System.out.printf("Your health has increased to %d. You have %d armor remaining.", heroHealth, armorRemaining);
                    }
                    while (dragonHealth > 0 && heroHealth > 0) {
                        int enemyDamage = dragonAttackPower();
                        int heroDamage = heroAttackPower();
                        dragonHealth -= heroDamage;
                        System.out.printf("You attacked the dragon and dealt %d damage.\n%s's health is %d and the dragon's health is %d.\n", heroDamage, playerName, heroHealth, dragonHealth);
                        if (dragonHealth <= 0) {
                            System.out.println("The dragon has died.");
                            break;
                        }
                        heroHealth -= enemyDamage;
                        System.out.printf("The dragon attacks back and deals %d damage to %s.\n%s has %d health remaining and the dragon has %d health remaining.\n", enemyDamage, playerName, playerName, heroHealth, dragonHealth);
                        while (potionRemaining > 0) {
                            System.out.println("Would you like to drink a potion to increase your health by 5? [Y/N]");
                            String potionDrink = scanner.next();
                            if (potionDrink.equalsIgnoreCase("n")) break;
                            if (potionDrink.equalsIgnoreCase("y")) {
                                heroHealth += potionIncrease;
                                potionRemaining--;
                                System.out.printf("Your health is now %d. You have %d potions remaining.", heroHealth, potionRemaining);
                                break;
                            }
                        }
                        if (heroHealth <= 0) {
                            System.out.printf("%s has died.\n", playerName);
                            break;
                        }
                    }
                }
                if (location.equalsIgnoreCase("forest")) {
                    System.out.println("You have encountered an ogre!");
                    System.out.println("Would you like to run or attack? [RUN/ATTACK]");
                    String runOrAttack = scanner.next();
                    if (runOrAttack.equalsIgnoreCase("run")) {
                        System.out.println("You were too afraid to fight. You have dishonored your family.");
                        break;
                    }
                    System.out.println("Would you like to wear your armor? [Y/N]");
                    String wearArmor = scanner.next();
                    if (wearArmor.equalsIgnoreCase("y") && armorRemaining > 0) {
                        heroHealth += armor;
                        armorRemaining--;
                        System.out.printf("Your health has increased to %d. You have %d armor remaining.", heroHealth, armorRemaining);
                    }
                    while (ogreHealth > 0 && heroHealth > 0) {
                        int enemyDamage = ogreAttackPower();
                        int heroDamage = heroAttackPower();
                        ogreHealth -= heroDamage;
                        System.out.printf("You attacked the ogre and dealt %d damage.\n%s's health is %d and the ogre's health is %d.\n", heroDamage, playerName, heroHealth, ogreHealth);
                        if (ogreHealth <= 0) {
                            System.out.println("The ogre has died.");
                            break;
                        }
                        heroHealth -= enemyDamage;
                        System.out.printf("The ogre attacks back and deals %d damage to %s.\n%s has %d health remaining and the ogre has %d health remaining.\n", enemyDamage, playerName, playerName, heroHealth, ogreHealth);
                        while (potionRemaining > 0) {
                            System.out.println("Would you like to drink a potion to increase your health by 5? [Y/N]");
                            String potionDrink = scanner.next();
                            if (potionDrink.equalsIgnoreCase("n")) break;
                            if (potionDrink.equalsIgnoreCase("y")) {
                                heroHealth += potionIncrease;
                                potionRemaining--;
                                System.out.printf("Your health is now %d. You have %d potions remaining.", heroHealth, potionRemaining);
                                break;
                            }
                        }
                        if (heroHealth <= 0) {
                            System.out.printf("%s has died.\n", playerName);
                            break;
                        }
                    }
                }
                if (heroHealth <= 0) break;
                if (mummyHealth <= 0) break;
                if (dragonHealth <= 0) break;
                if (ogreHealth <= 0) break;
            }
            System.out.println("Do you want to play again? [Y/N]");
            String playAgain = scanner.next();
            if (playAgain.equalsIgnoreCase("n")) break;
        }
    }

    public static int drinkPotion() {
        int potion = 5;
        return potion;
    }

    public static int mummyAttackPower() {
        int attackPower = (int) (Math.random() * 10) + 1;
        return attackPower;
    }

    public static int ogreAttackPower() {
        int attackPower = (int) (Math.random() * 15) + 1;
        return attackPower;
    }

    public static int dragonAttackPower() {
        int attackPower = (int) (Math.random() * 20) + 1;
        return attackPower;
    }

    public static int heroAttackPower() {
        int attackPower = (int) (Math.random() * 10) + 1;
        return attackPower;
    }

    public static int wearArmor() {
        int armor = 25;
        return armor;
    }

    public static void main(String[] args) {
        gameStart();
    }
}
