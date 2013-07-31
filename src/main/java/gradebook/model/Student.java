package gradebook.model;

import java.util.ArrayList;

/**
 * @author Princess Angel
 *
 */

/**
 * Represents a Student with a name. Cna be added to a section and given
 * GradebookItem scores, which will report a score and letter grade based on a
 * specified GradingScheme.
 */

public class Student {
    private String name;
    private ArrayList<GradebookItem> gradebookItems;
    private ArrayList<GradebookCategory> categories;
    private GradingScheme gradingScheme;
    private char letterGrade;
    private double score;
    private final double gradeA = 89.49, gradeB = 79.49, gradeC = 69.49,
            gradeD = 59.49;

    public Student(String name) {
        this.setName(name);
        gradebookItems = new ArrayList<GradebookItem>();
        categories = new ArrayList<GradebookCategory>();
        gradingScheme = new GradingScheme();
    }

    public void addGradebookItem(GradebookItem item) {
        if (item != null) {
            gradebookItems.add(item);
        }
        if (!categories.contains(item.getCategory())) {
            categories.add(item.getCategory());
        }
    }

    public char getLetterGrade() {
        score = getScore();
        if (score > gradeA) {
            letterGrade = 'A';
        } else if (score > gradeB) {
            letterGrade = 'B';
        } else if (score > gradeC) {
            letterGrade = 'C';
        } else if (score > gradeD) {
            letterGrade = 'D';
        } else {
            letterGrade = 'F';
        }
        return letterGrade;
    }

    public double getScore() {
        if (!gradebookItems.isEmpty()) {
            score = gradingScheme.calculate(gradebookItems);
        }
        return score;
    }

    public double getScore(GradingScheme gradingscheme) {
        if (!gradebookItems.isEmpty()) {
            score = gradingscheme.calculate(gradebookItems);
        }
        return score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setScore(double score) {
        this.score = score;
    }
}
