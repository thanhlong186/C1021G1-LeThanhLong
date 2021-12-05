package ss3_array_and_method.bai_tap;

import java.util.Scanner;

public class FindElementMin {
    public static void main(String[] args) {
        int arr[] = new int[10];
        Scanner sc = new Scanner(System.in);
        int min = 0;
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
               if (i == 0) {
                   min = arr[i];
               } else if (arr[i] < min) {
                   min = arr[i];
               }

            }
        System.out.println("Value min in array is: " + min);
        }

    }

