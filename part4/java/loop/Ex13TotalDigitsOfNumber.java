import java.util.Scanner;

public class Ex13TotalDigitsOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao so nguyen duong N: ");
        int N = sc.nextInt();
        if (N <= 0) {
            System.out.println("Vui long nhap so nguyen duong hop le.");
            return;
        }
        int sum = 0;
        while (N > 0) {
            sum += N % 10; 
            N /= 10; 
        }
        System.out.println("Tong cac chu so la: " + sum);
    }
}
