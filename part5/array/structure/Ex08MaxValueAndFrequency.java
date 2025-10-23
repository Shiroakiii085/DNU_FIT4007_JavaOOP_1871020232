import java.util.Scanner;

public class Ex08MaxValueAndFrequency {
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
            int frequency = 1;
            for (int i = 1; i < array.length; i++) {
                if (array[i] > max) {
                    max = array[i];
                    frequency = 1;
                } else if (array[i] == max) {
                    frequency++;
                }
            }
            System.out.println("Gia tri lon nhat trong mang la: " + max);
            System.out.println("Tan suat xuat hien cua gia tri lon nhat la: " + frequency);
        } else {
            System.out.println("Mang rong khong co gia tri lon nhat.");
        }
    }
}
