package ss1_introduce_to_java.Thuc_hanh;

import java.util.Scanner;

public class Operator {
    public static void main(String[] args) {
        float width;
        float height;

        Scanner scanner = new Scanner(System.in); // khai bao doi tuong scanner
        System.out.println("Enter width: ");
        width = scanner.nextFloat();// nhap chieu rong

        System.out.println("Enter height: ");
        height = scanner.nextFloat(); // nhap chieu dai

        float area = width * height;
        System.out.println("Area is: " + area);

    }
}
