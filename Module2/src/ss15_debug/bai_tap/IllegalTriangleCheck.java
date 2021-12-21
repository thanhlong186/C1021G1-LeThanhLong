package ss15_debug.bai_tap;

import java.util.Scanner;

public class IllegalTriangleCheck {
    public void checkTriangleEdges(int a, int b, int c) throws IllegalTriangleException {
        if (a + b <= c || a + c <= b || b + c <= a) {
            throw new IllegalTriangleException("Lỗi: Tam giác không hợp lệ.");
        } else {
            System.out.println("Tam giác hợp lệ.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        IllegalTriangleCheck check = new IllegalTriangleCheck();
        try {
            System.out.println("Nhập cạnh a: ");
            int a = scanner.nextInt();
            System.out.println("Nhập cạnh b:");
            int b = scanner.nextInt();
            System.out.println("Nhập cạnh c: ");
            int c = scanner.nextInt();

            try {
                check.checkTriangleEdges(a, b, c);
            } catch (IllegalTriangleException e) {
                System.out.println(e.getMessage());
                System.out.println("Vui lòng nhập số dương.");
            }
        }catch (Exception e1) {
            System.out.println("Không đúng hình dáng");
        }
        scanner.close();
    }
}

