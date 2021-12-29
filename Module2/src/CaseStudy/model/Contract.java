package CaseStudy.model;

public class Contract {
    private String idContract;
    private Booking idBooking;
    private String pre;
    private String tutorPayment;
    private Customer idCustomer;

    public Contract() {
    }

    public Contract(String idContract, Booking idBooking, String pre, String tutorPayment, Customer idCustomer) {
        this.idContract = idContract;
        this.idBooking = idBooking;
        this.pre = pre;
        this.tutorPayment = tutorPayment;
        this.idCustomer = idCustomer;
    }

    public String getIdContract() {
        return idContract;
    }

    public void setIdContract(String idContract) {
        this.idContract = idContract;
    }

    public Booking getIdBooking() {
        return idBooking;
    }

    public String getPre() {
        return pre;
    }

    public void setPre(String pre) {
        this.pre = pre;
    }

    public void setIdBooking(Booking idBooking) {
        this.idBooking = idBooking;
    }

    public String getTutorPayment() {
        return tutorPayment;
    }

    public void setTutorPayment(String tutorPayment) {
        this.tutorPayment = tutorPayment;
    }

    public Customer getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(Customer idCustomer) {
        this.idCustomer = idCustomer;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "idContract='" + idContract + '\'' +
                ", idBooking=" + idBooking +
                ", pre=" + getPre() + '\'' +
                ", tutorPayment='" + tutorPayment + '\'' +
                ", idCustomer=" + idCustomer +
                '}';
    }
}
