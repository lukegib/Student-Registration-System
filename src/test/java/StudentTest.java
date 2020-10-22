import org.junit.Test;

import java.time.LocalDate;
import java.time.Period;

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
}