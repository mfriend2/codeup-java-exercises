package grades;

public class StudentTest {
    public static void main(String[] args) {
        Student mike = new Student("Mike");
        System.out.println(mike.getName());
        mike.addGrade(95);
        mike.addGrade(97);
        mike.addGrade(98);
        mike.addGrade(90);
        mike.addGrade(80);
        mike.addGrade(85);
        System.out.println(mike.getGrades());
        System.out.printf("%.2f", mike.getGradeAverage());
    }
}
