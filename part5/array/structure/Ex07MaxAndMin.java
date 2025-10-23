import java.util.Scanner;

public class Ex07MaxAndMin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so phan tu cua mang: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Nhap phan tu thu " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
        if (n > 0) {
            int max = array[0];
            int min = array[0];
            for (int i = 1; i < array.length; i++) {
                if (array[i] > max) {
                    max = array[i];
                }
                if (array[i] < min) {
                    min = array[i];
                }
            }
            System.out.println("Gia tri lon nhat trong mang la: " + max);
            System.out.println("Gia tri nho nhat trong mang la: " + min);
        } else {
            System.out.println("Mang rong khong co gia tri lon nhat va nho nhat.");
        }
    }
}
