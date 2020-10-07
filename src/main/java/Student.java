import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

public class Student {

    //
    // Local Variables
    //

    private String name;
    private String username;
    private LocalDate DOB;
    private int age;

    static long count = 0;
    private long id;

    private ArrayList<Course> courses = new ArrayList<>();
    private ArrayList<Module> modules = new ArrayList<>();

    public Student(String name, int birthYear, int birthMonth, int birthDay){
        this.name = name;

        this.DOB = LocalDate.of(birthYear, birthMonth, birthDay);
        Period p = this.DOB.until(LocalDate.now());
        this.setAge(p.getYears());

        this.setUsername(this.name + age);

        count++;
        id = count;
    }

    //
    // Add and Remove Courses / Modules
    //

    public void addCourse(Course c){
        courses.add(c);
    }

    public void removeCourse(Course c){
        courses.remove(c);
    }

    public void addModule(Module m){
        modules.add(m);
    }

    public void removeModule(Module m) {
        modules.remove(m);
    }

    //
    // Getters and Setters
    //

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public LocalDate getDOB() {
        return DOB;
    }

    public void setDOB(LocalDate DOB) {
        this.DOB = DOB;
        Period p = this.DOB.until(LocalDate.now());
        this.setAge(p.getYears());
    }

    public void setDOB(int year, int month, int day){
        DOB = LocalDate.of(year, month, day);
        Period p = this.DOB.until(LocalDate.now());
        this.setAge(p.getYears());
    }

    private int getAge() {
        return age;
    }

    private void setAge(int age) {
        this.age = age;
    }
}
