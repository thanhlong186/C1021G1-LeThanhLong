package extra_exercises.Excercise_oop1.service;

import extra_exercises.Excercise_oop1.model.Account;

import java.util.ArrayList;
import java.util.Scanner;

public class AccountService implements IAccount {

     ArrayList<Account> accountArrayList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    @Override
    public void depositMoney() {
//        Lấy số tiền hiện tại trong tài khoản + số tiền nạp vào
        System.out.println("Nhap so tien cua ban: ");
        double moneyAccount = Double.parseDouble(scanner.nextLine());








    }
    public void sumMoney(double money){
        System.out.println("Nhaapj vaof vij tr");
        accountArrayList.get(3).setAccountMoney(accountArrayList.get(3).getAccountMoney()+money);
    }
}
