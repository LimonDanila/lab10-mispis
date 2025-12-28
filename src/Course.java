public class Course {
    private int courseId;
    private String name;
    private float weeklyHours;

    public Course(int courseId, String name, float weeklyHours) {
        this.courseId = courseId;
        this.name = name;
        this.weeklyHours = weeklyHours;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getWeeklyHours() {
        return weeklyHours;
    }

    public void setWeeklyHours(float weeklyHours) {
        this.weeklyHours = weeklyHours;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseId=" + courseId +
                ", name='" + name + '\'' +
                ", weeklyHours=" + weeklyHours +
                '}';
    }
}



