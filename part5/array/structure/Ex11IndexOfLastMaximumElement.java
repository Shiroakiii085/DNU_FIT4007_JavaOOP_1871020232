import java.util.Scanner;

public class Ex11IndexOfLastMaximumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so phan tu cua mang: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Nhap phan tu thu " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
        int maxIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] >= array[maxIndex]) {
                maxIndex = i;
            }
        }
        System.out.println("Chi so cua phan tu lon nhat cuoi cung trong mang la: " + maxIndex);
        scanner.close();
    }
}
