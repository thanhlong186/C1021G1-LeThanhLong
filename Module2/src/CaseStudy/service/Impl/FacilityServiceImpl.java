package CaseStudy.service.Impl;

import CaseStudy.model.Facility;
import CaseStudy.model.House;
import CaseStudy.model.Room;
import CaseStudy.model.Villa;
import CaseStudy.service.IFacilityService;
import com.sun.java.swing.plaf.windows.WindowsTextAreaUI;

import java.io.*;
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
                if (element.getKey() instanceof Villa) {
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
                } else if (element.getKey() instanceof Room) {
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

    public Map<Facility, Integer> readerVilla() {
        Map<Facility, Integer> entry = new LinkedHashMap<>();
        try {
            FileReader fileReader = new FileReader("/Users/thanhlong/Documents/codegym/Module2/src/CaseStudy/data/FacilityVilla.csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            String[] temp;
            Villa villa = null;
            while ((line = bufferedReader.readLine()) != null) {
                temp = line.split(",");
                villa = new Villa(temp[0], temp[1], Double.parseDouble(temp[2]),
                        Double.parseDouble(temp[3]), Double.parseDouble(temp[4]), temp[5], temp[6],
                        Double.parseDouble(temp[7]), Integer.parseInt(temp[9]));
            }
            if (villa != null) {
                entry.put(villa, 1);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return entry;
    }

    public Map<Facility,Integer> readerHouse() {
        Map<Facility, Integer> entryHouse = new LinkedHashMap<>();
        try {
            FileReader fileReader = new FileReader("/Users/thanhlong/Documents/codegym/Module2/src/CaseStudy/data/FacilityHouse.csv");
            BufferedReader br = new BufferedReader(fileReader);
            String line;
            String[] temp;
            House house = null;
            while ((line = br.readLine()) != null) {
                temp = line.split(",");
                house = new House(temp[0], temp[1], Double.parseDouble(temp[2]),
                        Double.parseDouble(temp[3]), Double.parseDouble(temp[4]), temp[5], temp[6], Integer.parseInt(temp[7]));
            }
            if (house != null) {
                entryHouse.put(house, 1);
            }
            br.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return entryHouse;
    }

    public Map<Facility, Integer> readerRoom() {
        Map<Facility, Integer> entryRoom = new LinkedHashMap<>();
        try{
            FileReader fileReader = new FileReader("/Users/thanhlong/Documents/codegym/Module2/src/CaseStudy/data/FacilityRoom.csv");
            BufferedReader br1 = new BufferedReader(fileReader);
            String line;
            String[] temp;
            Room room = null;
            while ((line = br1.readLine()) != null) {
                temp = line.split(",");
                room = new Room(temp[0], temp[1], Double.parseDouble(temp[2]),
                        Double.parseDouble(temp[3]), Double.parseDouble(temp[4]), temp[5], temp[6]);
        }
            if(room != null) {
                entryRoom.put(room, 1);
            }
            br1.close();
    } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return entryRoom;
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
            System.out.print("Nhập mã dịch vụ: ");
            id = scanner.nextLine();
        } while (!Pattern.matches("^[S][V][V][L][-][0-9]{4}$", id));

        String name = "";
        do {
            System.out.println("Nhập tên dịch vụ. ");
            System.out.print("Hãy nhập chữ cái đầu tiên in hoa: \t");
            name = scanner.nextLine();
        }while (!Pattern.matches("^[A-Z]{1}[a-z]+$", name));

        System.out.print("Nhập diện tích sử dụng: ");
        double area = Double.parseDouble(scanner.nextLine());
        while(area < 30) {
            System.out.print("Vui lòng nhập diện tích lớn hơn 30m2: \t");
            area = Double.parseDouble(scanner.nextLine());
        }


            System.out.print("Nhập chi phí: ");
            double cost = Double.parseDouble(scanner.nextLine());
            while (cost < 0) {
                System.out.print("Vui lòng nhập lại bằng số dương: \t");
                cost = Double.parseDouble(scanner.nextLine());
            }

            System.out.print("Nhập số lượng người: ");
            double amount = Double.parseDouble(scanner.nextLine());
            while(amount < 0 || amount > 20) {
                System.out.print("Số lượng phải lớn hơn 0 và bé hơn 20: \t");
                amount = Double.parseDouble(scanner.nextLine());
            }

            String type = "";
            do{
                System.out.print("Nhâp kiểu thuê (Hour/Day/Month/Year): \t");
                type = scanner.nextLine();
            }while (!Pattern.matches("^[A-Z]{1}[a-z]+$", type));

        String standard = "";
        System.out.print("Nhập tiêu chuẩn phòng: ");
        standard = scanner.nextLine();
        while (!Pattern.matches("^[A-Z]{1}[a-z]+$", standard)) {
            System.out.print("Không đúng định dạng! Vui lòng nhập lại bằng chữ cái hoa đầu tiên: \t");
            standard = scanner.nextLine();
        }

        System.out.print("Nhập diện tích hồ bơi : ");
        double areaPool = Double.parseDouble(scanner.nextLine());
        while(areaPool < 30) {
            System.out.print("Vui lòng nhập diện tích hồ bơi lớn hơn 30m2: \t");
            areaPool = Double.parseDouble(scanner.nextLine());
        }
        System.out.print("Nhập số tầng: ");
        int floor = Integer.parseInt(scanner.nextLine());
        while (floor < 0) {
            System.out.print("Vui lòng nhập lại bằng số dương: \t");
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
            System.out.print("Nhập mã dịch vụ:: ");
            id = scanner.nextLine();
        }while (!Pattern.matches("^[S][V][H][O][-][0-9]{4}$", id));

        String name = "";
        do {
            System.out.println("Nhập tên dịch vụ sử dụng. ");
            System.out.print("Hãy nhập chữ cái đầu tiên in hoa: \t");
            name = scanner.nextLine();
        }while (!Pattern.matches("^[A-Z]{1}[a-z]+$", name));

        System.out.print("Nhập diện tích sử dụng: ");
        double area = Double.parseDouble(scanner.nextLine());
        while(area < 30) {
            System.out.print("Vui lòng nhạp diện tích lớn hơn 30m2: \t");
            area = Double.parseDouble(scanner.nextLine());
        }

        System.out.print("Nhập chi phi: ");
        double cost1 = Double.parseDouble(scanner.nextLine());
        while (cost1 < 0) {
            System.out.print("Vui lòng nhập lại bằng số dương");
            cost1 = Double.parseDouble(scanner.nextLine());
        }

        System.out.print("Nhập số lượng người: ");
        double amount = Double.parseDouble(scanner.nextLine());
        while(amount < 0 || amount > 20) {
            System.out.print("So luong phai lớn hơn 0 va bé hơn 20: ");
            amount = Double.parseDouble(scanner.nextLine());
        }

        String type = " ";
        do {
            System.out.println("Nhâp kiểu thuê (Hour/Day/Month/Year): ");
            type = scanner.nextLine();
        } while (!Pattern.matches("^[A-Z]{1}[a-z]+$", type));

        String standardRoom = " ";
        do {
            System.out.println("Nhập tiêu chuẩn: ");
            standardRoom = scanner.nextLine();
        } while(!Pattern.matches("^[A-Z]{1}[a-z]+$", standardRoom));

        System.out.println("Nhập số tầng: ");
        int floor = Integer.parseInt(scanner.nextLine());
        while (floor < 0) {
            System.out.println("Vui long nhập lại bằng số dương:\t");
            floor = Integer.parseInt(scanner.nextLine());
        }
        House house = new House(id, name, area, cost1, amount, type, standardRoom, floor);
        facilityIntegerMap.put(house, 0);
        write();
        System.out.println("Đã thêm mới thành công.");
    }

    @Override
    public void addNewRoom() {
        String id = "";
        do {
            System.out.println("Nhập mã dịch vụ: ");
            id = scanner.nextLine();
        }while (!Pattern.matches("^[S][V][R][O][-][0-9]{4}$", id));

        String name = "";
        do {
            System.out.println("Nhập tên dịch vụ sử dụng: ");
            System.out.print("Hãy nhập bẵng chữ cái đầu tiên in hoa: \t");
            name = scanner.nextLine();
        }while (!Pattern.matches("^[A-Z]{1}[a-z]+$", name));

        System.out.println("Nhập diện tích sử dụng: ");
        double area = Double.parseDouble(scanner.nextLine());
        while(area < 30) {
            System.out.println("Vui lòng nhạp diện tích lớn hơn 30m2:\t");
            area = Double.parseDouble(scanner.nextLine());
        }

        System.out.println("Nhập chi phi: ");
        double cost2 = Double.parseDouble(scanner.nextLine());
        while (cost2 < 0) {
            System.out.println("Vui lòng nhập lại bằng số dương:\t");
            cost2 = Double.parseDouble(scanner.nextLine());
        }

        System.out.println("Nhập số lượng người: ");
        double amount = Double.parseDouble(scanner.nextLine());
        while(amount < 0 || amount > 20) {
            System.out.println("So luong phai lớn hơn 0 va bé hơn 20:\t");
            amount = Double.parseDouble(scanner.nextLine());
        }

        String type = "";
        do {
            System.out.println("Nhâp kiểu thuê: ");
            type = scanner.nextLine();
        } while (!Pattern.matches("^[A-Z]{1}[a-z]+$", type));

        System.out.println("Nhập dịch vụ miễn phí: ");
        String freeService = scanner.nextLine();

        Room room = new Room(id, name, area, cost2, amount, type, freeService);
        facilityIntegerMap.put(room, 0);
        write();
        System.out.println("Đã thêm mới thành công.");
    }


}
