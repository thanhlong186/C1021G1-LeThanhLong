package ss12_java_collection_framework.bai_tap.controller;


import ss12_java_collection_framework.bai_tap.model.Product;
import ss12_java_collection_framework.bai_tap.service.IProduct;
import ss12_java_collection_framework.bai_tap.service.ProductService;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductManager {
    public static void main(String[] args) {
        IProduct iProduct = new ProductService();
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("--------MENU---------");
            System.out.println("1. Thêm sản phẩm: ");
            System.out.println("2. Sủa sản phảm: ");
            System.out.println("3. Xoá sản phẩm: ");
            System.out.println("4. Hiển thị sản phẩm: ");
            System.out.println("5. Tìm kiếm sản phẩm: ");
            System.out.println("6. Sắp xếp sản phẩm tăng dần: ");
            System.out.println("7. Sắp xếp sản phẩm giảm dần: ");
            System.out.println("0. Exit: ");

            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    iProduct.addNewProduct();
                case 2:

                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 0:
                    System.exit(0);
                    break;
            }
        } while (true);


    }
}