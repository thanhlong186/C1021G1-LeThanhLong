package extra_exercises.De_thi_09.Controller;

import extra_exercises.De_thi_09.service.TelephoneServiceImpl;

import java.util.Scanner;

public class TelephoneController {
    public static void main(String[] args) {

    }

    public static void displayMenu() {
        TelephoneServiceImpl telephoneService = new TelephoneServiceImpl();
        boolean check = true;
        int choice = 0;
        while (check) {
            System.out.println("----------CHƯƠNG TRÌNH QUẢN LÝ ĐIỆN THOAỊ----------");
            System.out.println("---------Menu--------");
            System.out.println("1.\tThêm mới sản phẩm: ");
            System.out.println("2.\tXoá: ");
            System.out.println("3.\tXem danh sách sản phẩm: ");
            System.out.println("4.\tTìm kiếm sản phẩm: ");
            System.out.println("5.\tThoát: ");
            System.out.println("Chọn chức năng: ");

            Scanner sc = new Scanner(System.in);
            try {
                choice = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Nhập sai định dạng. Vui lòng nhập lại.");
            }
            switch (choice) {
                case 1:
                    break;
                case 2:
                case 3:
                case 4:
                case 5:
                    System.exit(5);
                    break;
            }
        }
    }

    public static void addNew() {
        boolean check = true;
        int choice = 0;
        while (check) {
            System.out.println("1.\tĐiện thoại chính hãng: ");
            System.out.println("2.\tĐiện Thoại xách tay: ");
            System.out.println("3.\tQuay lại màn hình chính: ");
            Scanner sc = new Scanner(System.in);
            try {
                choice = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Nhập sai định dạng. Vui lòng nhập lại.");
            }
            switch (choice) {
                case 1:
                case 2:
                case 3:

                    break;
            }
        }
    }
}
