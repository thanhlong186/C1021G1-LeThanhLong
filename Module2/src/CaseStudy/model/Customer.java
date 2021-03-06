package CaseStudy.model;

public class Customer extends Person {
    private String dentityCard;
    private String phonNumber;
    private String email;
    private String guestType;

    public Customer() {
    }

    public Customer(String id, String name,
                    String sex, String age,
                    String address, String dentityCard,
                    String phonNumber, String email,
                    String guestType) {
        super(id, name, sex, age, address);
        this.dentityCard = dentityCard;
        this.phonNumber = phonNumber;
        this.email = email;
        this.guestType = guestType;
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

    public String getGuestType() {
        return guestType;
    }

    public void setGuestType(String guestType) {
        this.guestType = guestType;
    }

    @Override
    public String toString() {
        return "Customer{" + super.toString() +
                "dentityCard='" + dentityCard + '\'' +
                ", phonNumber='" + phonNumber + '\'' +
                ", email='" + email + '\'' +
                ", guestType='" + guestType + '\'' +
                '}';
    }
}
