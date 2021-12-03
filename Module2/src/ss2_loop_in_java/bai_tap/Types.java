package ss2_loop_in_java.bai_tap;

import java.util.Scanner;

public class Types {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a length: ");
        int length = sc.nextInt();
        System.out.println("Enter a width: ");
        int width = sc.nextInt();

        for (int i = 1; i <= width; i++) {
            for (int j = 1; j <= length; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        for (int i = 1; i <= length; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("\n");

        for (int i = 1; i <= length; i++) {
            for (int j = 1; j <= length - i + 1; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        for (int i = 1; i <= length; i++) {
            for (int j = 1; j <= length - i; j++) {
                System.out.print(" ");
            }
            for (int m = 1; m <= 2 * i - 1; m++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        sc.close();
    }
}
