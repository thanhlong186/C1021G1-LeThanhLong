package ss11_dsa_stack_queue.bai_tap;

import sun.tools.jstack.JStack;

import java.util.Scanner;
import java.util.Stack;

public class ReverseElementIntergerArray {
    public static void main(String[] args) {
        Stack<Integer> arrNumber = new Stack<>();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input n: ");
        int n = scanner.nextInt();
        int[] arrs = new int[n];
        for (int i = 0; i < arrs.length; i++) {
            arrs[i] =  scanner.nextInt();
            arrNumber.push(arrs[i]);
        }
        System.out.print("So luong phan tu mang: ");
        for(int i = 0; i  < arrs.length; i++) {
            System.out.print(arrs[i]);

        }
        System.out.print("\n");
        System.out.print("Dao nguoc cac phan tu mang: ");
        for(int i = 0; i < arrs.length; i++) {
            System.out.print(arrNumber.pop());
        }


   }

}
