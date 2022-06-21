package grades;

import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Integer> grades = new ArrayList<>();
    ;

    public Student() {
    }

    public Student(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public void addGrade(int grade) {
        grades.add(grade);
    }

    public double getGradeAverage() {
        double average = 0;
        for (int grade : grades) {
            average += grade;
        }
        return average / grades.size();
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }
}
