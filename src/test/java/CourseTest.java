import org.junit.Test;

import java.time.LocalDate;
import java.util.ArrayList;

import static org.junit.Assert.*;

public class CourseTest {

    private Course c = new Course("Test Course", "TC101", "John Doe", 1, 9, 12);

    @Test
    public void testName(){
         String expectedName = "Test Course";

         assertEquals("Fail - Course did not return the expected name", expectedName, c.getName());

         c.setName("Changed Course");
         expectedName = "Changed Course";

         assertEquals("Fail - Course did not set the name correctly", expectedName, c.getName());
    }

    @Test
    public void testId(){
        String expectedId = "TC101";

        assertEquals("Fail - Course did not return the expected id", expectedId, c.getId());

        c.setId("CC201");
        expectedId = "CC201";

        assertEquals("Fail - Course did not set the id correctly", expectedId, c.getId());
    }

    @Test
    public void testCoordinator(){
        String expectedCoord = "John Doe";

        assertEquals("Fail - Course did not return the expected coordinator", expectedCoord, c.getCoordinator());

        c.setCoordinator("Sue Smith");
        expectedCoord = "Sue Smith";

        assertEquals("Fail - Course did not set the coordinator correctly", expectedCoord, c.getCoordinator());
    }

    @Test
    public void duration(){

        int expectedDuration = 12;

        assertEquals("Fail - Course did not return the expected duration", expectedDuration, c.getDuration());

        expectedDuration = 24;
        c.setDuration(24);

        assertEquals("Fail - Course did not set the duration correctly", expectedDuration, c.getDuration());

    }

    @Test
    public void testStart(){

        int expectedYear = LocalDate.now().getYear();
        LocalDate expectedStart = LocalDate.of(expectedYear, 9, 1);

        assertEquals("Fail - Course did not return the expected start date", expectedStart, c.getStart());

        expectedStart = LocalDate.of(2050, 1, 1);
        c.setStart(expectedStart);

        assertEquals("Fail - Course did not set the start date correctly", expectedStart, c.getStart());

        c.setStart(2050, 1, 1);

        assertEquals("Fail - Course did not set the start date correctly", expectedStart, c.getStart());

    }

    @Test
    public void testEnd(){

        int expectedYear = LocalDate.now().plusMonths(12).getYear();
        LocalDate expectedEnd = LocalDate.of(expectedYear, 9, 1);

        assertEquals("Fail - Course did not return the expected end date", expectedEnd, c.getEnd());

        c.setStart(2050, 1, 1);
        expectedEnd = LocalDate.of(2051, 1, 1);

        assertEquals("Fail - Course did not set the end date correctly", expectedEnd, c.getEnd());

        expectedEnd = LocalDate.of(2052, 1, 1);
        c.setDuration(24);

        assertEquals("Fail - Course did not set the end date correctly", expectedEnd, c.getEnd());

    }

    @Test
    public void testModules(){
        ArrayList<Module> expectedModules = new ArrayList<>();

        assertEquals("Fail - Course did not return the expected modules", expectedModules, c.getModules());

        Module m = new Module("Test Module", "T101", "John Doe");
        expectedModules.add(m);

        c.addModule(m);

        assertEquals("Fail - Course did not add the module correctly", expectedModules, c.getModules());

        expectedModules.remove(m);
        c.removeModule(m);

        assertEquals("Fail - Course did not remove the module correctly", expectedModules, c.getModules());
    }

    @Test
    public void testStudents(){
        ArrayList<Student> expectedStudents = new ArrayList<>();

        assertEquals("Fail - Course did not return the expected students", expectedStudents, c.getStudents());

        Student s = new Student("John Doe", 2000, 1, 1);
        expectedStudents.add(s);

        c.enrollStudent(s);

        assertEquals("Fail - Course did not add the student correctly", expectedStudents, c.getStudents());

        expectedStudents.remove(s);
        c.unenrollStudent(s);

        assertEquals("Fail - Course did not remove the student correctly", expectedStudents, c.getStudents());
    }
}