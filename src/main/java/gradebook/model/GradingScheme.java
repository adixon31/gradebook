package gradebook.model;

import java.util.ArrayList;

/**
 * @author Princess Angel
 *
 */

/**
 * Represents a GradingSchemeused by student objects to calculate scores and
 * letter grades.
 */

public class GradingScheme {

    public GradingScheme() {
    }

    public double calculate(ArrayList<GradebookItem> gradebookItems) {
        float totalWeight = 0;
        float totalPoints = 0;
        for (GradebookItem item : gradebookItems) {
            totalWeight += item.getCategory().getWeight();
            double points = item.getScore() * item.getCategory().getWeight();
            totalPoints += points;
        }
        return totalPoints / totalWeight;
    }

}
