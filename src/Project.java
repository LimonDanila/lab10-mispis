import java.util.Date;

public class Project {
    public enum ProjectState {
        PLANNING,
        IN_PROGRESS,
        COMPLETED
    }
    
    private String name;
    private Date startDate;
    private Date endDate;
    private ProjectState state;

    public Project(String name, Date startDate, Date endDate) {
        this.name = name;
        this.startDate = startDate;
        this.endDate = endDate;
        this.state = ProjectState.PLANNING; // Начальное состояние
    }

    public void start() {
        if (state == ProjectState.PLANNING) {
            this.state = ProjectState.IN_PROGRESS;
        }
    }

    public void complete() {
        if (state == ProjectState.IN_PROGRESS) {
            this.state = ProjectState.COMPLETED;
        }
    }

    public ProjectState getState() {
        return state;
    }

    public boolean isStartDateReached(Date currentDate) {
        return currentDate.after(startDate) || currentDate.equals(startDate);
    }

    public boolean isEndDateReached(Date currentDate) {
        return currentDate.after(endDate) || currentDate.equals(endDate);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "Project{" +
                "name='" + name + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                '}';
    }
}



