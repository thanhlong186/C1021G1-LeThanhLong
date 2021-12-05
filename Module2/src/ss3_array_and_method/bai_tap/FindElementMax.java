package ss3_array_and_method.bai_tap;

import java.util.Scanner;

public class FindElementMax {
    public static void main(String[] args) {
        int arr[][] = {{4,2,6,7},{6,10,5,7}};
        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }
        System.out.println("The number max[i][j] is: " + max);
            }

        }