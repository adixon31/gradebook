package gradebook.model;

import java.util.ArrayList;

/**
 * @author Princess Angel
 *
 */

/**
 * Represents a Class Section and contains Students. Reports the average score
 * and letter grade for the section.
 */

public class Section {
    private ArrayList<Student> students;
    private double averageScore;
    private char averageLetterGrade = 'A';
    private String name;
    private GradingScheme gradingScheme;
    private final double gradeA = 89.49, gradeB = 79.49, gradeC = 69.49,
            gradeD = 59.49;

    public Section(String name) {
        this.setName(name);
        gradingScheme = new GradingScheme();
        students = new ArrayList<Student>();
    }

    public void addStudent(Student student) {
        if (student != null) {
            students.add(student);
        }
    }

    public void setStudent(ArrayList<Student> students) {
        this.students = students;
    }

    public double getAverageScore() {
        double sumOfScores = 0;
        if (!students.isEmpty()) {
            for (Student s : students) {
                sumOfScores += s.getScore(gradingScheme);
            }
            averageScore = sumOfScores / students.size();
        }
        return averageScore;
    }

    public double getAverageScore(GradingScheme gradingscheme) {
        double sumOfScores = 0;
        if (!students.isEmpty()) {
            for (Student s : students) {
                sumOfScores += s.getScore(gradingscheme);
            }
            averageScore = sumOfScores / students.size();
        }
        return averageScore;
    }

    public char getAverageLetterGrade() {
        if (averageScore > gradeA) {
            averageLetterGrade = 'A';
        } else if (averageScore > gradeB) {
            averageLetterGrade = 'B';
        } else if (averageScore > gradeC) {
            averageLetterGrade = 'C';
        } else if (averageScore > gradeD) {
            averageLetterGrade = 'D';
        } else {
            averageLetterGrade = 'F';
        }
        return averageLetterGrade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAverageScore(double averageScore) {
        this.averageScore = averageScore;
    }

}
