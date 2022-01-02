package CaseStudy.service.Impl;

import CaseStudy.Utils.BookingComparator;
import CaseStudy.model.*;
import CaseStudy.service.IBookingService;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class BookingServiceImpl implements IBookingService {
    static Scanner sc = new Scanner(System.in);

    static Set<Booking> bookingSet = new TreeSet<>(new BookingComparator());
    static List<Customer> customerList = new ArrayList<>();
    static Map<Facility, Integer> facilityIntegerMap = new LinkedHashMap<>();

    static {
        readerCustomer();
        readFile();
//        readerVilla();
//        readerRoom();
//        readerHouse();
    }

    public static void readFile(){
        for (Map.Entry<Facility, Integer> entryVilla : readerVilla().entrySet()) {
            facilityIntegerMap.put(entryVilla.getKey(), 1);
        }
        for (Map.Entry<Facility, Integer> entryHouse : readerHouse().entrySet()) {
            facilityIntegerMap.put(entryHouse.getKey(), 1);
        }
        for (Map.Entry<Facility, Integer> entryRoom : readerRoom().entrySet()) {
            facilityIntegerMap.put(entryRoom.getKey(),1);
        }
    }


    public Set<Booking> sendBooking() {
        return bookingSet;
    }

    public static void readerCustomer() {
        try {
            FileReader fileReader = new FileReader("/Users/thanhlong/Documents/codegym/Module2/src/CaseStudy/data/Customer.csv");
            BufferedReader br = new BufferedReader(fileReader);
            String Data = null;
            while ((Data = br.readLine()) != null) {
                String[] dataArray = Data.split(",");
                Customer customer = new Customer(dataArray[0],
                        dataArray[1],
                        dataArray[2], dataArray[3], dataArray[4], dataArray[5], dataArray[6], dataArray[7], dataArray[8]);
                customerList.add(customer);
            }
            br.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

//    static void readerFacility() {
//        for (Map.Entry<Facility, Integer> entry : readerVilla().entrySet()) {
//            facilityIntegerMap.put(entry.getKey(), entry.getValue());
//        }
//        for (Map.Entry<Facility, Integer> entry : readerHouse().entrySet()) {
//            facilityIntegerMap.put(entry.getKey(), entry.getValue());
//        }
//        for (Map.Entry<Facility, Integer> entry : readerRoom().entrySet()) {
//            facilityIntegerMap.put(entry.getKey(), entry.getValue());
//        }
//    }


        public static Map<Facility, Integer> readerVilla () {
            Map<Facility, Integer> entryVilla = new LinkedHashMap<>();
            try {
                FileReader fileReader = new FileReader("/Users/thanhlong/Documents/codegym/Module2/src/CaseStudy/data/FacilityVilla.csv");
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                String Data = null;

                while ((Data = bufferedReader.readLine()) != null) {
                    String[] villaArray = Data.split(",");
                    Villa villa = new Villa(villaArray[0], villaArray[1], Double.parseDouble(villaArray[2]),
                            Double.parseDouble(villaArray[3]), Double.parseDouble(villaArray[4]), villaArray[5], villaArray[6],
                            Double.parseDouble(villaArray[7]), Integer.parseInt(villaArray[8]));
                    entryVilla.put(villa, 1);
                }
                bufferedReader.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return entryVilla;
        }

        public static Map<Facility, Integer> readerHouse () {
            Map<Facility, Integer> entryHouse = new LinkedHashMap<>();
            try {
                FileReader fileReader = new FileReader("/Users/thanhlong/Documents/codegym/Module2/src/CaseStudy/data/FacilityHouse.csv");
                BufferedReader br = new BufferedReader(fileReader);
                String Data = null;
                while ((Data = br.readLine()) != null) {
                    String[] houseArray = Data.split(",");
                    House house = new House(houseArray[0], houseArray[1], Double.parseDouble(houseArray[2]),
                            Double.parseDouble(houseArray[3]), Double.parseDouble(houseArray[4]), houseArray[5], houseArray[6], Integer.parseInt(houseArray[7]));
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

        public static Map<Facility, Integer> readerRoom () {
            Map<Facility, Integer> entryRoom = new LinkedHashMap<>();
            try {
                FileReader fileReader = new FileReader("/Users/thanhlong/Documents/codegym/Module2/src/CaseStudy/data/FacilityRoom.csv");
                BufferedReader br1 = new BufferedReader(fileReader);
                String Data = null;
                while ((Data = br1.readLine()) != null) {
                    String[] roomArray = Data.split(",");
                    Room room = new Room(roomArray[0], roomArray[1], Double.parseDouble(roomArray[2]),
                            Double.parseDouble(roomArray[3]), Double.parseDouble(roomArray[4]), roomArray[5],roomArray[6]);
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
        public void addNewBooking () {

            int id = 1;
            if (!bookingSet.isEmpty()) {
                id = bookingSet.size() + 1;
            }
            System.out.println(customerList.size());
            Customer customer = chooseCustomer();
            Facility facility = chooseCFacility();
            System.out.println("Nhập ngày bắt đầu thuê phòng: ");
            String startDate = sc.nextLine();
            System.out.println("Nhập ngày trả phòng: ");
            String endDate = sc.nextLine();
            Booking booking = new Booking(id, startDate, endDate,customer, facility.getNameService());

            bookingSet.add(booking);
            System.out.println("Đã booking thành công.");

        }

        @Override
        public void disPlayListBooking () {
            for (Booking booking : bookingSet) {
                System.out.println(booking.toString());
            }

        }

        public static Customer chooseCustomer () {
        Customer customerNew = new Customer();
            System.out.println("Danh sách khách hàng: ");
            for (Customer customer : customerList) {
                System.out.println(customer.toString());
            }
            System.out.println("Nhập mã khách hàng: ");
            boolean check = true;
            Scanner sc = new Scanner(System.in);
            String id = sc.nextLine();

            while (check) {
                for (Customer customer : customerList) {
                    if (customer.getId().equals(id)) {
                        check = false;
                        customerNew = customer;
                    }
                }
                if (check) {
                    System.out.println("Bạn đã nhập sai, vui lòng nhập lại.");
                    id = sc.nextLine();
                }
            }
            return customerNew;
        }

        public static Facility chooseCFacility () {
            System.out.println("Danh sach dich vu: ");
            for (Map.Entry<Facility, Integer> entry : facilityIntegerMap.entrySet()) {
                System.out.println(entry.getKey().toString());
            }
            System.out.println("Nhap mã dịch vụ");
            boolean check = true;
            Scanner sc = new Scanner(System.in);
            String id = sc.nextLine();

            while (check) {
                for (Map.Entry<Facility, Integer> entry : facilityIntegerMap.entrySet()) {
                    if (id.equals(entry.getKey().getIdFacility())) {
                        check = false;
                        return entry.getKey();
                    }
                }
                if (check) {
                    System.out.println("Ban da nhap sai, vui long nhap lai");
                    id = sc.nextLine();
                }
            }
            return null;
        }
    }
