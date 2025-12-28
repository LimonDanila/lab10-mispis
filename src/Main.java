import java.util.Date;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) {

        University university = new University("ВГУ");

        Administrator dean1 = new Administrator(1001, "Хорин Данила Евгеньевич", "dean1@university.ru");
        Administrator dean2 = new Administrator(1002, "Новичихин Никита Сергеевич", "dean2@university.ru");

        Faculty faculty1 = new Faculty("Факультет компьютерных наук", dean1);
        Faculty faculty2 = new Faculty("Факультет Геологии", dean2);
        university.addFaculty(faculty1);
        university.addFaculty(faculty2);

        Department department1 = new Department("Кафедра ЦИС", "Университетская пл., корп. 1а, ауд. 386а");
        Department department2 = new Department("Кафедра БД", "Университетская пл., корп. 1а, ауд. 386б");
        Department department3 = new Department("Кафедра общей геологии и геодинамики", "Университетская пл., корп. 1б, ауд. 211п");
        faculty1.addInstitute(department1);
        faculty1.addInstitute(department2);
        faculty2.addInstitute(department3);

        ResearchAssociate researcher1 = new ResearchAssociate(2001, "Дедов Павел Денисоыич",
                                                              "dedov@university.ru", "Системы инф. поддержки ЖЦ");
        ResearchAssociate researcher2 = new ResearchAssociate(2002, "Федоренко Татьяна Викторовна",
                                                              "fedorenko@university.ru", "Базы данных");
        Lecturer lecturer1 = new Lecturer(2003, "Прибыльский Дмитрий Олегович",
                                         "pribilskyi@university.ru", "Геология");
        department1.addResearchAssociate(researcher1);
        department2.addResearchAssociate(researcher2);
        department3.addResearchAssociate(lecturer1);

        Calendar cal = Calendar.getInstance();
        cal.set(2024, Calendar.JANUARY, 1);
        Date startDate1 = cal.getTime();
        cal.set(2024, Calendar.DECEMBER, 31);
        Date endDate1 = cal.getTime();
        
        cal.set(2024, Calendar.MARCH, 1);
        Date startDate2 = cal.getTime();
        cal.set(2025, Calendar.FEBRUARY, 28);
        Date endDate2 = cal.getTime();
        
        Project project1 = new Project("Разработка системы KAD", startDate1, endDate1);
        Project project2 = new Project("Исследование распределенных БД", startDate2, endDate2);
        Project project3 = new Project("Изучение недр земли", startDate1, endDate1);

        researcher1.addProjectToResearcher(project1, 120);

        researcher2.addProjectToResearcher(project2, 150);
        lecturer1.addProjectToResearcher(project3, 200);

        Course course1 = new Course(101, "Системы ИПЖЦ", 4.0f);
        Course course2 = new Course(102, "Базы данных", 3.0f);
        Course course3 = new Course(201, "Общая геология", 5.0f);
        Course course4 = new Course(202, "Геология недр", 4.5f);

        researcher1.addCourse(course1);
        researcher2.addCourse(course2);
        lecturer1.addCourse(course3);
        lecturer1.addCourse(course4);

        university.printUniversityInfo();

        System.out.println("\n\n");
        researcher1.printEmployeeInfo();
        
        System.out.println("\n\n");
        researcher2.printEmployeeInfo();
        
        System.out.println("\n\n");
        lecturer1.printEmployeeInfo();

        System.out.println("\n\n----------------------------------------");
        System.out.println("Общая статистика");
        System.out.println("----------------------------------------");
        System.out.println("Всего сотрудников: " + Employee.getEmployeeCounter());
        System.out.println("Всего факультетов: " + university.getFaculties().size());
        
        int totalInstitutes = 0;
        for (Faculty faculty : university.getFaculties()) {
            totalInstitutes += faculty.getInstitutes().size();
        }
        System.out.println("Всего кафедр: " + totalInstitutes);
    }
}



