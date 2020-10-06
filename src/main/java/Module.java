import java.util.ArrayList;

public class Module {

    private String name;
    private String id;
    private String teacher;

    private ArrayList<Student> students = new ArrayList<>();
    private ArrayList<Course> courses = new ArrayList<>();

    public Module(String name, String id, String teacher){
        this.name = name;
        this.id = id;
        this.teacher = teacher;
    }

    public void addCourse(Course c){
        courses.add(c);
    }

    public void enrollStudent(Student s){
        students.add(s);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }
}
