package CaseStudy.service.Impl;

import CaseStudy.model.Customer;
import CaseStudy.service.ICustomerService;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class CustomerServiceImpl implements ICustomerService {
    private static List<Customer> customerList = new LinkedList<>();
    private static Scanner scanner = new Scanner(System.in);
    public CustomerServiceImpl() {
        customerList = readerCustomer();
    }

    public void write()  {
        try {
        FileWriter fileWriter1 = new FileWriter("/Users/thanhlong/Documents/codegym/Module2/src/CaseStudy/data/Customer.csv");
            BufferedWriter bw1 = new BufferedWriter(fileWriter1);
            for (Customer customer : customerList) {
                bw1.write(customer.getId() + "," + customer.getName() + "," + customer.getSex() + "," + customer.getAge() + "," + customer.getAddress() + "," +
                        customer.getDentityCard() + "," + customer.getPhonNumber() + "," + customer.getEmail() + "," + customer.getGuestType() + "\n");
            }
            bw1.close();
    } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public List<Customer> readerCustomer() {
        List<Customer> customers = new LinkedList<>();
        try {
            FileReader fileReader = new FileReader(new File("/Users/thanhlong/Documents/codegym/Module2/src/CaseStudy/data/Customer.csv"));
            BufferedReader br = new BufferedReader(fileReader);
            String line;
            String[] temp;
            Customer customer = null;
            while ((line = br.readLine()) != null) {
                temp = line.split(",");
                customer = new Customer(temp[0], temp[1], temp[2], temp[3], temp[4], temp[5], temp[6], temp[7], temp[8]);
//                customers.add(customer);
            }
            if (customer != null) {
                customers.add(customer);
            }
            br.close();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return customers;
    }


    @Override
    public void display() {
        for (Customer customer : customerList) {
            System.out.println(customer.toString());
        }
    }

    @Override
    public void addNew() {
        int choose = 0;
        System.out.print("Nhập mã: ");
        String id = scanner.nextLine();

        System.out.print("Nhập họ và tên: ");
        String name = scanner.nextLine();


        System.out.println("Chọn giới tính: ");
        System.out.println("1.Nam" + "\n" + "2.Nữ");
        String sex = " ";
        try{
        choose = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
            System.out.println("Nhập sai định dạng. Vui lòng nhập lại.");
        }
        switch (choose) {
            case 1:
                sex = "Nam";
                break;
            case 2:
                sex = "Nữ";
                break;
        }

        String age;
        do {
            System.out.print("Nhập ngày sinh: ");
            age = scanner.nextLine();
        } while (!Pattern.matches("^(((0[1-9]|[12][0-9]|30)[-\\/](0[13-9]|1[012])|31[-\\/](0[13578]|1[02])|(0[1-9]|1[0-9]|2[0-8])[-\\/]02)" +
                "[-\\/](19[0-9]{2}|200[012])|29[-\\/]02[-\\/]" +
                "([0-9]{2}(([2468][048]|[02468][48])|[13579][26])|([13579][26]|[02468][048]|0[0-9]|1[0-6])00))$" , age));

        System.out.print("Nhập địa chỉ: ");
        String address = scanner.nextLine();

        String denityCard;
        do {
            System.out.print("Nhap chung minh thu/CCCC: ");
            denityCard = scanner.nextLine();
        } while (!Pattern.matches("^[0-9]{9}$", denityCard));

        String phoneNumber;
        do {
            System.out.print("Nhập số điện thoại: ");
            phoneNumber = scanner.nextLine();
        } while(!Pattern.matches("^0[0-9]{9}$", phoneNumber));

        String email;
        do {
            System.out.print("Nhập Email: ");
            email = scanner.nextLine();
        }while (!Pattern.matches("^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$", email));


        System.out.print("Nhập loại khách : ");
        System.out.print("1.Diamond " + "\n" + "2.Platinium" + "\n" + "3.Gold" + "\n" +
                "4.Silver " + "\n" + "5.Member");
        String guestType = " ";
        try {
            choose = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Nhập sai định dạng. Vui lòng nhập lại.");
        }
        switch (choose) {
            case 1:
                guestType = "Diamond";
                break;
            case 2:
                guestType = "Platinium";
                break;
            case 3:
                guestType = "Gold";
                break;
            case 4:
                guestType = "Silver";
                break;
            case 5:
                guestType = "Member";
        }

        Customer customer = new Customer(id, name, sex, age,
                address, denityCard, phoneNumber, email, guestType);
        customerList.add(customer);
        write();
        System.out.println("Đã thêm mới khách hàng thành công");
    }

    @Override
    public void edit() {
        System.out.println("Nhập mã khách hàng bạn muốn sửa: ");
        String idEdit = scanner.nextLine();
        for (int i = 0; i <customerList.size(); i++) {
            if (customerList.get(i).getId().equals(idEdit)) {

                System.out.print("Nhập mới tên khách hàng");
                String editNameCustomer = scanner.nextLine();
                customerList.get(i).setName(editNameCustomer);

                System.out.print("Nhập giới tính: ");
                String editSexCus = scanner.nextLine();
                customerList.get(i).setSex(editSexCus);

                System.out.print("Nhập tuỏi");
                String editAgeCus = scanner.nextLine();
                customerList.get(i).setAge(editAgeCus);

                System.out.print("Nhập địa chỉ: ");
                String editAddressCus = scanner.nextLine();
                customerList.get(i).setAddress(editAddressCus);

                System.out.print("Nhập số CMND: ");
                String editDenityCus = scanner.nextLine();
                customerList.get(i).setAddress(editDenityCus);

                System.out.print("Nhập số điện thoại: ");
                String editPhoneCus = scanner.nextLine();
                customerList.get(i).setAddress(editPhoneCus);

                System.out.print("Nhập Email: ");
                String editEmailCus = scanner.nextLine();
                customerList.get(i).setAddress(editEmailCus);

                System.out.print("Nhập loại khách hàng: ");
                String editGuestCus = scanner.nextLine();
                customerList.get(i).setAddress(editGuestCus);

            } else {
            System.out.println("Không có trong danh sách. Vui lòng nhập đúng mã.");
            }
        }
        for (Customer customer : customerList) {
            System.out.println(customer.toString());
        }

    }

    @Override
    public void remove() {

    }
}
