package ss3_array_and_method.bai_tap;

import java.util.Scanner;

public class SumNumberInDiagonalLine {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap do dai ma nhan");
        n = scanner.nextInt();
        int array[][] = new int[n][n];
        System.out.println("nhap cac phan tu trong ma tran");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("array [" + i + "] [" + j + "] = ");
                array[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Ma tran vua nhap la:");
        for (int i = 0; i < n ; i++){
            for (int j = 0; j < n; j++){
                System.out.print(array[i][j] + "\t");
            }
            System.out.println("\n");
        }
        int sum = 0;
        for (int i = 0; i < n; i++){
            sum = sum + array[i][i];
        }
        System.out.println("tong cac duong cheo chinh cua ma tran hinh vuong la:"+sum);
    }
}
