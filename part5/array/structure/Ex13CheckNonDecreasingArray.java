import java.util.Scanner;

public class Ex13CheckNonDecreasingArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so phan tu cua mang: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Nhap phan tu thu " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
        boolean isNonDecreasing = true;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                isNonDecreasing = false;
                break;
            }
        }
        if (isNonDecreasing) {
            System.out.println("Mang la mang khong giam dan.");
        } else {
            System.out.println("Mang khong phai la mang khong giam dan.");
        }
        scanner.close();
    }
}
