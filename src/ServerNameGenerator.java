public class ServerNameGenerator {

    public static String randomEl(String[] str) {
        int randomNum = (int) (Math.random() * (str.length - 1));
        return str[randomNum];
    }

    public static void nameGenerator(String[] str1, String[] str2) {
        System.out.printf("Here is your server name:%n%s-%s%n",randomEl(str1), randomEl(str2));
    }

    public static void main(String[] args) {

        String[] adj = {"adorable", "agreeable", "alert", "amused", "annoying", "angry", "anxious", "arrogant", "attractive", "average"};
        String[] nouns = {"actor", "airport", "ambulance", "army", "balloon", "helmet", "holiday", "school", "horse", "house"};
//        System.out.println(randomEl(adj));
//        System.out.println(randomEl(nouns));
//        System.out.println(nouns.length - 1);
//        System.out.println(adj.length - 1);
        nameGenerator(adj, nouns);
    }
}
