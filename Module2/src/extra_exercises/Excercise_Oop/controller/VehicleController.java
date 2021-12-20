package extra_exercises.Excercise_Oop.controller;

import extra_exercises.Excercise_Oop.service.IVehicleService;
import extra_exercises.Excercise_Oop.service.VehicleService;

import java.util.Scanner;

public class VehicleController {
    public static void main(String[] args) {
        IVehicleService iVehicleService = new VehicleService();
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("-------Menu-------");
            System.out.println("1.\t Tạo các đối tượng xe và nhập thông tin: ");
            System.out.println("2.\t Xuất bảng kê khai tiền thuế của các xe: ");
            System.out.println("3.\t Thoát: ");

            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    iVehicleService.addNewVehicle();
                    break;
                case 2:
                    String result = iVehicleService.displayTax();
                    System.out.println(result);
                    break;
                case 3:
                    System.exit(3);
                    break;
            }
        } while (true);

    }
}

