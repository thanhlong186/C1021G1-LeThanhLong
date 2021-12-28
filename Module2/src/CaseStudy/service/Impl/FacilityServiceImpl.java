package CaseStudy.service.Impl;

import CaseStudy.model.Facility;
import CaseStudy.model.House;
import CaseStudy.model.Room;
import CaseStudy.model.Villa;
import CaseStudy.service.IFacilityService;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Pattern;

public class FacilityServiceImpl implements IFacilityService {
    private static Map<Facility, Integer> facilityIntegerMap = new LinkedHashMap<>();
    private static Scanner scanner = new Scanner(System.in);

    public void write() {
        try {
            FileWriter fileWriterVilla = new FileWriter("/Users/thanhlong/Documents/codegym/Module2/src/CaseStudy/data/FacilityVilla.csv");
            FileWriter fileWriterHouse = new FileWriter("/Users/thanhlong/Documents/codegym/Module2/src/CaseStudy/data/FacilityHouse.csv");
            FileWriter fileWriterRoom = new FileWriter("/Users/thanhlong/Documents/codegym/Module2/src/CaseStudy/data/FacilityRoom.csv");
            BufferedWriter bufferedWriterVilla = new BufferedWriter(fileWriterVilla);
            BufferedWriter bufferedWriterHouse = new BufferedWriter(fileWriterHouse);
            BufferedWriter bufferedWriterRoom = new BufferedWriter(fileWriterRoom);
            for (Map.Entry<Facility, Integer> element : facilityIntegerMap.entrySet()) {
                if (element.getKey()instanceof Villa) {
                    Villa villa = (Villa) element.getKey();
                    bufferedWriterVilla.write(villa.getIdFacility() + "," + villa.getNameService() + "," + villa.getUsedArea() + "," + villa.getRentalCosts() + "," +
                            villa.getMaxAmount() + "," + villa.getRentalType() + "," + villa.getStandardVilla() + "," + villa.getAreaPool() + villa.getFloor());
                    bufferedWriterVilla.newLine();
                    bufferedWriterVilla.close();
                } else if (element.getKey() instanceof House) {
                    House house = (House) element.getKey();
                    bufferedWriterHouse.write(house.getIdFacility() + "," + house.getNameService() + "," + house.getUsedArea() + "," +
                            house.getRentalCosts() + "," + house.getMaxAmount() + "," + house.getRentalType() + "," + house.getStandardRoom() + "," + house.getFloor());
                    bufferedWriterHouse.newLine();
                    bufferedWriterHouse.close();
                } else if ( element.getKey() instanceof Room) {
                    Room room = (Room) element.getKey();
                    bufferedWriterRoom.write(room.getIdFacility() + "," + room.getNameService() + "," + room + "," + room.getUsedArea() + "," + room.getRentalCosts() + "," + room.getMaxAmount() + "," +
                            room.getRentalType() + "," + room.getFreeService());
                    bufferedWriterRoom.newLine();
                    bufferedWriterRoom.close();
                }

            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void display() {
        for(Map.Entry<Facility, Integer> element : facilityIntegerMap.entrySet()) {
            System.out.println("dich vu: " + element.getKey() + "so lan thue da thue: " + element.getValue());
        }
    }

    @Override
    public void addMaintian() {

    }

    @Override
    public void addNewVilla() {
        String id = "";
        do {
            System.out.println("Nhập mã dịch vụ: ");
            id = scanner.nextLine();
        } while (!Pattern.matches("^[S][V][V][L][-](1-9){4}$", id));

        String name = "";
        do {
            System.out.println("Nhập tên dịch vụ: ");
            name = scanner.nextLine();
        }while (!Pattern.matches("^[A-Z]{1}[a-z]+$", name));

        System.out.println("Nhập diện tích sử dụng: ");
        double area = Double.parseDouble(scanner.nextLine());
        while(area < 30) {
            System.out.println("Vui lòng nhạp diện tích lớn hơn 30m2");
            area = Double.parseDouble(scanner.nextLine());
        }


            System.out.println("Nhập chi phi: ");
            double cost = Double.parseDouble(scanner.nextLine());
            while (cost < 0) {
                System.out.println("Vui lòng nhập lại bằng số dương");
                cost = Double.parseDouble(scanner.nextLine());
            }

            System.out.println("Nhập số lượng người: ");
            double amount = Double.parseDouble(scanner.nextLine());
            while(amount < 0 || amount > 20) {
                System.out.println("So luong phai lớn hơn 0 va bé hơn 20");
                amount = Double.parseDouble(scanner.nextLine());
            }

            String type = "";
            do {
                System.out.println("Nhâp kiểu thuê: ");
                type = scanner.nextLine();
            } while (!Pattern.matches("^[A-Z]{1}[a-z]+$", type));

            String standard = "";
            do {
                System.out.println("Nhập tiêu chuẩn: ");
                standard = scanner.nextLine();
            } while(!Pattern.matches("^[A-Z]{1}[a-z]+$", standard));

        System.out.println("Nhập diện tích hồ bơi : ");
        double areaPool = Double.parseDouble(scanner.nextLine());
        while(areaPool < 30) {
            System.out.println("Vui lòng nhập diện tích hồ bơi lớn hơn 30m2");
            areaPool = Double.parseDouble(scanner.nextLine());
        }
        System.out.println("Nhập số tầng: ");
        int floor = Integer.parseInt(scanner.nextLine());
        while (floor < 0) {
            System.out.println("Vui long nhập lại bằng số dương");
            floor = Integer.parseInt(scanner.nextLine());
        }

            Villa villa = new Villa(id, name, area, cost, amount, type, standard, areaPool, floor);
            facilityIntegerMap.put(villa, 0);
            write();
            System.out.println("Đã thêm mới thành công");
        }


    @Override
    public void adđNewHouse() {
        String id = "";
        do {
            System.out.println("Nhap IdService: ");
            id = scanner.nextLine();
        }while (!Pattern.matches("^[S][V][H][O][-](1-9){4}$", id));

        String name = "";
        do {
            System.out.println("Nhập tên dịch vụ sử dụng: ");
            name = scanner.nextLine();
        }while (!Pattern.matches("^[A-Z]{1}[a-z]+$", name));

        System.out.println("Nhập diện tích sử dụng: ");
        double area = Double.parseDouble(scanner.nextLine());
        while(area < 30) {
            System.out.println("Vui lòng nhạp diện tích lớn hơn 30m2");
            area = Double.parseDouble(scanner.nextLine());
        }

        System.out.println("Nhập chi phi: ");
        double cost1 = Double.parseDouble(scanner.nextLine());
        while (cost1 < 0) {
            System.out.println("Vui lòng nhập lại bằng số dương");
            cost1 = Double.parseDouble(scanner.nextLine());
        }

        System.out.println("Nhập số lượng người: ");
        double amount = Double.parseDouble(scanner.nextLine());
        while(amount < 0 || amount > 20) {
            System.out.println("So luong phai lớn hơn 0 va bé hơn 20");
            amount = Double.parseDouble(scanner.nextLine());
        }

        String type = "";
        do {
            System.out.println("Nhâp kiểu thuê: ");
            type = scanner.nextLine();
        } while (!Pattern.matches("^[A-Z]{1}[a-z]+$", type));

        String standardRoom = "";
        do {
            System.out.println("Nhập tiêu chuẩn: ");
            standardRoom = scanner.nextLine();
        } while(!Pattern.matches("^[A-Z]{1}[a-z]+$", standardRoom));

        System.out.println("Nhập số tầng: ");
        int floor = Integer.parseInt(scanner.nextLine());
        while (floor < 0) {
            System.out.println("Vui long nhập lại bằng số dương");
            floor = Integer.parseInt(scanner.nextLine());
        }
        House house = new House(id, name, area, cost1, amount, type, standardRoom, floor);
        facilityIntegerMap.put(house, 0);
        write();
        System.out.println("Đã thêm mới thành công");
    }

    @Override
    public void addNewRoom() {
        String id = "";
        do {
            System.out.println("Nhap IdService: ");
            id = scanner.nextLine();
        }while (!Pattern.matches("^[S][V][R][O][-](1-9){4}$", id));

    }
}
