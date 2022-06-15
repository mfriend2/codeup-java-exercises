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
                System.out.println("\nEnter your first name:");
                String playerName = scanner.next();
                System.out.printf("\nAll Hail %s! Welcome to the Great Land of Code!\n", playerName);
                System.out.printf("\nWhere would you like to travel? [%s, %s, or %s]\n", ruins.toUpperCase(), castle.toUpperCase(), forest.toUpperCase());
                String location = scanner.next();
                System.out.printf("\n%s has chosen to travel to the %s.\n", playerName, location);
                if (location.equalsIgnoreCase("ruins")) {
                    System.out.println("\n> You encounter a mummy\n");
                    System.out.println("Would you like to run or attack? [RUN/ATTACK]");
                    String runOrAttack = scanner.next();
                    if (runOrAttack.equalsIgnoreCase("run")) {
                        System.out.println("\n> You were too afraid to fight. You have dishonored your family.\n");
                        break;
                    }
                    System.out.println("\nWould you like to wear your armor? [Y/N]");
                    String wearArmor = scanner.next();
                    if (wearArmor.equalsIgnoreCase("y") && armorRemaining > 0) {
                        heroHealth += armor;
                        armorRemaining--;
                        System.out.printf("\n> Your health has increased to %d. You have %d armor remaining.\n", heroHealth, armorRemaining);
                    }
                    while (mummyHealth > 0 && heroHealth > 0) {
                        int enemyDamage = mummyAttackPower();
                        int strongAttack = strongHeroAttackPower();
                        int weakAttack = weakHeroAttackPower();
                        double randomNum = Math.random();
                        if (randomNum > .5) {
                            mummyHealth -= strongAttack;
                            if (mummyHealth <= 0) mummyHealth = 0;
                            System.out.printf("%s swings their sword and deals %d damage.\n", playerName, strongAttack);
                            System.out.println("\n[O\\\\\\\\\\[========================-\n");
                            System.out.printf("> Mummy's health: %d\n", mummyHealth);
                        }
                        if (randomNum < .5) {
                            mummyHealth -= weakAttack;
                            if (mummyHealth <= 0) mummyHealth = 0;
                            System.out.printf("%s shoots a bow and deals %d damage.\n", playerName, weakAttack);
                            System.out.println("\n>>>>>----------------------->\n");
                            System.out.printf("> Mummy's health: %d\n", mummyHealth);
                        }
                        if (mummyHealth <= 0) {
                            System.out.println("\n> The mummy has died.\n");
                            break;
                        }
                        heroHealth -= enemyDamage;
                        if (heroHealth <= 0) heroHealth = 0;
                        System.out.printf("\nMummy attacks back and deals %d damage.\n\n> %s's health: %d\n\n", enemyDamage, playerName, heroHealth);
                        while (potionRemaining > 0 && mummyHealth > heroHealth) {
                            System.out.println("\nWould you like to drink a potion to increase your health by 5? [Y/N]\n");
                            String potionDrink = scanner.next();
                            if (potionDrink.equalsIgnoreCase("n")) break;
                            if (potionDrink.equalsIgnoreCase("y")) {
                                heroHealth += potionIncrease;
                                potionRemaining--;
                                System.out.printf("\n> Your health is now %d. You have %d potions remaining.\n", heroHealth, potionRemaining);
                                break;
                            }
                        }
                        if (heroHealth <= 0) {
                            System.out.printf("\n> %s has died.\n", playerName);
                            break;
                        }
                    }
                }
                if (location.equalsIgnoreCase("castle")) {
                    System.out.println("\n> You encounter a dragon\n");
                    System.out.println("Would you like to run or attack? [RUN/ATTACK]");
                    String runOrAttack = scanner.next();
                    if (runOrAttack.equalsIgnoreCase("run")) {
                        System.out.println("\n> You were to afraid too fight. You have dishonored your family.\n");
                        break;
                    }
                    System.out.println("\nWould you like to wear your armor? [Y/N]");
                    String wearArmor = scanner.next();
                    if (wearArmor.equalsIgnoreCase("y") && armorRemaining > 0) {
                        heroHealth += armor;
                        armorRemaining--;
                        System.out.printf("\n> Your health has increased to %d. You have %d armor remaining.\n", heroHealth, armorRemaining);
                    }
                    while (dragonHealth > 0 && heroHealth > 0) {
                        int enemyDamage = dragonAttackPower();
                        int strongAttack = strongHeroAttackPower();
                        int weakAttack = weakHeroAttackPower();
                        double randomNum = Math.random();
                        if (randomNum > .5) {
                            dragonHealth -= strongAttack;
                            if (dragonHealth <= 0) dragonHealth = 0;
                            System.out.printf("%s swings their sword and deals %d damage.\n", playerName, strongAttack);
                            System.out.println("\n[O\\\\\\\\\\[========================-\n");
                            System.out.printf("> Dragon's health: %d\n", dragonHealth);
                        }
                        if (randomNum < .5) {
                            dragonHealth -= weakAttack;
                            if (dragonHealth <= 0) dragonHealth = 0;
                            System.out.printf("%s shoots a bow and deals %d damage.\n", playerName, weakAttack);
                            System.out.println("\n>>>>>----------------------->\n");
                            System.out.printf("> Dragon's health: %d\n", dragonHealth);
                        }
                        if (dragonHealth <= 0) {
                            System.out.println("\n> The dragon has died.\n");
                            break;
                        }
                        heroHealth -= enemyDamage;
                        if (heroHealth <= 0) heroHealth = 0;
                        System.out.printf("\nThe dragon attacks back and deals %d damage.\n\n> %s's health: %d\n\n", enemyDamage, playerName, heroHealth);
                        while (potionRemaining > 0 && dragonHealth > heroHealth) {
                            System.out.println("\nWould you like to drink a potion to increase your health by 5? [Y/N]");
                            String potionDrink = scanner.next();
                            if (potionDrink.equalsIgnoreCase("n")) break;
                            if (potionDrink.equalsIgnoreCase("y")) {
                                heroHealth += potionIncrease;
                                potionRemaining--;
                                System.out.printf("\n> Your health is now %d. You have %d potions remaining.\n", heroHealth, potionRemaining);
                                break;
                            }
                        }
                        if (heroHealth <= 0) {
                            System.out.printf("\n> %s has died.\n", playerName);
                            break;
                        }
                    }
                }
                if (location.equalsIgnoreCase("forest")) {
                    System.out.println("\n> You encounter an ogre");
                    System.out.println("\nWould you like to run or attack? [RUN/ATTACK]");
                    String runOrAttack = scanner.next();
                    if (runOrAttack.equalsIgnoreCase("run")) {
                        System.out.println("\n> You were too afraid to fight. You have dishonored your family.\n");
                        break;
                    }
                    System.out.println("\nWould you like to wear your armor? [Y/N]");
                    String wearArmor = scanner.next();
                    if (wearArmor.equalsIgnoreCase("y") && armorRemaining > 0) {
                        heroHealth += armor;
                        armorRemaining--;
                        System.out.printf("\n> Your health has increased to %d. You have %d armor remaining.\n", heroHealth, armorRemaining);
                    }
                    while (ogreHealth > 0 && heroHealth > 0) {
                        int enemyDamage = ogreAttackPower();
                        int strongAttack = strongHeroAttackPower();
                        int weakAttack = weakHeroAttackPower();
                        double randomNum = Math.random();
                        if (randomNum > .5) {
                            ogreHealth -= strongAttack;
                            if (ogreHealth <= 0) ogreHealth = 0;
                            System.out.printf("%s swings their sword and deals %d damage.\n", playerName, strongAttack);
                            System.out.println("\n[O\\\\\\\\\\[========================-\n");
                            System.out.printf("> Ogre's health: %d\n", ogreHealth);
                        }
                        if (randomNum < .5) {
                            ogreHealth -= weakAttack;
                            if (ogreHealth <= 0) ogreHealth = 0;
                            System.out.printf("%s shoots a bow and deals %d damage.\n", playerName, weakAttack);
                            System.out.println("\n>>>>>----------------------->\n");
                            System.out.printf("> Ogre's health: %d\n", ogreHealth);
                        }
                        if (ogreHealth <= 0) {
                            System.out.println("\n> The ogre has died.\n");
                            break;
                        }
                        heroHealth -= enemyDamage;
                        if (heroHealth <= 0) heroHealth = 0;
                        System.out.printf("\nThe ogre attacks back and deals %d damage.\n\n> %s's health: %d\n\n", enemyDamage, playerName, heroHealth);
                        while (potionRemaining > 0 && ogreHealth > heroHealth) {
                            System.out.println("\nWould you like to drink a potion to increase your health by 5? [Y/N]");
                            String potionDrink = scanner.next();
                            if (potionDrink.equalsIgnoreCase("n")) break;
                            if (potionDrink.equalsIgnoreCase("y")) {
                                heroHealth += potionIncrease;
                                potionRemaining--;
                                System.out.printf("\n> Your health is now %d. You have %d potions remaining.\n", heroHealth, potionRemaining);
                                break;
                            }
                        }
                        if (heroHealth <= 0) {
                            System.out.printf("\n> %s has died.\n", playerName);
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

    public static int weakHeroAttackPower() {
        int attackPower = (int) (Math.random() * 10) + 1;
        return attackPower;
    }

    public static int strongHeroAttackPower() {
        int attackPower = (int) (Math.random() * 11) + 10;
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
