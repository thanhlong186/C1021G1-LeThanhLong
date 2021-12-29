package CaseStudy.model;

public class House extends Facility{
    private String standardRoom;
    private int floor;

    public House() {
    }

    public House(String idFacility,
                 String nameService,
                 double usedArea,
                 double rentalCosts,
                 double maxAmount,
                 String rentalType,
                 String standardRoom,
                 int floor) {
        super(idFacility, nameService, usedArea, rentalCosts, maxAmount, rentalType);
        this.standardRoom = standardRoom;
        this.floor = floor;
    }

    public String getStandardRoom() {
        return standardRoom;
    }

    public void setStandardRoom(String standardRoom) {
        this.standardRoom = standardRoom;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    @Override
    public String toString() {
        return "House{" +
                "ID House='" + getIdFacility() + '\'' +
                "NameService='" + getNameService() + '\'' +
                ", UsedArea=" + getUsedArea() +
                ", RentalCosts=" + getRentalCosts() +
                ", MaxAmount=" + getMaxAmount() +
                ", RentalType='" + getRentalType() + '\'' +
                "StandardRoom='" + standardRoom + '\'' +
                ", Floor=" + floor +
                '}';
    }
}
