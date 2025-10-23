import java.util.Scanner;

public class Ex06FirstAndLast {
    public static void main(String []args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so phan tu cua mang: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Nhap phan tu thu " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
        if (n > 0) {
            System.out.println("Phan tu dau tien: " + array[0]);
            System.out.println("Phan tu cuoi cung: " + array[n - 1]);
        } else {
            System.out.println("Mang rong khong co phan tu dau tien va cuoi cung.");
        }
    }
}
