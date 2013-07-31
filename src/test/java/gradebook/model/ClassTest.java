package gradebook.model;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class ClassTest {
    private static Class class1;
    private static Section section1, section2;

    @BeforeClass
    public static void test() {
        class1 = new Class("A");
        section1 = new Section("A");
        section2 = new Section("B");

        section1.setScore(70);
        section2.setScore(80);

        class1.add(section1);
        class1.add(section2);

    }

    @Test
    public void testAverages() {
        assertEquals(75, class1.getScore(), 0.01);
        assertTrue(class1.getLetterGrade() == 'C');
    }

}
