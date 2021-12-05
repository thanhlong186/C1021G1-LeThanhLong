package ss3_array_and_method.bai_tap;

import java.util.Scanner;

public class CharacterInString {
    public static void main(String[] args) {
        String s;
        Scanner sc = new Scanner(System.in);
        System.out.println("Vui long nhap noi dung: ");
        s = sc.nextLine();
        System.out.println("Vui long nhap ky tu: ");
        char c;
        c = sc.next().charAt(0);
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == c) {
                    count++;
                }
        }
        System.out.println("So lan xuat hien cua " + c + " la: " + count);
    }
}
