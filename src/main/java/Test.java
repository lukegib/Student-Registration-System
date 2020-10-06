public class Test {

    public static void main(String[] args) {

        Course c = new Course("Test", "t101", "Luke", 1, 9, 12);
        Student s = new Student("Luke", "Luke1", 23);
        Module m = new Module("Test subject", "t102", "Luke ii");

        System.out.println(c.getStart());
        System.out.println(c.getEnd());

    }
}
