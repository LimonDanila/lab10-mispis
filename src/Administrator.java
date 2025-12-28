public class Administrator extends Employee {

    public Administrator(int socialSecurityNumber, String name, String email) {
        super(socialSecurityNumber, name, email);
    }

    @Override
    public void printEmployeeInfo() {
        System.out.println("- Администратор -");
        super.printEmployeeInfo();
    }
}



