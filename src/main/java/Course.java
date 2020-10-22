import java.time.LocalDate;
import java.util.ArrayList;

public class Course {

    //
    // Local Variables
    //

    private String name;
    private String id;
    private String coordinator;
    private int duration;

    private LocalDate start;
    private LocalDate end;

    private ArrayList<Module> modules = new ArrayList<>();
    private ArrayList<Student> students = new ArrayList<>();

    //
    // Constructor
    //

    public Course(String name, String id, String coordinator, int startDay, int startMonth, int duration) {
        this.name = name;
        this.id = id;
        this.coordinator = coordinator;
        this.duration = duration;

        int thisYear = LocalDate.now().getYear();

        setStart(thisYear, startMonth, startDay);
    }

    //
    // Add and remove Modules / Students
    //

    public void addModule(Module m){
        modules.add(m);

        // add course to module
        m.addCourse(this);

        // enroll all current students
        for(Student s: students){
            s.addModule(m);
            m.enrollStudent(s);
        }
    }

    public void removeModule(Module m){
        modules.remove(m);
        m.removeCourse(this);

        for(Student s: students){
            s.removeModule(m);
            m.unenrollStudent(s);
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
            s.addModule(m);
        }
    }

    public void unenrollStudent(Student s){
        students.remove(s);
        s.removeCourse(this);

        for(Module m: modules){
            m.unenrollStudent(s);
            s.removeModule(m);
        }
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

    public int getDuration(){
        return duration;
    }

    public void setDuration(int duration){
        this.duration = duration;
        setEnd(getStart().plusMonths(duration));
    }

    public LocalDate getStart() {
        return start;
    }

    public void setStart(LocalDate start) {
        this.start = start;
        setEnd(start.plusMonths(duration));
    }

    public void setStart(int year, int month, int day){
        start = LocalDate.of(year, month, day);
        setEnd(start.plusMonths(duration));
    }

    public LocalDate getEnd() {
        return end;
    }

    private void setEnd(LocalDate end) {
        this.end = end;
    }
}
