package gradebook.model;

import java.util.ArrayList;

/**
 * @author Princess Angel
 *
 */

/**
 * Represents a Course Class with multiple Sections. Will report the average
 * score and letter grade of all class sections.
 */
public class Class {
    private ArrayList<Section> sections;
    private double averageScore;
    private char averageLetterGrade;
    private final double gradeA = 89.49, gradeB = 79.49, gradeC = 69.49,
            gradeD = 59.49;

    public Class() {
        sections = new ArrayList<Section>();
    }

    public void addSection(Section section) {
        if (section != null) {
            sections.add(section);
        }
    }

    public void setSections(ArrayList<Section> sections) {
        this.sections = sections;
    }

    public double getAverageScore() {
        double sumOfScores = 0;
        for (Section s : sections) {
            sumOfScores += s.getAverageScore();
        }
        averageScore = sumOfScores / sections.size();
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
}
