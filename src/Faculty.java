import java.util.ArrayList;
import java.util.List;

public class Faculty {
    private String name;
    private Employee dean;
    private List<Department> Departments;

    public Faculty(String name, Employee dean) {
        this.name = name;
        this.dean = dean;
        this.Departments = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee getDean() {
        return dean;
    }

    public void setDean(Employee dean) {
        this.dean = dean;
    }

    public List<Department> getInstitutes() {
        return Departments;
    }


    public void addInstitute(Department department) {
        if (department != null && !Departments.contains(department)) {
            Departments.add(department);
        }
    }

    public void displayInstitutes() {
        System.out.println("Кафедры факультета " + name + ":");
        if (Departments.isEmpty()) {
            System.out.println("  (кафедры отсутствуют)");
        } else {
            for (Department department : Departments) {
                System.out.println("  - " + department.getName() + " (" + department.getAddress() + ")");
            }
        }
    }
}



