public class Lecturer extends ResearchAssociate {

    public Lecturer(int socialSecurityNumber, String name, String email, String fieldOfStudy) {
        super(socialSecurityNumber, name, email, fieldOfStudy);
    }

    @Override
    public void printEmployeeInfo() {
        System.out.println("+ Преподаватель +");
        super.printEmployeeInfo();
    }
}



