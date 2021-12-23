package ss17_IO_Binary_File_and_serialization.bai_tap.controller;

import ss17_IO_Binary_File_and_serialization.bai_tap.service.ProductServiceImpl;
import ss17_IO_Binary_File_and_serialization.bai_tap.service.ProductServiceImpl;

import java.util.Scanner;

public class ProductController1 {
    public static void main(String[] args) {
       ProductServiceImpl productServiceimpl = new ProductServiceImpl();
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("--------Menu--------");
            System.out.println("1.Them moi san pham:");
            System.out.println("2. Hien thi san pham:");
            System.out.println("3. Tim kiem san pham:");
            System.out.println("0. Exit.");

            int choose = Integer.parseInt(sc.nextLine());
            switch (choose) {
                case 1:
                    productServiceimpl.addNew();
                    break;
                case 2:
                  productServiceimpl.display();
                    break;
                case 3:
                    productServiceimpl.search();
                    break;
                case 0:
                    System.exit(0);
                    break;
            }
        }while (true);
    }

}
