package extra_exercises.bai_2.model;

public class Student1 implements Comparable<Student1> {
    private int id;
    private String fullName;
    private String dayOfBirth;
    private String gender;
    private String nameClass;
    private String course;

    public Student1() {
    }

    public Student1(int id, String fullName, String dayOfBirth, String gender, String nameClass, String course) {
        this.id = id;
        this.fullName = fullName;
        this.dayOfBirth = dayOfBirth;
        this.gender = gender;
        this.nameClass = nameClass;
        this.course = course;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(String dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNameClass() {
        return nameClass;
    }

    public void setNameClass(String nameClass) {
        this.nameClass = nameClass;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student1{" + "\t" +
                "id=" + id + "\t" +
                ", fullName='" + fullName + '\'' + "\t" +
                ", dayOfBirth='" + dayOfBirth + '\'' +
                ", gender='" + gender + '\'' +
                ", nameClass='" + nameClass + '\'' +
                ", course='" + course + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student1 o) {
        return getId() - o.getId();
    }
}
