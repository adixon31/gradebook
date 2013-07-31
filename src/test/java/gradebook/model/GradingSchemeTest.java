package gradebook.model;

import static org.junit.Assert.*;
import java.util.ArrayList;

import org.junit.BeforeClass;
import org.junit.Test;

public class GradingSchemeTest {
	private static ArrayList<GradebookItem> grades;
	private static GradebookItem test, quiz, homework, classFinal;
	private static GradebookCategory tests, quizzes, homeworks, finals;
	private static GradingScheme scheme;
	 @BeforeClass
	    public static void setUpBeforeClass() throws Exception {
		 grades = new ArrayList<GradebookItem>();
		 tests = new GradebookCategory("Tests", (float) 0.3);
		 test = new GradebookItem("test1", tests, 80 );
		 quizzes = new GradebookCategory("Quizzes", (float) .15);
		 quiz = new GradebookItem("quiz1", quizzes, 90);
		 homeworks = new GradebookCategory("Homeworks", (float) 0.25);
		 homework = new GradebookItem("homework1", homeworks, 85 );
		 finals = new GradebookCategory("Final", (float) .30);
		 classFinal = new GradebookItem("final", finals, 92);
		 scheme = new GradingScheme();
		 
		 grades.add(test);
		 grades.add(quiz);
		 grades.add(homework);
		 grades.add(classFinal);
		 
	 }
	 
	@Test
	public void testGradeCalculation() {
		assertEquals((double) 86.35, scheme.calculate(grades), 0.01);
	}

}
