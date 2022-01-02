package extra_exercises.De_thi_09.service;

import extra_exercises.De_thi_09.model.Telephone;
import extra_exercises.De_thi_09.model.TelephonePortable;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class TelephoneServiceImpl implements ITelephone {
    static ArrayList<Telephone> telephoneArrayList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);



    @Override
    public void addNewTelephoneReal() {
            int choice = 0;

            String name = "";
            System.out.print("Nhập tên sản phẩm: ");
            String nameTele = scanner.nextLine();

            System.out.print("Nhập giá sane xuất: ");
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.print("Nhập sai định dạng, vui lòng nhập lại.");
            }
            double priceTele = Double.parseDouble(scanner.nextLine());
            while (priceTele <0) {
                System.out.print("Vui lòng nhập bằng số dương.");
                priceTele = Double.parseDouble(scanner.nextLine());
            }

            System.out.print("Nhập số lượng điện thoại: ");
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Nhập sai định dạng, vui lòng nhập lại.");
            }
            int amountTele = Integer.parseInt(scanner.nextLine());
            while (amountTele < 0) {
                System.out.println("Vui lòng nhập bằng số dương.");
                priceTele = Integer.parseInt(scanner.nextLine());
            }

            System.out.print("Nhập nàh sản xuất: ");
            String manuTele = scanner.nextLine();

        System.out.print("Nhập thời gian bảo hành: ");
        try{
            choice = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Nhập sai định dạng. Vui lòng nhập lại bằng số.");
        }
        double warrantyPe = Double.parseDouble(scanner.nextLine());
        while (warrantyPe < 2) {
            System.out.print("Thời gian bảo hành không quá 2 năm: \t");
            warrantyPe = Double.parseDouble(scanner.nextLine());
        }


        System.out.println("Nhập vi bảo hành: ");
        System.out.print("1.Toan quoc" + "\n" + "2.Quoc te: ");
        String warrantyCo = "";
        try {
            choice = Integer.parseInt(scanner.nextLine());
        }catch (NumberFormatException e){
            System.out.println("Nhập sai định dạng. Vui lòng nhập lại bằng số.");
        }
        switch (choice) {
            case 1:
                warrantyCo = "Toan quoc";
                break;
            case 2:
                warrantyCo = "Quoc te";
                break;
        }
    }



    @Override
    public void addNewTelephonePortable() {
        int choice = 0;
        boolean check = true;

        String name = "";
        System.out.print("Nhập tên sản phẩm");
        String nameTele = scanner.nextLine();

        System.out.print("Nhập giá sản phẩm: ");
        try {
            choice = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.print("Nhập sai định dạng. Vui lòng nhập lại bằng số.");
        }
        double priceTele = Double.parseDouble(scanner.nextLine());
        while (priceTele < 0) {
            System.out.println("Vui lòng nhập bằng số dương");
            priceTele = Double.parseDouble(scanner.nextLine());
        }

        System.out.println("Nhập số lượng điện thoại");
        try {
            choice = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Nhập sai định dạng. Vui lòng nhập lại bằng số");
        }
        int amountTele = Integer.parseInt(scanner.nextLine());
        while (amountTele < 0) {
            System.out.println("Vui lòng nhập bằng số dương");
            priceTele = Integer.parseInt(scanner.nextLine());
        }

        System.out.println("Nhập nhà sản xuất: ");
        String manuTele = scanner.nextLine();


        System.out.println("Nhập quốc gia sản xuất: ");
        String country = scanner.nextLine();
        check = true;
        do {
            country = scanner.nextLine();
            if(!country.equals("Việt Nam"));
            country = scanner.nextLine();
            System.out.println("Không đúng! Vui lòng nhập lại");
        } while (check);


        System.out.println("Nhập trạng thái: ");
        System.out.println("1. Sữa chữa" + "\n" + "2.Chưa sửa chữa");
        String status = "";
        try {
            choice = Integer.parseInt(scanner.nextLine());
        }catch (NumberFormatException e){
            System.out.println("Nhập sai định dạng. Vui lòng nhập lại bằng số.");
        }
        switch (choice) {
            case 1:
                status = "Sửa chữa";
                break;
            case 2:
                status = "Chưa sửa chữa";
                break;
        }

    }

    @Override
    public void remove() {

    }

    @Override
    public void displayListTelephone() {

    }

    @Override
    public void search() {

    }

    @Override
    public void exit() {

    }
}
