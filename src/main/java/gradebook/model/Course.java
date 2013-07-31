package gradebook.model;

import java.util.ArrayList;

/**
 * @author Princess Angel
 *
 */

/**
 * This is the first composite for the project component. Represents a Course
 * with multiple classes and possible prerequisites. Will report course name,
 * prerequisites, course number, and course subject.
 */

public class Course extends Component {
    private String subject, courseNumber;
    private ArrayList<Course> prerequisiteCourses;
    private ArrayList<Class> classes;
    private GradingScheme gradingScheme;

    public Course(String subject, String name, String courseNumber) {
        this.subject = subject;
        this.name = name;
        this.courseNumber = courseNumber;
        gradingScheme = new GradingScheme();
        prerequisiteCourses = new ArrayList<Course>();
        classes = new ArrayList<Class>();
        prerequisiteCourses = new ArrayList<Course>();
    }

    public void add(Object object) {
        if (object instanceof Class) {
            classes.add((Class) object);
        } else if (object instanceof Course) {
            prerequisiteCourses.add((Course) object);
        }

    }

    public void setClasses(ArrayList<Class> classes) {
        this.classes = classes;
    }

    public void setPrerequisites(ArrayList<Course> courses) {
        this.prerequisiteCourses = courses;
    }

    public double getScore() {
        double sumOfScores = 0;
        if (!classes.isEmpty()) {
            for (Class c : classes) {
                sumOfScores += c.getScore();
            }
            score = sumOfScores / classes.size();
        }
        return score;
    }

    public double getScore(GradingScheme gradingScheme) {
        double sumOfScores = 0;
        if (!classes.isEmpty()) {
            for (Class c : classes) {
                sumOfScores += c.getScore(gradingScheme);
            }
            score = sumOfScores / classes.size();
        }
        return score;
    }

    public boolean isPrerequisite(Course course) {
        return prerequisiteCourses.contains(course);
    }

    public ArrayList<Class> getClasses() {
        return classes;
    }

    public void print() {
        System.out.println("Subject: " + subject + ", Name: " + name
                + ", Course Number: " + courseNumber
                + ", Prerequisite Courses: " + prerequisiteCourses
                + ", Classes: " + classes + ", Average Score: " + score
                + ", Average Letter Grade: " + letterGrade);
    }
}
