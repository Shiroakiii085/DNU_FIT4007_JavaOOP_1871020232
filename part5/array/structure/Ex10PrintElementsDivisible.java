import java.util.Scanner;

public class Ex10PrintElementsDivisible {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so phan tu cua mang: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Nhap phan tu thu " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
        boolean found = false;
        System.out.print("Cac phan tu chia het cho 5 la: ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 5 == 0) {
                System.out.print(array[i] + " ");
                found = true;
            }
        }
        if (!found) {
            System.out.println("Khong co phan tu nao chia het cho 5!");
        }
    }
}
