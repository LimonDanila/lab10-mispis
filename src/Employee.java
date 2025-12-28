public abstract class Employee {
    private int socialSecurityNumber;
    private String name;
    private String email;
    private static int employeeCounter = 0;

    public Employee(int socialSecurityNumber, String name, String email) {
        this.socialSecurityNumber = socialSecurityNumber;
        this.name = name;
        this.email = email;
        employeeCounter++;
    }

    public int getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(int socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static int getEmployeeCounter() {
        return employeeCounter;
    }

    public void printEmployeeInfo() {
        System.out.println("++ Информация о сотруднике ++");
        System.out.println("Имя: " + name);
        System.out.println("Email: " + email);
        System.out.println("Номер соц. страхования: " + socialSecurityNumber);
    }
}



