package CaseStudy.model;

public class Villa extends Facility{
    private String standardVilla;
    private double areaPool;
    private int floor;

    public Villa() {
    }

    public Villa(String idFacility,
                 String nameService,
                 double usedArea,
                 double rentalCosts,
                 double maxAmount,
                 String rentalType,
                 String standardVilla,
                 double areaPool,
                 int floor) {
        super(idFacility, nameService, usedArea, rentalCosts, maxAmount, rentalType);
        this.standardVilla = standardVilla;
        this.areaPool = areaPool;
        this.floor = floor;
    }
}
