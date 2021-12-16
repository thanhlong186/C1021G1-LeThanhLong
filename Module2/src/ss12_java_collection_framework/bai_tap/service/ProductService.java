package ss12_java_collection_framework.bai_tap.service;

import com.sun.tools.javac.util.List;
import ss12_java_collection_framework.bai_tap.model.Product;
import java.util.ArrayList;
import java.util.Scanner;

public class ProductService implements IProduct {

        ArrayList<Product> products = new ArrayList<>();
        private static Scanner scanner = new Scanner(System.in);


    @Override
    public void addNewProduct() {
        System.out.println("Input id");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Input Name: ");
        String name = scanner.nextLine();
        System.out.println("Input Price: ");
        double prices = Double.parseDouble(scanner.nextLine());

        Product product = new Product(id, name, prices);
        products.add(product);



    }
}
