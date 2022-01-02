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
        for (Contract contract : contractList) {
            System.out.println(contract.toString());;
        }
    }

    @Override
    public void createNewConstracts() {
        Queue<Booking> bookingQueue = new LinkedList<>();
        Set<Booking> bookingSet = new BookingServiceImpl().sendBooking();
        for(Booking booking : bookingSet) {
            bookingQueue.add(booking);
        }

        while (!bookingQueue.isEmpty()) {
            Booking booking = bookingQueue.poll();
            Customer customer = booking.getIdCustomer();

            System.out.println("Đang tạo hợp đồng cho Booking có thông tin: " + booking.toString());
            System.out.println("Đang tạo hợp đồng cho khách hàng có thông tin: " + customer.toString());
            System.out.println("Nhập mã hợp đồng: ");
            String id = scanner.nextLine();
            System.out.println("Nhập số tiền đã cọc trước: ");
            String pre = scanner.nextLine();
            System.out.println("Nhập số chi phí: ");
            String pay = scanner.nextLine();

            Contract contract = new Contract(id, booking, pre, pay, customer);
            contractList.add(contract);
            System.out.println("Đã tạo hợp đồng thành công: " + contract.toString());
        }
    }

    @Override
    public void editContracts() {
        System.out.println("Nhập mã hợp đồng bạn muốn sửa: ");
        String idEdit = scanner.nextLine();

        for(int i = 0; i < contractList.size(); i++) {
            if (contractList.get(i).getIdContract().equals(idEdit)) {

                System.out.println("Nhập mã hợp đồng: ");
                String id = scanner.nextLine();
                contractList.get(i).setIdContract(id);

                System.out.println("Nhập số tiền đã cọc trước");
                String pre = scanner.nextLine();
                contractList.get(i).setPre(pre);

                System.out.println("Nhập số chi phí: ");
                String pay = scanner.nextLine();
                contractList.get(i).setTutorPayment(pay);
            }else {
                System.out.println("Không có trong danh sách. Vui lòng nhập lại");
            }
        }
    for (Contract contract :  contractList) {
        System.out.println(contract.toString());
        System.out.println("Đã sửa thông tin thành công");
}
    }
}
