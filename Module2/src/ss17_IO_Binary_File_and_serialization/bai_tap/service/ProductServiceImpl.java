package ss17_IO_Binary_File_and_serialization.bai_tap.service;



import ss17_IO_Binary_File_and_serialization.bai_tap.model.ProductManagament;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductServiceImpl implements IProductService {
    static final String Output = "/Users/thanhlong/Documents/codegym/Module2/src/ss17_IO_Binary_File_and_serialization/bai_tap/model/output";
    List<ProductManagament> productList = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    @Override
    public void addNew() {
        System.out.println("nhap code: ");
        String codeProduct = sc.nextLine();
        System.out.println("Nhap name: ");
        String nameProduct = sc.nextLine();
        System.out.println("Nhap hang san xuat: ");
        String manufacProduct = sc.nextLine();
        System.out.println("Nhap price: ");
        double priceProduct = Double.parseDouble(sc.nextLine());
        ProductManagament productManagament = new ProductManagament(codeProduct, nameProduct, manufacProduct, priceProduct);
        productList.add(productManagament);
        try {
            FileOutputStream fos = new FileOutputStream(Output);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(productList);
            oos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @Override
    public void display() {
        for (ProductManagament productManagament : productList) {
            System.out.println(productManagament);
        }
    }

    @Override
    public void search() {
        System.out.println("Nhap san pham can tim kiem: ");
        String name = sc.nextLine();

        ArrayList<ProductManagament> myProductList = new ArrayList<>();
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getProductName().contains(name)) {
                myProductList.add(productList.get(i));
            }
        }
        if (myProductList.size() == 0) {
            System.out.println("Khong tim thay san pham.");
        } else {
            for (ProductManagament productManagament : productList) {
                System.out.println(productManagament);
            }
        }
    }
}

