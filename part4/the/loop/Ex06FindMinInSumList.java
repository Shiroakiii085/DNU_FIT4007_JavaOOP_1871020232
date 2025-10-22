//Nhập vào số nguyên dương S, tìm số nguyên dương N nhỏ nhất sau cho:1 + 2 + 3 + ... + N <= S
import java.util.Scanner;

public class Ex06FindMinInSumList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao so nguyen duong S: ");
        int S = sc.nextInt();
        int sum = 0;
        int N = 0;
        while (sum + N + 1 <= S) {
            N++;
            sum += N;
        }
        System.out.println("So nguyen duong N nho nhat la: " + N);
    }
}
