package gradebook.model;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class StudentTest {
    private static Student student;
    private static GradebookItem test, quiz, homework, classFinal;
    private static GradebookCategory tests, quizzes, homeworks, finals;

    @BeforeClass
    public static void test() {
        student = new Student("Bob");
        tests = new GradebookCategory("Tests", 0.3);
        test = new GradebookItem("test1", tests, 80);
        quizzes = new GradebookCategory("Quizzes", .15);
        quiz = new GradebookItem("quiz1", quizzes, 90);
        homeworks = new GradebookCategory("Homeworks", 0.25);
        homework = new GradebookItem("homework1", homeworks, 85);
        finals = new GradebookCategory("Final", .30);
        classFinal = new GradebookItem("final", finals, 92);

        student.add(test);
        student.add(quiz);
        student.add(homework);
        student.add(classFinal);

    }

    @Test
    public void testGrade() {
        assertEquals(86.35, student.getScore(), 0.01);
        assertTrue(student.getLetterGrade() == 'B');
        // assertEquals(92.0, student.getScore(), 0.01);//This should fail.
        assertFalse(student.getLetterGrade() == 'A');
    }

}
