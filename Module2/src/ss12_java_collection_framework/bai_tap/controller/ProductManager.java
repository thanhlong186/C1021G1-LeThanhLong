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
            System.out.println("---------MENU---------");
            System.out.println("1. Add product: ");
            System.out.println("2. Edit product: ");
            System.out.println("3. Delete product: ");
            System.out.println("4. Display product: ");
            System.out.println("5. Search product: ");
            System.out.println("6. Sort products in ascending order: ");
            System.out.println("7. Sort products in descending order.: ");
            System.out.println("0. Exit: ");

            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    iProduct.addNewProduct();
                    break;
                case 2:
                    iProduct.editProduct();
                    break;
                case 3:
                    iProduct.removeProduct();
                    break;
                case 4:
                    iProduct.displayProduct();
                    break;
                case 5:
                    iProduct.searchProduct();
                    break;
                case 6:
                    iProduct.increaseProduct();
                    break;
                case 7:
                    iProduct.decreaseProduct();
                    break;
                case 0:
                    System.exit(0);
                    break;
            }
        } while (true);


    }
}