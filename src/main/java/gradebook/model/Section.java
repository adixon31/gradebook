package gradebook.model;

import java.util.ArrayList;

/**
 * @author Princess Angel
 *
 */

/**
 * The third composite of the component package. Represents a Class Section and
 * contains Students. Reports the average score and letter grade for the
 * section.
 */

public class Section extends Component {
    private ArrayList<Student> students;

    public Section(String name) {
        this.name = name;
        students = new ArrayList<Student>();
    }

    public void add(Student student) {
        if (student != null) {
            students.add(student);
        }
    }

    public void setSections(ArrayList<Student> students) {
        this.students = students;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public double getScore(GradingScheme gradingScheme) {
        double sumOfScores = 0;
        if (!students.isEmpty()) {
            for (Student s : students) {
                sumOfScores += s.getScore(gradingScheme);
            }
            score = sumOfScores / students.size();
        }
        return score;
    }

    public double getScore() {
        double sumOfScores = 0;
        if (!students.isEmpty()) {
            for (Student s : students) {
                sumOfScores += s.getScore();
            }
            score = sumOfScores / students.size();
        }
        return score;
    }

    public void print() {
        System.out.println("Name: " + name + ", Average score: " + score
                + ", Average Letter Grade: " + letterGrade);
    }

}
