package extra_exercises.Excercise_oop1.controller;

import extra_exercises.Excercise_oop1.service.AccountService;
import extra_exercises.Excercise_oop1.service.IAccount;

import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class AccountController {
    public static void main(String[] args) {
        IAccount iAccount = new AccountService();
        Scanner scanner = new Scanner(System.in);
//        displayMenu();
//    }
//
//        public static void displayMenu() {

            do {
                System.out.println("----------Menu----------");
                System.out.println("1. Nap tien vao tai khoan: ");
                System.out.println("2. Rut tien: ");
                System.out.println("3. Chuyen tien: ");
                System.out.println("0. Exit: ");

//                Scanner scanner = new Scanner(System.in);
                int choose = Integer.parseInt(scanner.nextLine());

                switch (choose) {
                    case 1:
                        iAccount.depositMoney();
                        break;




            }
        }while (true);
    }
}

