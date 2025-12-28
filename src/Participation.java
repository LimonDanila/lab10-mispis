
// Хранит информацию об участии научного сотрудника в проекте

public class Participation {
    private ResearchAssociate researchAssociate;
    private Project project;
    private int hoursWorked;

    public Participation(ResearchAssociate researchAssociate, Project project, int hoursWorked) {
        this.researchAssociate = researchAssociate;
        this.project = project;
        this.hoursWorked = hoursWorked;
    }

    public ResearchAssociate getResearchAssociate() {
        return researchAssociate;
    }

    public void setResearchAssociate(ResearchAssociate researchAssociate) {
        this.researchAssociate = researchAssociate;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    @Override
    public String toString() {
        return "Participation{" +
                "researchAssociate=" + (researchAssociate != null ? researchAssociate.getName() : "null") +
                ", project=" + (project != null ? project.getName() : "null") +
                ", hoursWorked=" + hoursWorked +
                '}';
    }
}



