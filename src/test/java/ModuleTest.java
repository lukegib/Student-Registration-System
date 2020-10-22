import org.junit.Test;

import static org.junit.Assert.*;

public class ModuleTest {

    private Module m = new Module("Spanish", "S101", "Juan Lopez");

    @Test
    public void testName(){
        String expectedName = "Spanish";

        assertEquals("Fail - Module did not return the expected name", expectedName, m.getName());

        m.setName("French");
        expectedName = "French";

        assertEquals("Fail - Module did not set the name correctly", expectedName, m.getName());
    }

    @Test
    public void testId(){
        String expectedId = "S101";

        assertEquals("Fail - Module did not return the expected id", expectedId, m.getId());

        m.setId("F101");
        expectedId = "F101";

        assertEquals("Fail - Module did not set the id correctly", expectedId, m.getId());
    }

    @Test
    public void testTeacher(){
        String expectedTeacher = "Juan Lopez";

        assertEquals("Fail - Module did not return the expected teacher", expectedTeacher, m.getTeacher());

        m.setTeacher("Jean Martin");
        expectedTeacher = "Jean Martin";

        assertEquals("Fail - Module did not set the teacher correctly", expectedTeacher, m.getTeacher());
    }



}