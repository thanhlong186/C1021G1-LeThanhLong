package ss2_loop_in_java.bai_tap;

import java.util.Scanner;

public class TwentyPrimeFirst {
    public static void main(String[] args) {
        System.out.println("Enter a Number: ");
        int n;
        n = new Scanner(System.in).nextInt();
        int count = 0;
        int a = 2;

        while (true) {
            if (isPrime(a)) {
                System.out.print(a+" ");
                count++;
            }
            if (count == n) {
                break;
            }
            if (a == 2) {
                a++;
            } else{
                    a += 2;
                }
            }
        }

    public static boolean isPrime(int n) {
     for (int i = 2; i <= Math.sqrt(n); i++) {
         if (n % i == 0) {
             return false;
         }
     }
     return true;
     }
    }