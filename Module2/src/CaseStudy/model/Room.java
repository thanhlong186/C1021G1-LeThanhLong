package CaseStudy.model;

public class Room extends Facility{
   private String freeService;

   public Room() {
   }

   public Room(String idFacility,
               String nameService,
               double usedArea,
               double rentalCosts,
               double maxAmount,
               String rentalType, String freeService) {
      super(idFacility, nameService, usedArea, rentalCosts, maxAmount, rentalType);
      this.freeService = freeService;
   }

   public String getFreeService() {
      return freeService;
   }

   public void setFreeService(String freeService) {
      this.freeService = freeService;
   }

   @Override
   public String toString() {
      return "Room{" +
              "ID Room='" + getIdFacility() + '\'' +
              "NameService='" + getNameService() + '\'' +
              ", UsedArea=" + getUsedArea() +
              ", RentalCosts=" + getRentalCosts() +
              ", RentalType='" + getRentalType() + '\'' +
               "FreeService='" + freeService + '\'' +
              '}';
   }
}
