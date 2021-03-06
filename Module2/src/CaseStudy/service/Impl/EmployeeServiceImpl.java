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

        System.out.print("Nh???p m?? nh??n vi??n: ");
        String id = scanner.nextLine();

        System.out.println("Nh???p H??? t??n: ");
        String name = scanner.nextLine();

        System.out.println("Ch???n gi???i t??nh : ");
        System.out.println("1.Nam" + " " +"2.N???");
        String sex = "";

        try {
           choice = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e){
            System.out.println("Nh???p sai ?????nh d???ng. Vui l??ng nh???p l???i b???ng s???.");
        }

            switch (choice) {
                case 1:
                    sex = "Nam";
                    break;
                case 2:
                    sex = "N???";
                    break;
            }

        String age;
        do {
            System.out.println("Nh???p ng??y sinh: ");
            age = scanner.nextLine();
        } while (!Pattern.matches("^(((0[1-9]|[12][0-9]|30)[-\\/](0[13-9]|1[012])|31[-\\/](0[13578]|1[02])|(0[1-9]|1[0-9]|2[0-8])[-\\/]02)"  +
                "[-\\/](19[0-9]{2}|200[012])|29[-\\/]02[-\\/]" +
                "([0-9]{2}(([2468][048]|[02468][48])|[13579][26])|([13579][26]|[02468][048]|0[0-9]|1[0-6])00))$", age));

        System.out.println("Nh???p ?????a ch???: ");
        String address = scanner.nextLine();

        String denityCard;
        do {
            System.out.println("Nh??? ch???ng minh th??/CCCC: ");
            denityCard = scanner.nextLine();
        } while (!Pattern.matches("^[0-9]{9}$", denityCard));

        String phoneNumber;
        do{
        System.out.println("Nh???p s??? ??i??n tho???i: ");
        phoneNumber = scanner.nextLine();
        }while(!Pattern.matches("^0[0-9]{9}$", phoneNumber));

        String email;
        do {
            System.out.println("Nh???p Email: ");
            email = scanner.nextLine();
        } while(!Pattern.matches("^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$", email));


        System.out.println("Nh???p tr??nh ?????: ");
        System.out.println(" 1.Trung c???p"
                +" 2.Cao ?????ng " + " 3.?????i h???c " + " 4.Sau ?????i h???c ");
        String level = " ";
        try {
            choice = Integer.parseInt(scanner.nextLine());
        }catch (NumberFormatException e) {
            System.out.println("Nh???p sai ?????nh d???ng. Vui l??ng nh???p l???i.");
        }
        switch (choice) {
            case 1:
                level = "Trung c???p";
                break;
            case 2:
                level = "Cao ?????ng";
                break;
            case 3:
                level = "?????i h???c";
                break;
            case 4:
                level = "Sau ?????i h???c";
                break;
        }


        System.out.println("Nh???p v?? tr??: ");
        System.out.println("1.L??? t??n " + "\n" + "2.Ph???c v???" + "\n" + "3.Chuy??n vi??n " + "\n" + "4.Gi??m s??t " + "\n" + "5.Qu???n l?? " + "\n" + "6.Gi??m ?????c");
        String position = " ";
        try {
            choice = Integer.parseInt(scanner.nextLine());
        }catch (NumberFormatException e) {
            System.out.println("Nh???p sai ?????nh d???ng. Vui l??ng nh???p l???i.");
        }
        switch (choice) {
            case 1:
                level = "L??? t??n";
                break;
            case 2:
                level = "Ph???c v???";
                break;
            case 3:
                level = "Chuy??n vi??n";
                break;
            case 4:
                level = "Gi??m s??t";
                break;
            case 5:
                level = "Qu???n l??";
                break;
            case 6:
                level = "Gi??m ?????c";
                break;
        }

        System.out.println("Nh???p l????ng: ");
        int salary = Integer.parseInt(scanner.nextLine());

        Employee employee = new Employee(id, name, sex, age, address,
                denityCard, phoneNumber, email, level, position, salary);
        employeeList.add(employee);
        write();
        System.out.println("???? th??m m???i th??nh c??ng");
    }

    @Override
    public void edit() {

        System.out.println("Nh???p m?? nh??n vi??n b???n mu???n s???a: ");
        String idEdit = scanner.nextLine();
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getId().equals(idEdit)) {

                System.out.print("Nh???p m???i t??n nh??n vi??n");
                String editNameEmployee = scanner.nextLine();
                employeeList.get(i).setName(editNameEmployee);

                System.out.print("Nh???p gi???i t??nh: ");
                String editSexEm = scanner.nextLine();
                employeeList.get(i).setSex(editSexEm);

                System.out.print("Nh???p ng??y sinh: ");
                String editAgeEm = scanner.nextLine();
                employeeList.get(i).setAge(editAgeEm);

                System.out.print("Nh???p ?????a ch???");
                String editAddressEm = scanner.nextLine();
                employeeList.get(i).setAddress(editAddressEm);

                System.out.print("Nh???p s??? CMND");
                String editDenityEm = scanner.nextLine();
                employeeList.get(i).setAddress(editDenityEm);

                System.out.print("Nh???p s??? ??i???n tho???i");
                String editPhoneEm = scanner.nextLine();
                employeeList.get(i).setAddress(editPhoneEm);

                System.out.print("Nh???p Email");
                String editEmailEm = scanner.nextLine();
                employeeList.get(i).setAddress(editEmailEm);

                System.out.print("Nh???p tr??nh ?????");
                String editLevelEm= scanner.nextLine();
                employeeList.get(i).setAddress(editLevelEm);

                System.out.print("Nh???p v??? tr??");
                String editPossiEm = scanner.nextLine();
                employeeList.get(i).setAddress(editPossiEm);

                System.out.print("Nh???p l????ng");
                String editSalaEm = scanner.nextLine();
                employeeList.get(i).setAddress(editSalaEm);

            } else {
                System.out.println("Kh??ng c?? trong danh s??ch. Vui l??ng nh???p ????ng m??.");
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
