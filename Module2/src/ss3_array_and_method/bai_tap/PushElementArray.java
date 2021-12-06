package ss3_array_and_method.bai_tap;

public class PushElementArray {
    public static void main(String[] args) {
        int a[] = new int[10];
        int index = 3;
        int x = 5;
        int n = 5;
        for (int i = 0; i < n; i++) {
            a[i] = i + 1;
        }
        System.out.println("Trước khi thêm phần tử: ");
        for (int element : a) {
            System.out.print(element + " ");
        }
        System.out.println();
        for (int i = n; i > index; i--) {
            a[i] = a[i - 1];
        }
        a[index] = x;
        System.out.println("Sau khi them phan tu: ");
        for (int element : a) {
            System.out.print(element + " ");
        }
        System.out.println();

    }
}
