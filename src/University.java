import java.util.ArrayList;
import java.util.List;

public class University {
    private String name;
    private List<Faculty> faculties; //


    public University(String name) {
        this.name = name;
        this.faculties = new ArrayList<>();
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Faculty> getFaculties() {
        return faculties;
    }

    public void addFaculty(Faculty faculty) {
        if (faculty != null && !faculties.contains(faculty)) {
            faculties.add(faculty);
        }
    }

    public void printUniversityInfo() {
        System.out.println("Название: " + name);
        System.out.println("\nКоличество факультетов: " + faculties.size());
        System.out.println("\n" + "-".repeat(40));
        
        if (faculties.isEmpty()) {
            System.out.println("Факультеты отсутствуют");
        } else {
            for (int i = 0; i < faculties.size(); i++) {
                Faculty faculty = faculties.get(i);
                System.out.println("\nФакультет #" + (i + 1) + ": " + faculty.getName());

                if (faculty.getDean() != null) {
                    System.out.println("  Декан: " + faculty.getDean().getName() + 
                                     " (" + faculty.getDean().getEmail() + ")");
                }

                List<Department> Departments = faculty.getInstitutes();
                if (Departments.isEmpty()) {
                    System.out.println("  Кафедры: (отсутствуют)");
                } else {
                    System.out.println("  Кафедры (" + Departments.size() + "):");
                    for (Department department : Departments) {
                        System.out.println("    - " + department.getName() +
                                         " (адрес: " + department.getAddress() + ")");
                    }
                }
                System.out.println("-".repeat(40));
            }
        }
        
        System.out.println("\n----------------------------------------");
    }
}



