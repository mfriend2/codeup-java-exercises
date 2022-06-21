package grades;

import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {
    static HashMap<String, Student> students = new HashMap<>();

    static double classAverage() {
        double sum = 0;
        for (Student value : students.values()) {
            sum += value.getGradeAverage();
        }
        return sum / students.size();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
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
            System.out.printf("| average | ");
            System.out.printf("| csv | ");
            System.out.printf("| all | ");
            System.out.println("\n");
            System.out.println("Which student would you like to know more about?");
            String chooseStudent = scanner.next();

            if (chooseStudent.equalsIgnoreCase("all")) {
                students.forEach((key, value) -> {
                    System.out.printf(value.getName() + ": " + value.getGrades() + "%n");
                });
            } else if (chooseStudent.equalsIgnoreCase("average")) {
                System.out.printf("The class average is %.2f%n", classAverage());
            } else if (chooseStudent.equalsIgnoreCase("csv")) {
                students.forEach((k, v) -> {
                    System.out.printf("%s, %s, %.2f%n", v.getName(), k, v.getGradeAverage());
                });
            } else if (students.containsKey(chooseStudent) == true) {
                System.out.printf("%n> Name: %s%n> Grade Average: %.2f%n> Grades: " + students.get(chooseStudent).getGrades() + "%n", students.get(chooseStudent).getName(), students.get(chooseStudent).getGradeAverage());
            } else if (students.containsKey(chooseStudent) == false) {
                System.err.println("That user does not exist.");
            }
            System.out.println("\nWould you like to continue? [Y/N]");
            String decision = scanner.next();
            if (decision.equalsIgnoreCase("n")) break;
        }

    }
}
