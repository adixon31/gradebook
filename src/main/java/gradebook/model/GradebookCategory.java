package gradebook.model;

/**
 * @author Princess Angel
 *
 */

/**
 * Represents a GradebookCategory with a name and weight to be used in
 * calculating a student's average score from the scores they receive on each
 * GradebookItem.
 */
public class GradebookCategory {
    private String name;
    private double weight;

    public GradebookCategory(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }
}
