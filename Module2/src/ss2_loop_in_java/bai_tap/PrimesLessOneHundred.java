package ss2_loop_in_java.bai_tap;

import java.util.Scanner;

public class PrimesLessOneHundred {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter n: ");
        n = sc.nextInt();

        System.out.println("Cac so nguyen to nho hon " + n + " la: ");
         for (int i = 1; i < n; i++){
             int count = 0;
             for (int j = 1; j <= i; j++) {
                 if (i % j == 0) {
                     count++;
                 }
             }
             if (count == 2) {
                 System.out.print(" " + i);
             }
         }

    }
}
