package gradebook.model;

/**
 * @author Princess Angel
 *
 */

/**
 * The is the abstract component for the Course, Class, Section, and Student
 * Composite. Accounts for score, letter grade, name, and print line statement.
 */
public abstract class Component {
    protected double score;
    protected char letterGrade;
    protected String name;
    protected final double gradeA = 89.49, gradeB = 79.49, gradeC = 69.49,
            gradeD = 59.49;

    public void add(Object e) {
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
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

    public void setLetterGrade(char letterGrade) {
        this.letterGrade = letterGrade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void print() {
    }
}
