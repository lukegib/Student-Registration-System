import org.junit.Test;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

import static org.junit.Assert.*;

public class StudentTest {

    private Student s = new Student("John Doe", 1990, 10, 10);

    @Test
    public void testName(){
        String expectedName = "John Doe";

        assertEquals("Fail - Student did not return the expected name", expectedName, s.getName());

        s.setName("Sue Smith");
        expectedName = "Sue Smith";

        assertEquals("Fail - Student did not set the name correctly", expectedName, s.getName());
    }

    @Test
    public void testId(){
        assertNotEquals("Fail - Student did not return the expected id", 0, s.getId());

        int expectedId = 1000;
        s.setId(1000);

        assertEquals("Fail - Student did not set the id correctly", expectedId, s.getId());
    }

    @Test
    public void testDOB(){
        LocalDate expectedDOB = LocalDate.of(1990, 10, 10);

        assertEquals("Fail - Student did not return the expected DOB", expectedDOB, s.getDOB());

        expectedDOB = LocalDate.of(2000, 1, 1);
        s.setDOB(LocalDate.of(2000, 1, 1));

        assertEquals("Fail - Student did not set the DOB correctly", expectedDOB, s.getDOB());

        s.setDOB(2000, 1, 1);

        assertEquals("Fail - Student did not set the DOB correctly", expectedDOB, s.getDOB());
    }

    @Test
    public void testAge(){
        Period p = s.getDOB().until(LocalDate.now());
        int expectedAge = p.getYears();

        assertEquals("Fail - Student did not return the expected age", expectedAge, s.getAge());
    }

    @Test
    public void testUsername(){

        String expectedUsername = "JohnDoe" + s.getAge();

        assertEquals("Fail - Student did not return the expected age", expectedUsername, s.getUsername());

        expectedUsername = "test123";
        s.setUsername("t est 123");

        assertEquals("Fail - Student did not set the username correctly", expectedUsername, s.getUsername());

    }

    @Test
    public void testCourse(){
        ArrayList<Course> expectedCourses = new ArrayList<>();

        assertEquals("Fail - Course did not return the expected course(s)", expectedCourses, s.getCourses());

        Course c = new Course("Test Course", "1001", "John Doe", 1, 9, 3);
        expectedCourses.add(c);

        s.addCourse(c);

        assertEquals("Fail - Student did not add the course correctly", expectedCourses, s.getCourses());

        expectedCourses.remove(c);
        s.removeCourse(c);

        assertEquals("Fail - Student did not remove the course correctly", expectedCourses, s.getCourses());
    }

    @Test
    public void testModule(){
        ArrayList<Module> expectedModules = new ArrayList<>();

        assertEquals("Fail - Course did not return the expected course(s)", expectedModules, s.getModules());

        Module m = new Module("Test Module", "TM101", "John Doe");
        expectedModules.add(m);

        s.addModule(m);

        assertEquals("Fail - Student did not add the course correctly", expectedModules, s.getModules());

        expectedModules.remove(m);
        s.removeModule(m);

        assertEquals("Fail - Student did not remove the course correctly", expectedModules, s.getModules());
    }
}