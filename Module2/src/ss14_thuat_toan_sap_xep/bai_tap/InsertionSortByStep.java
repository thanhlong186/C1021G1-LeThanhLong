package ss14_thuat_toan_sap_xep.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSortByStep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap kich thuoc danh sach: ");
        int size = scanner.nextInt();
        int[]  list = new int[size];
        System.out.println("nhap " + list.length + " gia tri: ");
        for (int j = 0; j < list.length; j++) {
            list[j] = scanner.nextInt();
        }
        System.out.print("danh sach dau vao cua ban: ");
        for (int j = 0; j < list.length; j++) {
            System.out.print(list[j] + "\t");
        }
        System.out.println("\nbat dau xu ly sap xep...");
        insertionSortByStep(list);
//        for (int j = 0; j < list.length; j++) {
//            System.out.print(list[j] + "\t");
//        }
    }

   public static void insertionSortByStep (int[] list) {
       for (int i = 0; i < list.length; i++) {
           int currentElement = list[i];
           int k = i - 1;
           for (; k >= 0 && list[k] > currentElement; k--) {
               list[k + 1] = list[k];
           }
           list[k + 1] = currentElement;
       }
       for (int j = 0; j < list.length; j++) {
           System.out.print(list[j] + "\t");
       }

    }
}
