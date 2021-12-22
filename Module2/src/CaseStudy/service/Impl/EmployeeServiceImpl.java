package CaseStudy.service.Impl;

import CaseStudy.model.Employee;
import CaseStudy.service.IEmployee;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeServiceImpl implements IEmployee {
    private static ArrayList<Employee> employeeList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    @Override
    public void display() {
            for(Employee employee : employeeList) {
                System.out.println(employee.toString());
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
        System.out.println("Nhap trinh do: ");
        String level = scanner.nextLine();
        System.out.println("Nhap vi tri: ");
        String position = scanner.nextLine();
        System.out.println("Nhap luong: ");
        int salary = Integer.parseInt(scanner.nextLine());
        Employee employee = new Employee(id, name, dayOfBirth, sex, age, address,
                denityCard, phoneNumber, email, level, position, salary);
        employeeList.add(employee);
    }

    @Override
    public void edit() {

    }

    @Override
    public void remove() {

    }
}
