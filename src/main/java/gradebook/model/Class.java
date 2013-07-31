package gradebook.model;

import java.util.ArrayList;

/**
 * @author Princess Angel
 *
 */

/**
 * Second composite of the package component. Represents a Course Class with
 * multiple Sections. Will report the average score and letter grade of all
 * class sections.
 */

public class Class extends Component {
    private ArrayList<Section> sections;

    public Class(String name) {
        this.name = name;
        sections = new ArrayList<Section>();
    }

    public void add(Section section) {
        if (section != null) {
            sections.add(section);
        }
    }

    public void setSections(ArrayList<Section> sections) {
        this.sections = sections;
    }

    public ArrayList<Section> getSections() {
        return sections;
    }

    public double getScore(GradingScheme gradingScheme) {
        double sumOfScores = 0;
        if (!sections.isEmpty()) {
            for (Section s : sections) {
                sumOfScores += s.getScore(gradingScheme);
            }
            score = sumOfScores / sections.size();
        }
        return score;
    }

    public double getScore() {
        double sumOfScores = 0;
        if (!sections.isEmpty()) {
            for (Section s : sections) {
                sumOfScores += s.getScore();
            }
            score = sumOfScores / sections.size();
        }
        return score;
    }

    public void print() {
        System.out.println("Name: " + name + ", Average score: " + score
                + ", Average Letter Grade: " + letterGrade);
    }
}
