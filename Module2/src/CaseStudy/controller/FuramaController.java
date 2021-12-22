package CaseStudy.controller;

import CaseStudy.model.Customer;
import CaseStudy.service.Impl.CustomerServiceImpl;
import CaseStudy.service.Impl.EmployeeServiceImpl;
import com.sun.codemodel.internal.JSwitch;

import java.util.Scanner;

public class FuramaController {
    public static void main(String[] args) {
        displayMenu();
    }

    public static void displayMenu() {
        boolean check = true;
        while (check) {
            System.out.println("---------Menu--------");
            System.out.println("1.\tEmployee Management: ");
            System.out.println("2.\tCustomer Management: ");
            System.out.println("3.\tFacility Management: ");
            System.out.println("4.\tBooking Management: ");
            System.out.println("5.\tPromotion Management: ");
            System.out.println("6. Exit: ");

            Scanner scanner = new Scanner(System.in);
            switch (scanner.nextInt()) {
                case 1:
                    displayEmployeeMenu();
                    break;
                case 2:
                    displayCustomerMenu();
                    break;
                case 3:
                    displayFacilityMenu();
                    break;
                case 4:
                    displayBookingMenu();
                    break;
                case 5:
                    displayPromotionMenu();
                    break;
                case 6:
                    System.exit(6);
                    break;
            }
        }
    }

    public static void displayEmployeeMenu() {
        EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
        boolean check = true;
        while (check) {
            System.out.println("---------Menu--------");
            System.out.println("1.\tDisplay list employees: ");
            System.out.println("2.\tAdd new employees: ");
            System.out.println("3.\tEdit employee: ");
            System.out.println("4.\tReturn main menu: ");

            Scanner scanner = new Scanner(System.in);
            switch (scanner.nextInt()) {
                case 1:
                    employeeService.display();
                    break;
                case 2:
                    employeeService.addNew();
                    break;
            }
        }
    }

    public static void displayCustomerMenu() {
        CustomerServiceImpl customerService =  new CustomerServiceImpl();
        boolean check = true;
        while (check) {
            System.out.println("---------Menu--------");
            System.out.println("1.\tDisplay list customers: ");
            System.out.println("2.\tAdd new customers: ");
            System.out.println("3.\tEdit customer: ");
            System.out.println("4.\tReturn main menu: ");

            Scanner scanner = new Scanner(System.in);
            switch (scanner.nextInt()) {
                case 1:
                    customerService.display();
                    break;
                case 2:
                    customerService.addNew();
                    break;

            }
        }
    }

    public static void displayFacilityMenu() {
        boolean check = true;
        while (check) {
            System.out.println("---------Menu--------");
            System.out.println("1.\tDisplay list facility: ");
            System.out.println("2.\tAdd new facility: ");
            System.out.println("3.\tDisplay list facility maintenance: ");
            System.out.println("4.\tReturn main menu: ");

            Scanner scanner = new Scanner(System.in);
            switch (scanner.nextInt()) {
                case 1:
            }
        }
    }

    public static void displayBookingMenu() {
        boolean check = true;
        while (check) {
            System.out.println("---------Menu--------");
            System.out.println("1.\tAdd new booking: ");
            System.out.println("2.\tDisplay list booking: ");
            System.out.println("3.\tCreate new constracts: ");
            System.out.println("4.\tDisplay list contracts: ");
            System.out.println("5.\tEdit contracts");
            System.out.println("6.\tReturn main menu");

            Scanner scanner = new Scanner(System.in);
            switch (scanner.nextInt()) {
                case 1:
            }
        }
    }

    public static void displayPromotionMenu() {
        boolean check = true;
        while (check) {
            System.out.println("---------Menu--------");
            System.out.println("1.\tDisplay list customers use service: ");
            System.out.println("2.\tDisplay list customers get voucher: ");
            System.out.println("3.\tReturn main menu: ");

            Scanner scanner = new Scanner(System.in);
            switch (scanner.nextInt()) {
                case 1:
            }
        }
    }
}
