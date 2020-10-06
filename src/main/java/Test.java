public class Test {

    public static void main(String[] args) {

        // create a student

        Student luke = new Student("Luke Gibbons", 1997, 6, 6);

        // create 5 modules

        Module sci = new Module("Science 101", "S101", "Dr. Patrick Holmes");
        Module arc = new Module("Architecture 101", "AC101", "Dr. Emmanuel Sugar");
        Module art = new Module("Art 101", "AT101", "Dr. Leonardo Di Vinci");
        Module math = new Module("Mathematics 101", "MA101", "Dr. Will I Am");
        Module ai = new Module("Artificial Intelligence 101", "AI101", "Dr. Peter Pater");

        // create a course

        Course c = new Course("Bachelor of Randomness", "BCR", "Dr. Patrick Homie", 30, 9, 12);

        // add the 5 modules to the course

        c.enrollStudent(luke);
        c.addModule(sci);

        // add the student to the course... the student should now be enrolled in the 5 modules

        //

    }
}
