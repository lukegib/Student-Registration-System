import java.time.LocalDate;

public class Course {

    private String name;
    private String id;
    private String coordinator;

    private LocalDate start;
    private LocalDate end;

    public Course(String name, String id, String coordinator, int startDay, int startMonth, int duration) {
        this.name = name;
        this.id = id;
        this.coordinator = coordinator;

        int thisYear = LocalDate.now().getYear();

        start = LocalDate.of(thisYear, startMonth, startDay);
        end = start.plusMonths(duration);
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
