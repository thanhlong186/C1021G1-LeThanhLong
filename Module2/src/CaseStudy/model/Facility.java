package CaseStudy.model;

public abstract class Facility {
    private String idFacility;
    private String nameService;
    private double usedArea;
    private double rentalCosts;
    private double maxAmount;
    private String rentalType;

    public Facility() {
    }

    public Facility(String idFacility, String nameService, double usedArea, double rentalCosts,
                    double maxAmount, String rentalType) {
        this.idFacility= idFacility;
        this.nameService = nameService;
        this.usedArea = usedArea;
        this.rentalCosts = rentalCosts;
        this.maxAmount = maxAmount;
        this.rentalType = rentalType;
    }

    public String getIdFacility() {
        return idFacility;
    }

    public void setIdFacility(String idFacility) {
        this.idFacility = idFacility;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public double getUsedArea() {
        return usedArea;
    }

    public void setUsedArea(double usedArea) {
        this.usedArea = usedArea;
    }

    public double getRentalCosts() {
        return rentalCosts;
    }

    public void setRentalCosts(double rentalCosts) {
        this.rentalCosts = rentalCosts;
    }

    public double getMaxAmount() {
        return maxAmount;
    }

    public void setMaxAmount(double maxAmount) {
        this.maxAmount = maxAmount;
    }

    public String getRentalType() {
        return rentalType;
    }

    public void setRentalType(String rentalType) {
        this.rentalType = rentalType;
    }

    @Override
    public String toString() {
        return "Facility{" +
                "idFacility='" + idFacility + '\'' +
                "nameService='" + nameService + '\'' +
                ", usedArea=" + usedArea +
                ", rentalCosts=" + rentalCosts +
                ", maxAmount=" + maxAmount +
                ", rentalType='" + rentalType + '\'' +
                '}';
    }
}

