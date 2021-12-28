package CaseStudy.service.Impl;

import CaseStudy.Utils.BookingComparator;
import CaseStudy.model.Booking;
import CaseStudy.model.Customer;
import CaseStudy.model.Facility;
import CaseStudy.model.Villa;
import CaseStudy.service.IBookingService;

import java.util.*;

public class BookingServiceImpl implements IBookingService {

    static Set<Booking> bookingSet = new TreeSet<>(new BookingComparator());
    static List<Customer> customerList = new ArrayList<>();
    static Map<Facility, Integer> facilityIntegerMap = new LinkedHashMap<>();

    static {
        customerList.add(new Customer("1", "Long", "Nam", "20", "ĐN", "1234567",
                "0905570954", "long@gmail.com", "vip"));
        customerList.add(new Customer("2", "Hương", "Nữ", "20", "QN", "1234567",
                "0905570954", "huongng@gmail.com", "vip"));
        facilityIntegerMap.put(new Villa("1", "Villa 1", 30.0, 200, 9,
                "Day", "vip", 15, 3), 0);
        facilityIntegerMap.put(new Villa("2", "Villa 2", 40.0, 300, 15,
                "Day", "Normal", 30, 3), 0);
    }

    @Override
    public void addNewBooking() {
        int id = 1;
        if (!bookingSet.isEmpty()) {
            id = bookingSet.size();
        }
        Scanner sc = new Scanner(System.in);
        Customer customer = chooseCustomer();
        Facility facility = chooseCFacility();
        System.out.println("Nhap ngay bat dau thue phong: ");
        String startDate = sc.nextLine();
        System.out.println("Nhap ngay tra phong: ");
        String endDate = sc.nextLine();
//        System.out.println("Nhap id khach hang: ");
//        String idCustomer = sc.nextLine();
//        System.out.println("Nhap ten dich vu: ");
//        String nameService = sc.nextLine();
        System.out.println("Nhap loai dich vu: ");
        String typeService = sc.nextLine();
        Booking booking = new Booking(id, startDate, endDate, customer, facility, typeService);

        bookingSet.add(booking);
        System.out.println("Da booking thanh cong");

    }

    @Override
    public void disPlayListBooking() {

    }

    public static Customer chooseCustomer() {
        System.out.println("Danh sach khanh hang: ");
        for (Customer customer : customerList) {
            System.out.println(customer.toString());
        }
        System.out.println("Nhap id khach hang");
        boolean check = true;
        Scanner sc = new Scanner(System.in);
        String id = sc.nextLine();

        while (check) {
            for (Customer customer : customerList) {
                if (id == customer.getId()) {
                    check = false;
                    return customer;
                }
            }
            if (check) {
                System.out.println("Ban da nhap sai, vui long nhap lai");
                id = sc.nextLine();
            }
        }
        return null;
    }

    public static Facility chooseCFacility() {
        System.out.println("Danh sach dich vu: ");
        for (Map.Entry<Facility, Integer> entry : facilityIntegerMap.entrySet()) {
            System.out.println(entry.getKey().toString());
        }
        System.out.println("Nhap id dich vu");
        boolean check = true;
        Scanner sc = new Scanner(System.in);
        String id = sc.nextLine();

        while (check) {
            for (Map.Entry<Facility, Integer> entry : facilityIntegerMap.entrySet()) {
                if (id.equals(entry.getKey().getIdFacility())){
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