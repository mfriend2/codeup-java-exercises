public class MethodsPractice {
    public static int getDifference(int a, int b) {
        if (a > b) {
            return a-b;
        } else {
            return b - a;
        }
    }

    public static void main(String[] args) {
        System.out.println(getDifference(23, 45));
    }
}
