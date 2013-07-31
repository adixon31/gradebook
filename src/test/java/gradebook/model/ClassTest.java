package gradebook.model;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class ClassTest {
	private static Class class1;
	private static Section section1, section2;
	
	@BeforeClass
	public static void test(){
		class1 = new Class();
		section1 = new Section("A");
		section2 = new Section("B");
		
		section1.setAverageScore(70);
		section2.setAverageScore(80);
		
		class1.addSection(section1);
		class1.addSection(section2);
	}
	
	@Test
	public void testAverages() {
		assertEquals(75, class1.getAverageScore(), 0.01);
		assertTrue(class1.getAverageLetterGrade() == 'C');
	}

}
