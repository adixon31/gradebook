package gradebook.model;

import java.util.ArrayList;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class SectionTest {
    private static Section section;
    private static Student student1, student2;
    private static ArrayList<Student> students;

    @BeforeClass
    public static void test() {
        student1 = new Student("Amanda");
        student2 = new Student("Bob");

        student1.setScore(90);
        student2.setScore(80);

        students = new ArrayList<Student>();

        students.add(student1);
        students.add(student2);

        section = new Section("A");
        section.setSections(students);

    }

    @Test
    public void testAverages() {
        assertEquals(85, section.getScore(), 0.01);
        assertTrue(section.getLetterGrade() == 'B');
        assertFalse(section.getLetterGrade() == 'F');
    }
}
