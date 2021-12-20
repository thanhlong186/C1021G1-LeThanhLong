package extra_exercises.Excercise_Oop.service;

import extra_exercises.Excercise_Oop.model.Vehicle;

import java.util.ArrayList;
import java.util.Scanner;

public class VehicleService implements IVehicleService {
    ArrayList<Vehicle> vehicleList = new ArrayList<>();
    private  static Scanner scanner = new Scanner(System.in);


    @Override
    public void addNewVehicle() {

        System.out.println("nhap id:");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap name: ");
        String name = scanner.nextLine();
        System.out.println("nhap gia xe:");
        double prices = Double.parseDouble(scanner.nextLine());
        System.out.println("nhap dung tich xe: ");
        double capacitys = Double.parseDouble((scanner.nextLine()));

        Vehicle vehicle1 = new Vehicle(id, name, prices, capacitys);
        vehicleList.add(vehicle1);
    }

    @Override
    public String displayTax() {
        String result = " ";
        for(Vehicle vehicle : vehicleList) {
            if (vehicle.getCapacity() < 100) {
                result += vehicle.getNameVehicle() + " " + vehicle.getPriceVehicle() + 0.01 + "\n";
            }else if (vehicle.getCapacity() >= 100 || vehicle.getCapacity() <= 200) {
                result += vehicle.getNameVehicle() + " " + vehicle.getPriceVehicle() + 0.03 + "\n";
            } else {
                result += vehicle.getNameVehicle() + " " + vehicle.getPriceVehicle() + 0.05 + "\n";
            }
        }
            return result;
    }
}
