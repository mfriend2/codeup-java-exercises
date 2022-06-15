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
                System.out.println("\nEnter your name:");
                String playerName = scanner.next();
                System.out.printf("\nAll Hail %s! Welcome to the Great Land of Code!\n", playerName);
                System.out.printf("\nWhere would you like to travel? [%s, %s, or %s]\n", ruins.toUpperCase(), castle.toUpperCase(), forest.toUpperCase());
                String location = scanner.next();
                System.out.printf("\n%s has chosen to travel to the %s.\n", playerName, location);

                // MUMMY FIGHT BEGINS

                if (location.equalsIgnoreCase("ruins")) {
                    System.out.println("\n> You encounter a mummy\n");
                    System.out.println("Would you like to run or attack? [RUN/ATTACK]");
                    String runOrAttack = scanner.next();
                    if (runOrAttack.equalsIgnoreCase("run")) {
                        System.out.println(ANSI_RED + "\n> You were too afraid to fight. You have dishonored your family.\n" + ANSI_RESET);
                        break;
                    }

                    // ARMOR CODE

                    System.out.println("\nWould you like to wear your armor? [Y/N]");
                    String wearArmor = scanner.next();
                    if (wearArmor.equalsIgnoreCase("y") && armorRemaining > 0) {
                        heroHealth += armor;
                        armorRemaining--;
                        System.out.printf("\n> Your health has increased to " + ANSI_GREEN + "%d." + ANSI_RESET + " You have " + ANSI_RED + "%d" + ANSI_RESET + " armor remaining.\n\n", heroHealth, armorRemaining);
                    }

                    // ATTACK SEQUENCES

                    while (mummyHealth > 0 && heroHealth > 0) {
                        int enemyDamage = mummyAttackPower();
                        int strongAttack = strongHeroAttackPower();
                        int weakAttack = weakHeroAttackPower();
                        double randomNum = Math.random();
                        if (randomNum > .5) {
                            mummyHealth -= strongAttack;
                            if (mummyHealth <= 0) mummyHealth = 0;
                            System.out.printf("%s swings their sword and deals " + ANSI_BLUE + "%d" + ANSI_RESET + " damage.\n", playerName, strongAttack);
                            System.out.println("\n[O\\\\\\\\\\[========================-\n");
                            System.out.printf("> Mummy's health: " + ANSI_RED + "%d" + ANSI_RESET + "\n", mummyHealth);
                        }
                        if (randomNum < .5) {
                            mummyHealth -= weakAttack;
                            if (mummyHealth <= 0) mummyHealth = 0;
                            System.out.printf("%s shoots a bow and deals " + ANSI_BLUE + "%d" + ANSI_RESET + " damage.\n", playerName, weakAttack);
                            System.out.println("\n>>>>>----------------------->\n");
                            System.out.printf("> Mummy's health: " + ANSI_RED + "%d" + ANSI_RESET + "\n", mummyHealth);
                        }
                        if (mummyHealth <= 0) {
                            System.out.println(ANSI_RED + "\n> You killed the mummy.\n" + ANSI_RESET);
                            System.out.println("                                                       |\n" +
                                    "                                                        \\.\n" +
                                    "                                                        /|.\n" +
                                    "                                                      /  `|.\n" +
                                    "                                                    /     |.\n" +
                                    "                                                  /       |.\n" +
                                    "                                                /         `|.\n" +
                                    "                                              /            |.\n" +
                                    "                                            /              |.\n" +
                                    "                                          /                |.\n" +
                                    "     __                                 /                  `|.\n" +
                                    "      -\\                              /                     |.\n" +
                                    "        \\\\                          /                       |.\n" +
                                    "          \\\\                      /                         |.\n" +
                                    "           \\|                   /                           |\\\n" +
                                    "             \\#####\\          /                             ||\n" +
                                    "         ==###########>     /                               ||\n" +
                                    "          \\##==      \\    /                                 ||\n" +
                                    "     ______ =       =|__/___                                ||\n" +
                                    " ,--' ,----`-,__ ___/'  --,-`-==============================##==========>\n" +
                                    "\\               '        ##_______ ______   ______,--,____,=##,__\n" +
                                    " `,    __==    ___,-,__,--'#'  ==='      `-'              | ##,-/\n" +
                                    "   `-,____,---'       \\####\\              |        ____,--\\_##,/\n" +
                                    "       #_              |##   \\  _____,---==,__,---'         ##\n" +
                                    "        #              ]===--==\\                            ||\n" +
                                    "        #,             ]         \\                          ||\n" +
                                    "         #_            |           \\                        ||\n" +
                                    "          ##_       __/'             \\                      ||\n" +
                                    "           ####='     |                \\                    |/\n" +
                                    "            ###       |                  \\                  |.\n" +
                                    "            ##       _'                    \\                |.\n" +
                                    "           ###=======]                       \\              |.\n" +
                                    "          ///        |                         \\           ,|.\n" +
                                    "          //         |                           \\         |.\n" +
                                    "                                                   \\      ,|.\n" +
                                    "                                                     \\    |.\n" +
                                    "                                                       \\  |.\n" +
                                    "                                                         \\|.\n" +
                                    "                                                         /.\n" +
                                    "                                                        |");
                            break;
                        }
                        heroHealth -= enemyDamage;
                        if (heroHealth <= 0) heroHealth = 0;
                        System.out.printf("\nMummy attacks back and deals " + ANSI_PURPLE + "%d" + ANSI_RESET + " damage.\n\n> %s's health: " + ANSI_RED + "%d" + ANSI_RESET + "\n\n", enemyDamage, playerName, heroHealth);
                        while (potionRemaining > 0 && mummyHealth > heroHealth && heroHealth > 0) {
                            System.out.println("\nWould you like to drink a potion to increase your health by 5? [Y/N]\n");
                            String potionDrink = scanner.next();
                            if (potionDrink.equalsIgnoreCase("n")) break;
                            if (potionDrink.equalsIgnoreCase("y")) {
                                heroHealth += potionIncrease;
                                potionRemaining--;
                                System.out.printf("\n> Your health is now " + ANSI_GREEN + "%d" + ANSI_RESET + ". You have " + ANSI_RED + "%d" + ANSI_RESET + " potion remaining.\n\n", heroHealth, potionRemaining);
                                break;
                            }
                        }
                        if (heroHealth <= 0) {
                            System.out.printf(ANSI_RED + "\n> %s has died.\n" + ANSI_RESET, playerName);
                            System.out.println("...\n" +
                                    "             ;::::;\n" +
                                    "           ;::::; :;\n" +
                                    "         ;:::::'   :;\n" +
                                    "        ;:::::;     ;.\n" +
                                    "       ,:::::'       ;           OOO\\\n" +
                                    "       ::::::;       ;          OOOOO\\\n" +
                                    "       ;:::::;       ;         OOOOOOOO\n" +
                                    "      ,;::::::;     ;'         / OOOOOOO\n" +
                                    "    ;:::::::::`. ,,,;.        /  / DOOOOOO\n" +
                                    "  .';:::::::::::::::::;,     /  /     DOOOO\n" +
                                    " ,::::::;::::::;;;;::::;,   /  /        DOOO\n" +
                                    ";`::::::`'::::::;;;::::: ,#/  /          DOOO\n" +
                                    ":`:::::::`;::::::;;::: ;::#  /            DOOO\n" +
                                    "::`:::::::`;:::::::: ;::::# /              DOO\n" +
                                    "`:`:::::::`;:::::: ;::::::#/               DOO\n" +
                                    " :::`:::::::`;; ;:::::::::##                OO\n" +
                                    " ::::`:::::::`;::::::::;:::#                OO\n" +
                                    " `:::::`::::::::::::;'`:;::#                O\n" +
                                    "  `:::::`::::::::;' /  / `:#\n" +
                                    "   ::::::`:::::;'  /  /   `#");
                            break;
                        }
                    }
                }

                // DRAGON FIGHT BEGINS

                if (location.equalsIgnoreCase("castle")) {
                    System.out.println("\n> You encounter a dragon\n");
                    System.out.println("Would you like to run or attack? [RUN/ATTACK]");
                    String runOrAttack = scanner.next();
                    if (runOrAttack.equalsIgnoreCase("run")) {
                        System.out.println(ANSI_RED + "\n> You were too afraid to fight. You have dishonored your family.\n" + ANSI_RESET);
                        break;
                    }

                    // ARMOR CODE

                    System.out.println("\nWould you like to wear your armor? [Y/N]");
                    String wearArmor = scanner.next();
                    if (wearArmor.equalsIgnoreCase("y") && armorRemaining > 0) {
                        heroHealth += armor;
                        armorRemaining--;
                        System.out.printf("\n> Your health has increased to " + ANSI_GREEN + "%d." + ANSI_RESET + " You have " + ANSI_RED + "%d" + ANSI_RESET + " armor remaining.\n\n", heroHealth, armorRemaining);
                    }

                    // ATTACK SEQUENCES

                    while (dragonHealth > 0 && heroHealth > 0) {
                        int enemyDamage = dragonAttackPower();
                        int strongAttack = strongHeroAttackPower();
                        int weakAttack = weakHeroAttackPower();
                        double randomNum = Math.random();
                        if (randomNum > .5) {
                            dragonHealth -= strongAttack;
                            if (dragonHealth <= 0) dragonHealth = 0;
                            System.out.printf("%s swings their sword and deals " + ANSI_BLUE + "%d" + ANSI_RESET + " damage.\n", playerName, strongAttack);
                            System.out.println("\n[O\\\\\\\\\\[========================-\n");
                            System.out.printf("> Dragon's health: " + ANSI_RED + "%d" + ANSI_RESET + "\n", dragonHealth);
                        }
                        if (randomNum < .5) {
                            dragonHealth -= weakAttack;
                            if (dragonHealth <= 0) dragonHealth = 0;
                            System.out.printf("%s shoots a bow and deals " + ANSI_BLUE + "%d" + ANSI_RESET + " damage.\n", playerName, weakAttack);
                            System.out.println("\n>>>>>----------------------->\n");
                            System.out.printf("> Dragon's health: " + ANSI_RED + "%d" + ANSI_RESET + "\n", dragonHealth);
                        }
                        if (dragonHealth <= 0) {
                            System.out.println(ANSI_RED + "\n> You slayed the dragon.\n" + ANSI_RESET);
                            System.out.println("  _,.\n" +
                                    "    ,` -.)\n" +
                                    "   ( _/-\\\\-._\n" +
                                    "  /,|`--._,-^|            ,\n" +
                                    "  \\_| |`-._/||          ,'|\n" +
                                    "    |  `-, / |         /  /\n" +
                                    "    |     || |        /  /\n" +
                                    "     `r-._||/   __   /  /\n" +
                                    " __,-<_     )`-/  `./  /\n" +
                                    "'  \\   `---'   \\   /  /\n" +
                                    "    |           |./  /\n" +
                                    "    /           //  /\n" +
                                    "\\_/' \\         |/  /\n" +
                                    " |    |   _,^-'/  /\n" +
                                    " |    , ``  (\\/  /_\n" +
                                    "  \\,.->._    \\X-=/^\n" +
                                    "  (  /   `-._//^`\n" +
                                    "   `Y-.____(__}\n" +
                                    "    |     {__)\n" +
                                    "          ()");
                            break;
                        }
                        heroHealth -= enemyDamage;
                        if (heroHealth <= 0) heroHealth = 0;
                        System.out.printf("\nDragon attacks back and deals " + ANSI_PURPLE + "%d" + ANSI_RESET + " damage.\n\n> %s's health: " + ANSI_RED + "%d" + ANSI_RESET + "\n\n", enemyDamage, playerName, heroHealth);
                        while (potionRemaining > 0 && dragonHealth > heroHealth && heroHealth > 0) {
                            System.out.println("\nWould you like to drink a potion to increase your health by 5? [Y/N]");
                            String potionDrink = scanner.next();
                            if (potionDrink.equalsIgnoreCase("n")) break;
                            if (potionDrink.equalsIgnoreCase("y")) {
                                heroHealth += potionIncrease;
                                potionRemaining--;
                                System.out.printf("\n> Your health is now " + ANSI_GREEN + "%d" + ANSI_RESET + ". You have " + ANSI_RED + "%d" + ANSI_RESET + " potion remaining.\n\n", heroHealth, potionRemaining);
                                break;
                            }
                        }
                        if (heroHealth <= 0) {
                            System.out.printf(ANSI_RED + "\n> %s has died.\n" + ANSI_RESET, playerName);
                            System.out.println("...\n" +
                                    "             ;::::;\n" +
                                    "           ;::::; :;\n" +
                                    "         ;:::::'   :;\n" +
                                    "        ;:::::;     ;.\n" +
                                    "       ,:::::'       ;           OOO\\\n" +
                                    "       ::::::;       ;          OOOOO\\\n" +
                                    "       ;:::::;       ;         OOOOOOOO\n" +
                                    "      ,;::::::;     ;'         / OOOOOOO\n" +
                                    "    ;:::::::::`. ,,,;.        /  / DOOOOOO\n" +
                                    "  .';:::::::::::::::::;,     /  /     DOOOO\n" +
                                    " ,::::::;::::::;;;;::::;,   /  /        DOOO\n" +
                                    ";`::::::`'::::::;;;::::: ,#/  /          DOOO\n" +
                                    ":`:::::::`;::::::;;::: ;::#  /            DOOO\n" +
                                    "::`:::::::`;:::::::: ;::::# /              DOO\n" +
                                    "`:`:::::::`;:::::: ;::::::#/               DOO\n" +
                                    " :::`:::::::`;; ;:::::::::##                OO\n" +
                                    " ::::`:::::::`;::::::::;:::#                OO\n" +
                                    " `:::::`::::::::::::;'`:;::#                O\n" +
                                    "  `:::::`::::::::;' /  / `:#\n" +
                                    "   ::::::`:::::;'  /  /   `#");
                            break;
                        }
                    }
                }

                // OGRE FIGHT BEGINS

                if (location.equalsIgnoreCase("forest")) {
                    System.out.println("\n> You encounter an ogre");
                    System.out.println("\nWould you like to run or attack? [RUN/ATTACK]");
                    String runOrAttack = scanner.next();
                    if (runOrAttack.equalsIgnoreCase("run")) {
                        System.out.println(ANSI_RED + "\n> You were too afraid to fight. You have dishonored your family.\n" + ANSI_RESET);
                        break;
                    }

                    // ARMOR CODE

                    System.out.println("\nWould you like to wear your armor? [Y/N]");
                    String wearArmor = scanner.next();
                    if (wearArmor.equalsIgnoreCase("y") && armorRemaining > 0) {
                        heroHealth += armor;
                        armorRemaining--;
                        System.out.printf("\n> Your health has increased to " + ANSI_GREEN + "%d." + ANSI_RESET + " You have " + ANSI_RED + "%d" + ANSI_RESET + " armor remaining.\n\n", heroHealth, armorRemaining);
                    }

                    // ATTACK SEQUENCES

                    while (ogreHealth > 0 && heroHealth > 0) {
                        int enemyDamage = ogreAttackPower();
                        int strongAttack = strongHeroAttackPower();
                        int weakAttack = weakHeroAttackPower();
                        double randomNum = Math.random();
                        if (randomNum > .5) {
                            ogreHealth -= strongAttack;
                            if (ogreHealth <= 0) ogreHealth = 0;
                            System.out.printf("%s swings their sword and deals " + ANSI_BLUE + "%d" + ANSI_RESET + " damage.\n", playerName, strongAttack);
                            System.out.println("\n[O\\\\\\\\\\[========================-\n");
                            System.out.printf("> Ogre's health: " + ANSI_RED + "%d" + ANSI_RESET + "\n", ogreHealth);
                        }
                        if (randomNum < .5) {
                            ogreHealth -= weakAttack;
                            if (ogreHealth <= 0) ogreHealth = 0;
                            System.out.printf("%s shoots a bow and deals " + ANSI_BLUE + "%d" + ANSI_RESET + " damage.\n", playerName, weakAttack);
                            System.out.println("\n>>>>>----------------------->\n");
                            System.out.printf("> Ogre's health: " + ANSI_RED + "%d" + ANSI_RESET + "\n", ogreHealth);
                        }
                        if (ogreHealth <= 0) {
                            System.out.println(ANSI_RED + "\n> You killed the ogre.\n" + ANSI_RESET);
                            System.out.println("  _,.\n" +
                                    "    ,` -.)\n" +
                                    "   ( _/-\\\\-._\n" +
                                    "  /,|`--._,-^|            ,\n" +
                                    "  \\_| |`-._/||          ,'|\n" +
                                    "    |  `-, / |         /  /\n" +
                                    "    |     || |        /  /\n" +
                                    "     `r-._||/   __   /  /\n" +
                                    " __,-<_     )`-/  `./  /\n" +
                                    "'  \\   `---'   \\   /  /\n" +
                                    "    |           |./  /\n" +
                                    "    /           //  /\n" +
                                    "\\_/' \\         |/  /\n" +
                                    " |    |   _,^-'/  /\n" +
                                    " |    , ``  (\\/  /_\n" +
                                    "  \\,.->._    \\X-=/^\n" +
                                    "  (  /   `-._//^`\n" +
                                    "   `Y-.____(__}\n" +
                                    "    |     {__)\n" +
                                    "          ()");
                            break;
                        }
                        heroHealth -= enemyDamage;
                        if (heroHealth <= 0) heroHealth = 0;
                        System.out.printf("\nOgre attacks back and deals " + ANSI_PURPLE + "%d" + ANSI_RESET + " damage.\n\n> %s's health: " + ANSI_RED + "%d" + ANSI_RESET + "\n\n", enemyDamage, playerName, heroHealth);
                        while (potionRemaining > 0 && ogreHealth > heroHealth && heroHealth > 0) {
                            System.out.println("\nWould you like to drink a potion to increase your health by 5? [Y/N]");
                            String potionDrink = scanner.next();
                            if (potionDrink.equalsIgnoreCase("n")) break;
                            if (potionDrink.equalsIgnoreCase("y")) {
                                heroHealth += potionIncrease;
                                potionRemaining--;
                                System.out.printf("\n> Your health is now " + ANSI_GREEN + "%d" + ANSI_RESET + ". You have " + ANSI_RED + "%d" + ANSI_RESET + " potion remaining.\n\n", heroHealth, potionRemaining);
                                break;
                            }
                        }
                        if (heroHealth <= 0) {
                            System.out.printf(ANSI_RED + "\n> %s has died.\n" + ANSI_RESET, playerName);
                            System.out.println("...\n" +
                                    "             ;::::;\n" +
                                    "           ;::::; :;\n" +
                                    "         ;:::::'   :;\n" +
                                    "        ;:::::;     ;.\n" +
                                    "       ,:::::'       ;           OOO\\\n" +
                                    "       ::::::;       ;          OOOOO\\\n" +
                                    "       ;:::::;       ;         OOOOOOOO\n" +
                                    "      ,;::::::;     ;'         / OOOOOOO\n" +
                                    "    ;:::::::::`. ,,,;.        /  / DOOOOOO\n" +
                                    "  .';:::::::::::::::::;,     /  /     DOOOO\n" +
                                    " ,::::::;::::::;;;;::::;,   /  /        DOOO\n" +
                                    ";`::::::`'::::::;;;::::: ,#/  /          DOOO\n" +
                                    ":`:::::::`;::::::;;::: ;::#  /            DOOO\n" +
                                    "::`:::::::`;:::::::: ;::::# /              DOO\n" +
                                    "`:`:::::::`;:::::: ;::::::#/               DOO\n" +
                                    " :::`:::::::`;; ;:::::::::##                OO\n" +
                                    " ::::`:::::::`;::::::::;:::#                OO\n" +
                                    " `:::::`::::::::::::;'`:;::#                O\n" +
                                    "  `:::::`::::::::;' /  / `:#\n" +
                                    "   ::::::`:::::;'  /  /   `#");
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
        int attackPower = (int) (Math.random() * 6) + 10;
        return attackPower;
    }

    public static int wearArmor() {
        int armor = 25;
        return armor;
    }

    public static final String ANSI_RESET = "\u001B[0m";

    public static final String ANSI_RED = "\u001B[31m";

    public static final String ANSI_GREEN = "\u001B[32m";

    public static final String ANSI_BLUE = "\u001B[34m";

    public static final String ANSI_PURPLE = "\u001B[35m";

    public static void main(String[] args) {
        gameStart();
    }
}
