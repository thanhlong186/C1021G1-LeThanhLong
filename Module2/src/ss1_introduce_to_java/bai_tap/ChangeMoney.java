package ss1_introduce_to_java.bai_tap;

import java.util.Scanner;

public class ChangeMoney {
    public static void main(String[] args) {
        double vnd = 23000;
        double usd;
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi ban nhap gia tri usd: ");
        usd = sc.nextDouble();
        double quydoi = usd * 23000;
        System.out.println("Gia tri cua vnd: " + quydoi);
    }
}
