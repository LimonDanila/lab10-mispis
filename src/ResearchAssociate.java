import java.util.ArrayList;
import java.util.List;

// Научный сотрудник

public class ResearchAssociate extends Employee {
    private String fieldOfStudy;
    private List<Department> Departments;
    private List<Participation> participations;
    private List<Course> courses;


    public ResearchAssociate(int socialSecurityNumber, String name, String email, String fieldOfStudy) {
        super(socialSecurityNumber, name, email);
        this.fieldOfStudy = fieldOfStudy;
        this.Departments = new ArrayList<>();
        this.participations = new ArrayList<>();
        this.courses = new ArrayList<>();
    }


    public String getFieldOfStudy() {
        return fieldOfStudy;
    }

    public void setFieldOfStudy(String fieldOfStudy) {
        this.fieldOfStudy = fieldOfStudy;
    }

    public List<Department> getInstitutes() {
        return Departments;
    }

    public List<Participation> getParticipations() {
        return participations;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void addInstitute(Department department) {
        if (department != null && !Departments.contains(department)) {
            Departments.add(department);
        }
    }

    public void addParticipation(Participation participation) {
        if (participation != null && !participations.contains(participation)) {
            participations.add(participation);
        }
    }

    public void addProjectToResearcher(Project project, int hoursWorked) {
        if (project != null) {
            Participation participation = new Participation(this, project, hoursWorked);
            addParticipation(participation);
        }
    }

    public void addCourse(Course course) {
        if (course != null && !courses.contains(course)) {
            courses.add(course);
        }
    }

    public List<Project> getProjects() {
        List<Project> projects = new ArrayList<>();
        for (Participation participation : participations) {
            if (participation.getProject() != null) {
                projects.add(participation.getProject());
            }
        }
        return projects;
    }

    @Override
    public void printEmployeeInfo() {
        System.out.println("++ Научный сотрудник ++");
        super.printEmployeeInfo();
        System.out.println("Область исследований: " + fieldOfStudy);

        if (!Departments.isEmpty()) {
            System.out.println("\nКафедры:");
            for (Department department : Departments) {
                System.out.println("  - " + department.getName() + " (" + department.getAddress() + ")");
            }
        }

        if (!participations.isEmpty()) {
            System.out.println("\nПроекты:");
            for (Participation participation : participations) {
                Project project = participation.getProject();
                if (project != null) {
                    System.out.println("  - " + project.getName() + 
                                     " (отработано часов: " + participation.getHoursWorked() + ")");
                }
            }
        }

        if (!courses.isEmpty()) {
            System.out.println("\nКурсы:");
            for (Course course : courses) {
                System.out.println("  - " + course.getName() + 
                                 " (ID: " + course.getCourseId() + 
                                 ", часов в неделю: " + course.getWeeklyHours() + ")");
            }
        }
    }
}



