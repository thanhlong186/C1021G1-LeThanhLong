package CaseStudy.service.Impl;

import CaseStudy.model.Employee;
import CaseStudy.service.IEmployeeService;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class EmployeeServiceImpl implements IEmployeeService {
    private static ArrayList<Employee> employeeList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public void write() {
        try{
        FileWriter fileWriter = new FileWriter("/Users/thanhlong/Documents/codegym/Module2/src/CaseStudy/data/Employee.csv");
            BufferedWriter bw = new BufferedWriter(fileWriter);
            for (Employee employee : employeeList) {
                bw.write(employee.getId() + "," + employee.getName() + "," + employee.getSex() + "," + employee.getAge() + "," + employee.getAddress() + "," + employee.getDentityCard() + "," +
                        employee.getPhonNumber() + "," + employee.getEmail() + "," + employee.getLevel() + "," + employee.getPosition() + "," + employee.getSalary());
            }
            bw.close();
    } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void display() {
            for(Employee employee : employeeList) {
                System.out.println(employee.toString());
            }
    }

    @Override
    public void addNew() {
        System.out.println("Nhap id: ");
        String id = scanner.nextLine();
        System.out.println("Nhap ten: ");
        String name = scanner.nextLine();

        System.out.println("Nhap gioi tinh : ");
        System.out.println("1.Nam" + "\n"
                +"2.Nữ");
        String sex = "";

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
        } while (!Pattern.matches("^(((0[1-9]|[12][0-9]|30)[-\\/](0[13-9]|1[012])|31[-\\/](0[13578]|1[02])|(0[1-9]|1[0-9]|2[0-8])[-\\/]02)"  +
                "[-\\/](19[0-9]{2}|200[012])|29[-\\/]02[-\\/]" +
                "([0-9]{2}(([2468][048]|[02468][48])|[13579][26])|([13579][26]|[02468][048]|0[0-9]|1[0-6])00))$", age));

        System.out.println("Nhap dia chi: ");
        String address = scanner.nextLine();

        String denityCard;
        do {
            System.out.println("Nhap chung minh thu/CCCC: ");
            denityCard = scanner.nextLine();
        } while (!Pattern.matches("^[0-9]{9}$", denityCard));

        String phoneNumber;
        do{
        System.out.println("Nhap phoneNumber: ");
        phoneNumber = scanner.nextLine();
        }while(!Pattern.matches("^0[0-9]{9}$", phoneNumber));

        String email;
        do {
            System.out.println("Nhap Email: ");
            email = scanner.nextLine();
        } while(!Pattern.matches("^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$", email));


        System.out.println("Nhap trinh do: ");
        System.out.println(" 1.Trung cấp"
                +" 2.Cao đẳng " + " 3.Đại học " + " 4.Sau đại học ");
        String level = " ";
        choose = Integer.parseInt(scanner.nextLine());
        switch (choose) {
            case 1:
                level = "Trung cấp";
                break;
            case 2:
                level = "Cao đẳng";
                break;
            case 3:
                level = "Đại học";
                break;
            case 4:
                level = "Sau đại học";
                break;
        }


        System.out.println("Nhap vi tri: ");
        System.out.println("1.Lễ tân " + "\n" + "2.Phục vụ" + "\n" + "3.Chuyên viên " + "\n" + "4.Giám sát " + "\n" + "5.Quản lý " + "\n" + "6.Giám đốc");
        String position = " ";
        choose = Integer.parseInt(scanner.nextLine());
        switch (choose) {
            case 1:
                level = "Lễ tân";
                break;
            case 2:
                level = "Phục vụ";
                break;
            case 3:
                level = "Chuyên viên";
                break;
            case 4:
                level = "Giám sát";
                break;
            case 5:
                level = "Quản lý";
                break;
            case 6:
                level = "Giám đốc";
                break;
        }

        System.out.println("Nhap luong: ");
        int salary = Integer.parseInt(scanner.nextLine());
        Employee employee = new Employee(id, name, sex, age, address,
                denityCard, phoneNumber, email, level, position, salary);
        employeeList.add(employee);
        write();
        System.out.println("Da them moi thanh cong");
    }

    @Override
    public void edit() {

    }

    @Override
    public void remove() {

    }
}
