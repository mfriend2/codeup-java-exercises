package grades;

import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Student> students = new HashMap<>();
        Student augh = new Student("Aughinique");
        Student nono = new Student("Noelle");
        Student ange = new Student("Angelique");
        Student steph = new Student("Stephanie");
        augh.addGrade(80);
        augh.addGrade(85);
        augh.addGrade(90);
        nono.addGrade(70);
        nono.addGrade(75);
        nono.addGrade(80);
        ange.addGrade(90);
        ange.addGrade(95);
        ange.addGrade(100);
        steph.addGrade(95);
        steph.addGrade(97);
        steph.addGrade(98);
        students.put("aughcodeup", augh);
        students.put("nonocodeup", nono);
        students.put("angecodeup", ange);
        students.put("stephcodeup", steph);

        while (true) {
            students.forEach((key, value) -> {
                System.out.printf("| %s | ", key);
            });
            System.out.println("\n");
            System.out.println("Which student would you like to know more about?");
            String chooseStudent = scanner.next();
            if (students.containsKey(chooseStudent) == false) {
                System.err.println("That user does not exist.");
            }
            if (students.containsKey(chooseStudent) == true) {
                System.out.printf("%n> Name: %s%n> Grade Average: %.2f%n", students.get(chooseStudent).getName(), students.get(chooseStudent).getGradeAverage());
            }
            System.out.println("\nWould you like to continue? [Y/N]");
            String decision = scanner.next();
            if (decision.equalsIgnoreCase("n")) break;
        }

    }
}
