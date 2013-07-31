package gradebook.model;

import java.util.ArrayList;

/**
 * @author Princess Angel
 *
 */

/**
 * The is the fourth composite of the component package. Represents a Student
 * with a name. Cna be added to a section and given GradebookItem scores, which
 * will report a score and letter grade based on a specified GradingScheme.
 */

public class Student extends Component {
    private ArrayList<GradebookItem> gradebookItems;
    private ArrayList<GradebookCategory> categories;
    private GradingScheme gradingScheme = new GradingScheme();

    public Student(String name) {
        this.setName(name);
        gradebookItems = new ArrayList<GradebookItem>();
        categories = new ArrayList<GradebookCategory>();
    }

    public void add(Object object) {
        if (object instanceof GradebookItem) {
            gradebookItems.add((GradebookItem) object);
        } else if (object instanceof GradebookCategory) {
            categories.add((GradebookCategory) object);
        }
    }

    public void setGradeBook(ArrayList<GradebookItem> gradebookItems,
            ArrayList<GradebookCategory> categories) {
        this.gradebookItems = gradebookItems;
        this.categories = categories;
    }

    public double getScore(GradingScheme gradingScheme) {
        if (!gradebookItems.isEmpty()) {
            score = gradingScheme.calculate(gradebookItems);
        }
        return score;
    }

    public double getScore() {
        if (!gradebookItems.isEmpty()) {
            score = gradingScheme.calculate(gradebookItems);
        }
        return score;
    }

    public void print() {
        System.out.println("Name: " + name + ", Average score: " + score
                + ", Average Letter Grade: " + letterGrade);
    }

}
