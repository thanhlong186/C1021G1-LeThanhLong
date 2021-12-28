package CaseStudy.service.Impl;

import CaseStudy.model.Facility;
import CaseStudy.model.Villa;
import CaseStudy.service.IFacilityService;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Pattern;

public class FacilityServiceImpl implements IFacilityService {
    private static Map<Facility, Integer> facilityIntegerMap = new LinkedHashMap<>();
    private static Scanner scanner = new Scanner(System.in);

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
            System.out.println("Nhap IdService: ");
            id = scanner.nextLine();
        } while (!Pattern.matches("^[S][V][V][L][-](1-9){4}$", id));

        System.out.println("Nhap ten: ");
        String name = scanner.nextLine();


            System.out.println("Nhap dien tich : ");
            double area = Double.parseDouble(scanner.nextLine());


            System.out.println("Nhap giá tiền: ");
            double cost = Double.parseDouble(scanner.nextLine());

            System.out.println("Nhap số lượng người: ");
            double amount = Double.parseDouble(scanner.nextLine());

            System.out.println("Nhap kiểu thuê: ");
            String type = scanner.nextLine();

            System.out.println("Nhap tieu chuan: ");
            String standard = scanner.nextLine();

            System.out.println("Nhap diện tích hồ bơi: ");
            double areaPool = Double.parseDouble(scanner.nextLine());

            System.out.println("Nhap số tầng: ");
            int floor = Integer.parseInt(scanner.nextLine());

            Villa villa = new Villa(id, name, area, cost, amount, type, standard, areaPool, floor);
            facilityIntegerMap.put(villa, 0);
            System.out.println("Đã thêm mới villa thành công");
        }


    @Override
    public void adđNewHouse() {
        String id = "";
        do {
            System.out.println("Nhap IdService: ");
            id = scanner.nextLine();
        }while (!Pattern.matches("^[S][V][H][O][-](1-9){4}$", id));

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
