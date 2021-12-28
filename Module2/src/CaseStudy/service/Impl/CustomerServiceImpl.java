package CaseStudy.service.Impl;

import CaseStudy.model.Customer;
import CaseStudy.service.ICustomerService;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class CustomerServiceImpl implements ICustomerService {
    private static List<Customer> customerList = new LinkedList<>();
    private static Scanner scanner = new Scanner(System.in);

    public void write()  {
        try {
        FileWriter fileWriter1 = new FileWriter("/Users/thanhlong/Documents/codegym/Module2/src/CaseStudy/data/Customer.csv");
            BufferedWriter bw1 = new BufferedWriter(fileWriter1);
            for (Customer customer : customerList) {
                bw1.write(customer.getId() + "," + customer.getName() + "," + customer.getSex() + "," + customer.getAge() + "," + customer.getAddress() + "," +
                        customer.getDentityCard() + "," + customer.getPhonNumber() + "," + customer.getEmail() + "," + customer.getGuestType());
            }
            bw1.close();
    } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void display() {
        for (Customer customer : customerList) {
            System.out.println(customer.toString());
        }
    }

    @Override
    public void addNew() {
        System.out.println("Nhap id: ");
        String id = scanner.nextLine();

        System.out.println("Nhap ho va ten: ");
        String name = scanner.nextLine();


        System.out.println("Nhap gioi tinh : ");
        System.out.println("1.Nam" + "\n" + "2.Nữ");
        String sex = " ";
        int choose;
        choose = Integer.parseInt(scanner.nextLine());
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
            System.out.println("Nhap ngay sinh: ");
            age = scanner.nextLine();
        } while (!Pattern.matches("^(((0[1-9]|[12][0-9]|30)[-\\/](0[13-9]|1[012])|31[-\\/](0[13578]|1[02])|(0[1-9]|1[0-9]|2[0-8])[-\\/]02)" +
                "[-\\/](19[0-9]{2}|200[012])|29[-\\/]02[-\\/]" +
                "([0-9]{2}(([2468][048]|[02468][48])|[13579][26])|([13579][26]|[02468][048]|0[0-9]|1[0-6])00))$" , age));
        System.out.println("Nhap dia chi: ");
        String address = scanner.nextLine();

        String denityCard;
        do {
            System.out.println("Nhap chung minh thu/CCCC: ");
            denityCard = scanner.nextLine();
        } while (!Pattern.matches("^[0-9]{9}$", denityCard));

        String phoneNumber;
        do {
            System.out.println("Nhap phoneNumber: ");
            phoneNumber = scanner.nextLine();
        } while(!Pattern.matches("^0[0-9]{9}$", phoneNumber));

        String email;
        do {
            System.out.println("Nhap Email: ");
            email = scanner.nextLine();
        }while (!Pattern.matches("^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$", email));


        System.out.println("Nhap loai khach: ");
        System.out.println("1.Diamond " + "\n" + "2.Platinium" + "\n" + "3.Gold" + "\n" +
                "4.Silver " + "\n" + "5.Member");
        String guestType = " ";
        choose = Integer.parseInt(scanner.nextLine());
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

    }

    @Override
    public void remove() {

    }
}
