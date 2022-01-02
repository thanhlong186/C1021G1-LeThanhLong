package CaseStudy.model;

public class Booking {
    private int idBooking;
    private String startDate;
    private String endDate;
    private Customer idCustomer;
    private String nameService;
//    private String TypeService;

    public Booking() {
    }

    public Booking(int idBooking, String startDate, String endDate,
                   Customer idCustomer, String nameService) {
        this.idBooking = idBooking;
        this.startDate = startDate;
        this.endDate = endDate;
        this.idCustomer = idCustomer;
        this.nameService = nameService;
//        TypeService = typeService;
    }


    public int getIdBooking() {
        return idBooking;
    }

    public void setIdBooking(int idBooking) {
        this.idBooking = idBooking;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public Customer getIdCustomer()
    {
        return idCustomer;
    }

    public void setIdCustomer(Customer idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

//    public String getTypeService() {
//        return TypeService;
//    }
//
//    public void setTypeService(String typeService) {
//        TypeService = typeService;
//    }

    @Override
    public String toString() {
        return "Booking{" +
                "idBooking=" + idBooking +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                ", idCustomer='" + idCustomer + '\'' +
                ", nameService='" + nameService + '\'' +
//                ", TypeService='" + TypeService + '\'' +
                '}';
    }
}
