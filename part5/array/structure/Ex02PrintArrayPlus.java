
import java.util.Scanner;

public class Ex02PrintArrayPlus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so phan tu cua mang: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Nhap phan tu thu " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
        System.out.print("Mang vua nhap la: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        scanner.close();
    }
}
