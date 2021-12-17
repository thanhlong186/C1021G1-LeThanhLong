package ss13_thuat_toan_tim_kiem.bai_tap;

import javafx.scene.transform.Scale;

import java.util.Scanner;

public class AscendingSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string you want to check: ");
        String string = sc.nextLine();

        int code = (int) string.charAt(0);
        for (int i = 0; i < string.length(); i++) {
            int newCode = (int) string.charAt(i);
            if (code <= newCode) {
                code = newCode;
                System.out.println(string.charAt(i));
            }
        }
    }
}
