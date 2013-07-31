package gradebook.model;

import java.util.ArrayList;

/**
 * @author Princess Angel
 *
 */

/**
 * Represents a Course with multiple classes and possible prerequisites. Will
 * report course name, prerequisites, course number, and course subject.
 */
public class Course {
    private String subject, name, courseNumber;
    private ArrayList<Course> prerequisiteCourses;
    private ArrayList<Class> classes;

    public Course(String subject, String name, String courseNumber) {
        this.subject = subject;
        this.name = name;
        this.courseNumber = courseNumber;
        prerequisiteCourses = new ArrayList<Course>();
        classes = new ArrayList<Class>();
    }

    public void addClass(Class someClass) {
        if (someClass != null) {
            classes.add(someClass);
        }
    }

    public void addPrerequisite(Course prerequisite) {
        if (prerequisite != null) {
            prerequisiteCourses.add(prerequisite);
        }
    }

    public void addPrerequisite(ArrayList<Course> prerequisites) {
        if (prerequisites != null) {
            prerequisiteCourses = prerequisites;
        }
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCourseNumber(String courseNumber) {
        this.courseNumber = courseNumber;
    }

    public String getSubject() {
        return subject;
    }

    public String getName() {
        return name;
    }

    public String getCourseNumber() {
        return courseNumber;
    }

    public String getPrerequisites() {
        if (prerequisiteCourses.isEmpty()) {
            return "None";
        } else {
            return prerequisiteCourses.toString();
        }
    }

    public boolean isPrerequisite(Course course) {
        return prerequisiteCourses.contains(course);
    }

    public ArrayList<Class> getClasses() {
        return classes;
    }
}
