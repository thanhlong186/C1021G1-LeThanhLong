package ss14_thuat_toan_sap_xep.bai_tap;

import java.util.Arrays;

public class InsertionSort {
    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int currentElement = array[i];
            int k = i - 1;
            for (; k >= 0 && array[k] > currentElement; k--) {
                array[k + 1] = array[k];
            }
            array[k + 1] = currentElement;
        }
    }

    public static void main(String[] args) {
        int[] myArray = {18, 6, 9, 6, 2, 10, 19, 5, 4};
        sort(myArray);
        System.out.println(Arrays.toString(myArray));
    }
}