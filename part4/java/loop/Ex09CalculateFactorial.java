import java.util.Scanner;

public class Ex09CalculateFactorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao so nguyen duong n: ");
        int n = sc.nextInt();
        if (n < 0) {
            System.out.println("Vui long nhap so nguyen duong hop le.");
            return;
        }
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        System.out.println("Giai thua cua " + n + " la: " + factorial);
    }
}
