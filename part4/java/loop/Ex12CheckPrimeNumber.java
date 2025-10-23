import java.util.Scanner;

public class Ex12CheckPrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao 1 so nguyen duong: ");
        int n = sc.nextInt();
        if (n < 2) {
            System.out.println(n + " khong phai la so nguyen to.");
            return;
        }
        boolean isPrime = true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println(n + " la so nguyen to.");
        } else {
            System.out.println(n + " khong phai la so nguyen to.");
        }

    }
}
