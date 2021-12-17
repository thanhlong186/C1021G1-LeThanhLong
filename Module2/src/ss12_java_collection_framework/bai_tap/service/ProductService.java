package ss12_java_collection_framework.bai_tap.service;

import com.sun.tools.javac.util.List;
import ss12_java_collection_framework.bai_tap.model.Product;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ProductService implements IProduct {

    ArrayList<Product> products = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);


    @Override
    public void addNewProduct() {

        System.out.println("Enter the product name.: ");
        String name = scanner.nextLine();
        System.out.println("Enter the product price.: ");
        double prices = Double.parseDouble(scanner.nextLine());

        Product product = new Product(name, prices);
        products.add(product);
    }

    @Override
    public void editProduct() {
        System.out.println("Enter the product code you want to edit: ");
        int idEdit = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == idEdit) {

                System.out.println("Edit product Name: ");
                String editNameProduct = scanner.nextLine();
                products.get(i).setName(editNameProduct);

                System.out.println("Enter the product price: ");
                double editPrice = Double.parseDouble(scanner.nextLine());
                products.get(i).setPrice(editPrice);
            }
        }
        for (Product product : products) {
            System.out.println(product);
        }
    }

    @Override
    public void removeProduct() {
        System.out.println("Enter the code you want to delete the product: ");
        int idDelete = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == idDelete) {
                products.remove(products.get(i));
                break;
            } else {
                System.out.println("There is no id to delete: ");
                break;
            }
        }
        for (Product product : products) {
            System.out.println(product);
        }
    }

    @Override
    public void displayProduct() {
        for (Product product : products) {
            System.out.println(product);
        }
    }

    @Override
    public void searchProduct() {
        System.out.println("Input the product you are looking for.");
        String strProduct = scanner.nextLine();

        ArrayList<Product> myArrayList = new ArrayList<>();
        for (int i = 0; i < products.size(); i++) {
                if (products.get(i).getName().contains(strProduct)) {
                    myArrayList.add(products.get(i));
                }
            }
            if (myArrayList.size() == 0) {
                System.out.println("There are no products to search for.");
            } else {
                for (Product product: myArrayList) {
                    System.out.println(product);
                }
            }
        }

    @Override
    public void increaseProduct() {
        Collections.sort(products);
        for (Product product : products) {
            System.out.println(product);
        }
    }

    @Override
    public void decreaseProduct() {
        Product newProduct = new Product();
        Collections.sort(products, newProduct);

        for (Product product : products) {
            System.out.println(product);
        }
    }
}
