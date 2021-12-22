package CaseStudy.model;

public class Person {
    private int id;
    private String name;
    private String dayOfBirth;
    private String sex;
    private int age;
    private String address;

    public Person() {
    }

    public Person(int id, String name, String dayOfBirth, String sex, int age, String address) {
        this.id = id;
        this.name = name;
        this.dayOfBirth = dayOfBirth;
        this.sex = sex;
        this.age = age;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(String dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
