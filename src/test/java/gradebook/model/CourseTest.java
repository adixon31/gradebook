package gradebook.model;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.BeforeClass;
import org.junit.Test;

public class CourseTest {
	private static Course CS1332, CS1331, CS1301;
	private static ArrayList<Course> prerequisiteCourses;
	private static Class someClass;
	@BeforeClass
	public static void test() {
		CS1332 = new Course("Java", "Data Structures", "1332");
		CS1331 = new Course("Java", "Java Basics", "1331");
		CS1301 = new Course("Computer Science", "Intro", "1301");
		
		prerequisiteCourses = new ArrayList<Course>();
		
		prerequisiteCourses.add(CS1331);
		prerequisiteCourses.add(CS1301);
		
		CS1332.addPrerequisite(prerequisiteCourses);
		
		someClass = new Class();
		CS1332.addClass(someClass);
	}
	
	@Test
	public void testPrerequisites(){
		assertTrue(CS1332.isPrerequisite(CS1331));
		assertFalse(CS1332.isPrerequisite(CS1332));
		assertTrue(CS1332.getClasses().contains(someClass));
	}

}
