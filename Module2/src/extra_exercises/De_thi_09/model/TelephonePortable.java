package extra_exercises.De_thi_09.model;

public class TelephonePortable extends Telephone {
    private String country;
    private String status;

    public TelephonePortable() {
    }

    public TelephonePortable(int idPhone, String namePhone,
                             Double price, int amount, String manufacturer,
                             String country, String status) {
        super(idPhone, namePhone, price, amount, manufacturer);
        this.country = country;
        this.status = status;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "TelephonePortable{" +
                super.toString() +
                "country='" + country + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
