package ss3_array_and_method.bai_tap;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class MergeArray {
    public static int[] NhapMang() {
        int n = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a element: ");
        n = sc.nextInt();
        int[] a = new int[n];
        System.out.print("\n Input value element of array: \n");
        for (int i = 0; i < a.length; i++) {
            System.out.print("a[" + i + "] =  ");
            a[i] = sc.nextInt();
        }
        return a;
    }

    public static void XuatMang(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }


    public static int[] Gop2Mang(int a[], int b[]) {
        int[] c = new int[a.length + b.length];
        int i = 0;
        int j = 0;
        for (int k = 0; k < c.length; k++) {
            if (i < a.length && j < b.length) {
                if (a[i] <= b[j]) {
                    c[k] = a[i];
                    i++;
                } else {
                    c[k] = b[j];
                    j++;
                }
            } else {
                if (i < a.length) {
                    c[k] = a[i];
                    i++;
                } else if (j < b.length) {
                    c[k] = b[j];
                    j++;
                }
            }
        }
        return c;
    }

    public static void main(String[] args) {
        System.out.print("Merge Array \n");
        System.out.print("\n Input array A: \n");
        int[] a = NhapMang();
        XuatMang(a);
        System.out.print("\nInput array B: \n");
        int[] b = NhapMang();
        XuatMang(b);
        System.out.print("\nMerge Array A+B: \n");
        int[] c = Gop2Mang(a, b);
        XuatMang(c);
    }
    }
