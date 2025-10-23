
import java.util.Scanner;

public class Ex15SumOfConsecutiveProducts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao so nguyen duong N: ");
        int N = sc.nextInt();
        if (N <= 0) {
            System.out.println("Vui long nhap so nguyen duong hop le.");
            return;
        }
        //Nhập số nguyên dương N, tính tổng sau: 1 * 2 + 2 * 3 + 3 * 4 + ... + N * (N + 1)
        int sum = 0;
        for (int i = 1; i <= N; i++) {
            sum += i * (i + 1);
        }
        System.out.println("Tong cua bieu thuc la: " + sum);
    }
}
