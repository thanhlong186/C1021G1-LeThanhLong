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

    static {
        readerVilla();
        readerHouse();
        readerRoom();
    }
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
                            villa.getMaxAmount() + "," + villa.getRentalType() + "," + villa.getStandardVilla() + "," + villa.getAreaPool() + "," + villa.getFloor());
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
                    bufferedWriterRoom.write(room.getIdFacility() + "," + room.getNameService() + "," + room.getUsedArea() + "," + room.getRentalCosts() + ","
                            + room.getMaxAmount() + "," + room.getRentalType() + "," + room.getFreeService());
                    bufferedWriterRoom.newLine();
                    bufferedWriterRoom.close();
                }

            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Map<Facility, Integer> readerVilla() {
        Map<Facility, Integer> entry = new LinkedHashMap<>();
        try {
            FileReader fileReader = new FileReader(new File("/Users/thanhlong/Documents/codegym/Module2/src/CaseStudy/data/FacilityVilla.csv"));
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            String[] temp;
            Villa villa = null;
            while ((line = bufferedReader.readLine()) != null) {
                temp = line.split(",");
                villa = new Villa(temp[0], temp[1], Double.parseDouble(temp[2]),
                        Double.parseDouble(temp[3]), Double.parseDouble(temp[4]), temp[5], temp[6],
                        Double.parseDouble(temp[7]), Integer.parseInt(temp[8]));
                entry.put(villa, 1);
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

    public static Map<Facility,Integer> readerHouse() {
        Map<Facility, Integer> entryHouse = new LinkedHashMap<>();
        try {
            FileReader fileReader = new FileReader(new File("/Users/thanhlong/Documents/codegym/Module2/src/CaseStudy/data/FacilityHouse.csv"));
            BufferedReader br = new BufferedReader(fileReader);
            String line;
            String[] temp;
            House house = null;
            while ((line = br.readLine()) != null) {
                temp = line.split(",");
                house = new House(temp[0], temp[1], Double.parseDouble(temp[2]),
                        Double.parseDouble(temp[3]), Double.parseDouble(temp[4]), temp[5], temp[6], Integer.parseInt(temp[7]));
                entryHouse.put(house, 1);
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

    public static  Map<Facility, Integer> readerRoom() {
        Map<Facility, Integer> entryRoom = new LinkedHashMap<>();
        try{
            FileReader fileReader = new FileReader(new File("/Users/thanhlong/Documents/codegym/Module2/src/CaseStudy/data/FacilityRoom.csv"));
            BufferedReader br1 = new BufferedReader(fileReader);
            String line;
            String[] temp;
            Room room = null;
            while ((line = br1.readLine()) != null) {
                temp = line.split(",");
                room = new Room(temp[0], temp[1], Double.parseDouble(temp[2]),
                        Double.parseDouble(temp[3]), Double.parseDouble(temp[4]), temp[5], temp[6]);
                entryRoom.put(room, 1);
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
            int choice = 0;
            String id = "";

            do {
                System.out.print("Nh???p m?? d???ch v???: ");
                id = scanner.nextLine();
            } while (!Pattern.matches("^[S][V][V][L][-][0-9]{4}$", id));

            String name = "";
            do {
            System.out.println("Nh???p t??n d???ch v???. ");
            System.out.print("H??y nh???p ch??? c??i ?????u ti??n in hoa: \t");
            name = scanner.nextLine();
            }while (!Pattern.matches("^[A-Z]{1}[a-z]+$", name));

            System.out.print("Nh???p di???n t??ch s??? d???ng: ");
            try {
                choice = Integer.parseInt(scanner.nextLine());
            }catch (NumberFormatException e) {
                System.out.println("Nh???p sai ?????nh d???ng. Vui l??ng nh???p l???i b???ng s???.");
            }
            double area = Double.parseDouble(scanner.nextLine());
            while(area < 30) {
            System.out.print("Vui l??ng nh???p di???n t??ch l???n h??n 30m2: \t");
            area = Double.parseDouble(scanner.nextLine());
            }


            System.out.print("Nh???p chi ph??: ");
            try {
                choice = Integer.parseInt(scanner.nextLine());
            }catch (NumberFormatException e) {
                System.out.println("Nh???p sai ?????nh d???ng. Vui l??ng nh???p l???i b???ng s???.");
            }
            double cost = Double.parseDouble(scanner.nextLine());
            while (cost < 0) {
                System.out.print("Vui l??ng nh???p l???i b???ng s??? d????ng: \t");
                cost = Double.parseDouble(scanner.nextLine());
            }

            System.out.print("Nh???p s??? l?????ng ng?????i: ");
            try {
                choice = Integer.parseInt(scanner.nextLine());
            }catch (NumberFormatException e) {
                System.out.println("Nh???p sai ?????nh d???ng. Vui l??ng nh???p l???i b???ng s???.");
            }
            double amount = Double.parseDouble(scanner.nextLine());
            while(amount < 0 || amount > 20) {
                System.out.print("S??? l?????ng ph???i l???n h??n 0 v?? b?? h??n 20: \t");
                amount = Double.parseDouble(scanner.nextLine());
            }

            String type = "";
            do{
                System.out.print("Nh??p ki???u thu?? (Hour/Day/Month/Year): \t");
                type = scanner.nextLine();
            }while (!Pattern.matches("^[A-Z]{1}[a-z]+$", type));

        String standard = "";
        System.out.print("Nh???p ti??u chu???n ph??ng: ");
        standard = scanner.nextLine();
        while (!Pattern.matches("^[A-Z]{1}[a-z]+$", standard)) {
            System.out.print("Kh??ng ????ng ?????nh d???ng! Vui l??ng nh???p l???i b???ng ch??? c??i hoa ?????u ti??n: \t");
            standard = scanner.nextLine();
        }

        System.out.print("Nh???p di???n t??ch h??? b??i : ");
        try {
            choice = Integer.parseInt(scanner.nextLine());
        }catch (NumberFormatException e) {
            System.out.println("Nh???p sai ?????nh d???ng. Vui l??ng nh???p l???i b???ng s???.");
        }
        double areaPool = Double.parseDouble(scanner.nextLine());
        while(areaPool < 30) {
            System.out.print("Vui l??ng nh???p di???n t??ch h??? b??i l???n h??n 30m2: \t");
            areaPool = Double.parseDouble(scanner.nextLine());
        }
        System.out.print("Nh???p s??? t???ng: ");
        try {
            choice = Integer.parseInt(scanner.nextLine());
        }catch (NumberFormatException e) {
            System.out.println("Nh???p sai ?????nh d???ng. Vui l??ng nh???p l???i b???ng s???.");
        }
        int floor = Integer.parseInt(scanner.nextLine());
        while (floor < 0) {
            System.out.print("Vui l??ng nh???p l???i b???ng s??? d????ng: \t");
            floor = Integer.parseInt(scanner.nextLine());
        }

            Villa villa = new Villa(id, name, area, cost, amount, type, standard, areaPool, floor);
            facilityIntegerMap.put(villa, 0);
            write();
            System.out.println("???? th??m m???i th??nh c??ng");
        }


    @Override
    public void ad??NewHouse() {
        String id = "";
        do {
            System.out.print("Nh???p m?? d???ch v???:: ");
            id = scanner.nextLine();
        }while (!Pattern.matches("^[S][V][H][O][-][0-9]{4}$", id));

        String name = "";
        do {
            System.out.println("Nh???p t??n d???ch v??? s??? d???ng. ");
            System.out.print("H??y nh???p ch??? c??i ?????u ti??n in hoa: \t");
            name = scanner.nextLine();
        }while (!Pattern.matches("^[A-Z]{1}[a-z]+$", name));

        System.out.print("Nh???p di???n t??ch s??? d???ng: ");
        double area = Double.parseDouble(scanner.nextLine());
        while(area < 30) {
            System.out.print("Vui l??ng nh???p di???n t??ch l???n h??n 30m2: \t");
            area = Double.parseDouble(scanner.nextLine());
        }

        System.out.print("Nh???p chi phi: ");
        double cost1 = Double.parseDouble(scanner.nextLine());
        while (cost1 < 0) {
            System.out.print("Vui l??ng nh???p l???i b???ng s??? d????ng");
            cost1 = Double.parseDouble(scanner.nextLine());
        }

        System.out.print("Nh???p s??? l?????ng ng?????i: ");
        double amount = Double.parseDouble(scanner.nextLine());
        while(amount < 0 || amount > 20) {
            System.out.print("So luong phai l???n h??n 0 va b?? h??n 20: ");
            amount = Double.parseDouble(scanner.nextLine());
        }

        String type = " ";
        do {
            System.out.println("Nh??p ki???u thu?? (Hour/Day/Month/Year): ");
            type = scanner.nextLine();
        } while (!Pattern.matches("^[A-Z]{1}[a-z]+$", type));

        String standardRoom = " ";
        do {
            System.out.println("Nh???p ti??u chu???n: ");
            standardRoom = scanner.nextLine();
        } while(!Pattern.matches("^[A-Z]{1}[a-z]+$", standardRoom));

        System.out.println("Nh???p s??? t???ng: ");
        int floor = Integer.parseInt(scanner.nextLine());
        while (floor < 0) {
            System.out.println("Vui long nh???p l???i b???ng s??? d????ng:\t");
            floor = Integer.parseInt(scanner.nextLine());
        }
        House house = new House(id, name, area, cost1, amount, type, standardRoom, floor);
        facilityIntegerMap.put(house, 0);
        write();
        System.out.println("???? th??m m???i th??nh c??ng.");
    }

    @Override
    public void addNewRoom() {
        String id = "";
        do {
            System.out.println("Nh???p m?? d???ch v???: ");
            id = scanner.nextLine();
        }while (!Pattern.matches("^[S][V][R][O][-][0-9]{4}$", id));

        String name = "";
        do {
            System.out.println("Nh???p t??n d???ch v??? s??? d???ng: ");
            System.out.print("H??y nh???p b???ng ch??? c??i ?????u ti??n in hoa: \t");
            name = scanner.nextLine();
        }while (!Pattern.matches("^[A-Z]{1}[a-z]+$", name));

        System.out.println("Nh???p di???n t??ch s??? d???ng: ");
        double area = Double.parseDouble(scanner.nextLine());
        while(area < 30) {
            System.out.println("Vui l??ng nh???p di???n t??ch l???n h??n 30m2:\t");
            area = Double.parseDouble(scanner.nextLine());
        }

        System.out.println("Nh???p chi phi: ");
        double cost2 = Double.parseDouble(scanner.nextLine());
        while (cost2 < 0) {
            System.out.println("Vui l??ng nh???p l???i b???ng s??? d????ng:\t");
            cost2 = Double.parseDouble(scanner.nextLine());
        }

        System.out.println("Nh???p s??? l?????ng ng?????i: ");
        double amount = Double.parseDouble(scanner.nextLine());
        while(amount < 0 || amount > 20) {
            System.out.println("So luong phai l???n h??n 0 va b?? h??n 20:\t");
            amount = Double.parseDouble(scanner.nextLine());
        }

        String type = "";
        do {
            System.out.println("Nh??p ki???u thu??: ");
            type = scanner.nextLine();
        } while (!Pattern.matches("^[A-Z]{1}[a-z]+$", type));

        System.out.println("Nh???p d???ch v??? mi???n ph??: ");
        String freeService = scanner.nextLine();

        Room room = new Room(id, name, area, cost2, amount, type, freeService);
        facilityIntegerMap.put(room, 0);
        write();
        System.out.println("???? th??m m???i th??nh c??ng.");
    }


}
