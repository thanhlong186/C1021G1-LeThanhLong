package CaseStudy.service.Impl;

import CaseStudy.model.Booking;
import CaseStudy.model.Contract;
import CaseStudy.model.Customer;
import CaseStudy.service.IContractService;

import java.util.*;

public class ContractServiceImpl implements IContractService {

    static List<Contract> contractList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);


    @Override
    public void disPlayListContact() {

    }

    @Override
    public void createNewConstracts() {
        Queue<Booking> bookingQueue = new LinkedList<>();
        Set<Booking> bookingSet = new BookingServiceImpl().sendBooking();
        for(Booking booking : bookingSet) {
            bookingQueue.add(booking);
        }
        Booking booking = bookingQueue.poll();
        Customer customer = booking.getIdCustomer();

        System.out.println("Đang tạo hợp đồng cho Booking có thông tin: " + booking.toString());
        System.out.println("Đang tạo hợp đồng cho khach hang có thông tin: "+ customer.toString());
        System.out.println("Nhập mã hợp đồng: ");
        String id = scanner.nextLine();
        System.out.println("Nhập số tiền trả trước: ");
        String pre = scanner.nextLine();
        System.out.println("Nhập số chi phí: ");
        String pay = scanner.nextLine();

        Contract contract = new Contract(id, booking, pre, pay, customer);
        contractList.add(contract);
        System.out.println("Đã tạo hợp đồng thành công: " + contract.toString());

    }

    @Override
    public void editContracts() {

    }
}
