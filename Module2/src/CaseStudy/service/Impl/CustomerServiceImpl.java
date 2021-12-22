package CaseStudy.service.Impl;

import CaseStudy.model.Customer;
import CaseStudy.service.ICustomer;

import java.util.ArrayList;
import java.util.Scanner;

public class CustomerServiceImpl implements ICustomer {
    private static ArrayList<Customer> customerArrayList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
    @Override
    public void display() {
        for (Customer customer : customerArrayList) {
            System.out.println(customer.toString());
        }
    }

    @Override
    public void addNew() {
        System.out.println("Nhap id: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap ten: ");
        String name = scanner.nextLine();
        System.out.println("Nhap ngay sinh: ");
        String dayOfBirth = scanner.nextLine();
        System.out.println("Nhap gioi tinh : ");
        String sex = scanner.nextLine();
        System.out.println("Nhap tuoi: ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap dia chi: ");
        String address = scanner.nextLine();
        System.out.println("Nhap chung minh thu/CCCC: ");
        String denityCard = scanner.nextLine();
        System.out.println("Nhap phoneNumber: ");
        String phoneNumber = scanner.nextLine();
        System.out.println("Nhap Email: ");
        String email = scanner.nextLine();
        System.out.println("Nhap loai khach: ");
        String guestType = scanner.nextLine();
        Customer customer = new Customer(id, name, dayOfBirth, sex, age,
                address, denityCard, phoneNumber, email, guestType);
        customerArrayList.add(customer);
    }

    @Override
    public void edit() {

    }

    @Override
    public void remove() {

    }
}
