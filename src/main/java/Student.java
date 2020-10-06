import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

public class Student {

    private String name;
    private String username;
    private LocalDate DOB;
    private int age;

    static long count = 0;
    private long id;

    private LocalDate today = LocalDate.now();

    private ArrayList<Course> courses = new ArrayList<>();
    private ArrayList<Module> modules = new ArrayList<>();

    public Student(String name, int birthYear, int birthMonth, int birthDay){
        this.name = name;

        this.DOB = LocalDate.of(birthYear, birthMonth, birthDay);
        Period p = this.DOB.until(today);
        this.setAge(p.getYears());

        this.setUsername(this.name + age);

        count++;
        id = count;
    }

    public void addCourse(Course c){
        courses.add(c);
    }

    public void addModule(Module m){
        modules.add(m);
    }

    public LocalDate getDOB() {
        return DOB;
    }

    public void setDOB(LocalDate DOB) {
        this.DOB = DOB;
    }

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
