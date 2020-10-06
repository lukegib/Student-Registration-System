import java.time.LocalDate;
import java.util.ArrayList;

public class Course {

    private String name;
    private String id;
    private String coordinator;

    private LocalDate start;
    private LocalDate end;

    private ArrayList<Module> modules = new ArrayList<>();
    private ArrayList<Student> students = new ArrayList<>();

    public Course(String name, String id, String coordinator, int startDay, int startMonth, int duration) {
        this.name = name;
        this.id = id;
        this.coordinator = coordinator;

        int thisYear = LocalDate.now().getYear();

        start = LocalDate.of(thisYear, startMonth, startDay);
        end = start.plusMonths(duration);
    }

    public void addModule(Module m){
        modules.add(m);

        // add course to module
        m.addCourse(this);

        System.out.println(this);

        // enroll all current students
        for(Student s: students){
            s.addModule(m);
        }
    }

    public void enrollStudent(Student s){
        // add student
        students.add(s);
        // add course to student
        s.addCourse(this);
        // enroll student in all the courses modules
        for(Module m: modules){
            m.enrollStudent(s);
        }
    }

    public LocalDate getStart() {
        return start;
    }

    public void setStart(LocalDate start) {
        this.start = start;
    }

    public LocalDate getEnd() {
        return end;
    }

    public void setEnd(LocalDate end) {
        this.end = end;
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

    public String getCoordinator() {
        return coordinator;
    }

    public void setCoordinator(String coordinator) {
        this.coordinator = coordinator;
    }
}
