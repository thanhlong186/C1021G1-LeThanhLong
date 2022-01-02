package CaseStudy.service.Impl;

import CaseStudy.model.Customer;
import CaseStudy.model.Employee;
import CaseStudy.service.IEmployeeService;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class EmployeeServiceImpl implements IEmployeeService {
    private static ArrayList<Employee> employeeList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
    public EmployeeServiceImpl() {
        employeeList = readerEmployee();
    }

    public void write() {
        try{
        FileWriter fileWriter = new FileWriter("/Users/thanhlong/Documents/codegym/Module2/src/CaseStudy/data/Employee.csv");
            BufferedWriter bw = new BufferedWriter(fileWriter);
            for (Employee employee : employeeList) {
                bw.write(employee.getId() + "," + employee.getName() + "," + employee.getSex() + "," + employee.getAge() + "," + employee.getAddress() + "," + employee.getDentityCard() + "," +
                        employee.getPhonNumber() + "," + employee.getEmail() + "," + employee.getLevel() + "," + employee.getPosition() + "," + employee.getSalary() + "\n");
            }
            bw.close();
    } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<Employee> readerEmployee() {
        ArrayList<Employee> employees = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader("/Users/thanhlong/Documents/codegym/Module2/src/CaseStudy/data/Employee.csv");
            BufferedReader br = new BufferedReader(fileReader);
            String line;
            String[] temp;
            Employee employee = null;
            while ((line = br.readLine()) != null) {
                temp = line.split(",");
                employee = new Employee(temp[0], temp[1], temp[2], temp[3], temp[4], temp[5], temp[6], temp[7], temp[8], temp[9], Integer.parseInt(temp[10]));
            }
            if (employee != null) {
                employees.add(employee);
            }
            br.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return employees;
    }

    @Override
    public void display() {
            for(Employee employee : employeeList) {
                System.out.println(employee.toString());
            }
    }

    @Override
    public void addNew() {
        int choice = 0;

        System.out.print("Nhập mã nhân viên: ");
        String id = scanner.nextLine();

        System.out.println("Nhập Họ tên: ");
        String name = scanner.nextLine();

        System.out.println("Chọn giới tính : ");
        System.out.println("1.Nam" + " " +"2.Nữ");
        String sex = "";

        try {
           choice = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e){
            System.out.println("Nhập sai định dạng. Vui lòng nhập lại bằng số.");
        }

            switch (choice) {
                case 1:
                    sex = "Nam";
                    break;
                case 2:
                    sex = "Nữ";
                    break;
            }

        String age;
        do {
            System.out.println("Nhập ngày sinh: ");
            age = scanner.nextLine();
        } while (!Pattern.matches("^(((0[1-9]|[12][0-9]|30)[-\\/](0[13-9]|1[012])|31[-\\/](0[13578]|1[02])|(0[1-9]|1[0-9]|2[0-8])[-\\/]02)"  +
                "[-\\/](19[0-9]{2}|200[012])|29[-\\/]02[-\\/]" +
                "([0-9]{2}(([2468][048]|[02468][48])|[13579][26])|([13579][26]|[02468][048]|0[0-9]|1[0-6])00))$", age));

        System.out.println("Nhập địa chỉ: ");
        String address = scanner.nextLine();

        String denityCard;
        do {
            System.out.println("Nhậ chứng minh thư/CCCC: ");
            denityCard = scanner.nextLine();
        } while (!Pattern.matches("^[0-9]{9}$", denityCard));

        String phoneNumber;
        do{
        System.out.println("Nhập số điên thoại: ");
        phoneNumber = scanner.nextLine();
        }while(!Pattern.matches("^0[0-9]{9}$", phoneNumber));

        String email;
        do {
            System.out.println("Nhập Email: ");
            email = scanner.nextLine();
        } while(!Pattern.matches("^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$", email));


        System.out.println("Nhập trình độ: ");
        System.out.println(" 1.Trung cấp"
                +" 2.Cao đẳng " + " 3.Đại học " + " 4.Sau đại học ");
        String level = " ";
        try {
            choice = Integer.parseInt(scanner.nextLine());
        }catch (NumberFormatException e) {
            System.out.println("Nhập sai định dạng. Vui lòng nhập lại.");
        }
        switch (choice) {
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


        System.out.println("Nhập ví trí: ");
        System.out.println("1.Lễ tân " + "\n" + "2.Phục vụ" + "\n" + "3.Chuyên viên " + "\n" + "4.Giám sát " + "\n" + "5.Quản lý " + "\n" + "6.Giám đốc");
        String position = " ";
        try {
            choice = Integer.parseInt(scanner.nextLine());
        }catch (NumberFormatException e) {
            System.out.println("Nhập sai định dạng. Vui lòng nhập lại.");
        }
        switch (choice) {
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

        System.out.println("Nhập lương: ");
        int salary = Integer.parseInt(scanner.nextLine());

        Employee employee = new Employee(id, name, sex, age, address,
                denityCard, phoneNumber, email, level, position, salary);
        employeeList.add(employee);
        write();
        System.out.println("Đã thêm mới thành công");
    }

    @Override
    public void edit() {

        System.out.println("Nhập mã nhân viên bạn muốn sửa: ");
        String idEdit = scanner.nextLine();
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getId().equals(idEdit)) {

                System.out.print("Nhập mới tên nhân viên");
                String editNameEmployee = scanner.nextLine();
                employeeList.get(i).setName(editNameEmployee);

                System.out.print("Nhập giới tính: ");
                String editSexEm = scanner.nextLine();
                employeeList.get(i).setSex(editSexEm);

                System.out.print("Nhập ngày sinh: ");
                String editAgeEm = scanner.nextLine();
                employeeList.get(i).setAge(editAgeEm);

                System.out.print("Nhập địa chỉ");
                String editAddressEm = scanner.nextLine();
                employeeList.get(i).setAddress(editAddressEm);

                System.out.print("Nhập số CMND");
                String editDenityEm = scanner.nextLine();
                employeeList.get(i).setAddress(editDenityEm);

                System.out.print("Nhập số điện thoại");
                String editPhoneEm = scanner.nextLine();
                employeeList.get(i).setAddress(editPhoneEm);

                System.out.print("Nhập Email");
                String editEmailEm = scanner.nextLine();
                employeeList.get(i).setAddress(editEmailEm);

                System.out.print("Nhập trình độ");
                String editLevelEm= scanner.nextLine();
                employeeList.get(i).setAddress(editLevelEm);

                System.out.print("Nhập vị trí");
                String editPossiEm = scanner.nextLine();
                employeeList.get(i).setAddress(editPossiEm);

                System.out.print("Nhập lương");
                String editSalaEm = scanner.nextLine();
                employeeList.get(i).setAddress(editSalaEm);

            } else {
                System.out.println("Không có trong danh sách. Vui lòng nhập đúng mã.");
            }
        }
        for (Employee employee : employeeList) {
            System.out.println(employee.toString());
        }
    }

    @Override
    public void remove() {

    }
}
