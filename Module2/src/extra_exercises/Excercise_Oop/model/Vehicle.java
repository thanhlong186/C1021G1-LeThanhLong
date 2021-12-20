package extra_exercises.Excercise_Oop.model;

public class Vehicle {
    private int Id;
    private String nameVehicle;
    private double capacity;
    private double priceVehicle;

    public Vehicle() {
    }

    public Vehicle(int id, String nameVehicle, double capacity, double priceVehicle) {
        this.Id = id;
        this.nameVehicle = nameVehicle;
        this.capacity = capacity;
        this.priceVehicle = priceVehicle;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getNameVehicle() {
        return nameVehicle;
    }

    public void setNameVehicle(String nameVehicle) {
        this.nameVehicle = nameVehicle;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public double getPriceVehicle() {
        return priceVehicle;
    }

    public void setPriceVehicle(double priceVehicle) {
        this.priceVehicle = priceVehicle;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "Id=" + Id +
                ", nameVehicle='" + nameVehicle + '\'' +
                ", capacity=" + capacity +
                ", priceVehicle=" + priceVehicle +
                '}';
    }
}
