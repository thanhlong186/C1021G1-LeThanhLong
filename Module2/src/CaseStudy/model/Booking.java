package CaseStudy.model;

public class Booking {
    private int idBooking;
    private String startDate;
    private String endDate;
    private String idCustomer;
    private String nameService;
    private String TypeService;

    public Booking() {
    }

    public Booking(int idBooking, String startDate, String endDate,
                   String idCustomer, String nameService, String typeService) {
        this.idBooking = idBooking;
        this.startDate = startDate;
        this.endDate = endDate;
        this.idCustomer = idCustomer;
        this.nameService = nameService;
        TypeService = typeService;
    }

    public Booking(int id, String startDate, String endDate, Customer customer, Facility facility, String typeService) {
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

    public String getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(String idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public String getTypeService() {
        return TypeService;
    }

    public void setTypeService(String typeService) {
        TypeService = typeService;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "idBooking=" + idBooking +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                ", idCustomer='" + idCustomer + '\'' +
                ", nameService='" + nameService + '\'' +
                ", TypeService='" + TypeService + '\'' +
                '}';
    }
}