package gradebook.model;

/**
 * @author Princess Angel
 *
 */

/**
 * Represents a GradebookItem with a name and GradebookCategory, which has a
 * weight for calculating the grade of the student.
 */

public class GradebookItem {
    private String name;
    private GradebookCategory category;
    private float score;

    public GradebookItem(String name, GradebookCategory category) {
        this.name = name;
        this.category = category;
    }

    public GradebookItem(String name, GradebookCategory category, float score) {
        this.name = name;
        this.category = category;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public GradebookCategory getCategory() {
        return category;
    }

    public void setScore(float score) {
        this.score = score;
    }

    public float getScore() {
        return score;
    }
}
