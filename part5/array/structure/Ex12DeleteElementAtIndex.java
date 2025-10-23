import java.util.Scanner;

public class Ex12DeleteElementAtIndex {
    public static void main(String[] args) {
        //Nhập vào mảng gồm N số nguyên, nhập vào một số nguyên k (0 <= k < N). Hãy xoá phần tử ở chỉ số k trong mảng, sau đó in ra mảng.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so phan tu cua mang: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Nhap phan tu thu " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
        System.out.print("Nhap chi so k can xoa (0 <= k < " + n + "): ");
        int k = scanner.nextInt();
        if (k < 0 || k >= n) {
            System.out.println("Chi so k khong hop le.");
        } else {
            int[] newArray = new int[n - 1];
            for (int i = 0, j = 0; i < array.length; i++) {
                if (i != k) {
                    newArray[j++] = array[i];
                }
            }
            System.out.print("Mang sau khi xoa phan tu o chi so " + k + " la: ");
            for (int i = 0; i < newArray.length; i++) {
                System.out.print(newArray[i] + " ");
            }
        }
    }
}
