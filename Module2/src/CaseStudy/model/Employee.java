package CaseStudy.model;

public class Employee extends Person {
    private String dentityCard;
    private String phonNumber;
    private String email;
    private String level;
    private String position;
    private int salary;

    public Employee() {
    }

    public Employee(String id, String name, String sex, String age,
                    String address,
                    String dentityCard,
                    String phonNumber,
                    String email,
                    String level,
                    String position, int salary) {
        super(id, name, sex, age, address);
        this.dentityCard = dentityCard;
        this.phonNumber = phonNumber;
        this.email = email;
        this.level = level;
        this.position = position;
        this.salary = salary;
    }

    public String getDentityCard() {
        return dentityCard;
    }

    public void setDentityCard(String dentityCard) {
        this.dentityCard = dentityCard;
    }

    public String getPhonNumber() {
        return phonNumber;
    }

    public void setPhonNumber(String phonNumber) {
        this.phonNumber = phonNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }



    @Override
    public String toString() {
        return "Employee{" + super.toString() +
                "dentityCard='" + dentityCard + '\'' +
                ", phonNumber='" + phonNumber + '\'' +
                ", email='" + email + '\'' +
                ", level='" + level + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }
}
