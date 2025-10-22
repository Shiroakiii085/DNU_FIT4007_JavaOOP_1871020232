//VD 6: Nhập vào một số nguyên N, hãy in ra chữ số cuối cùng của số đó.
import java.util.Scanner;

public class Ex06PrintLastNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao so nguyen N: ");
        int n = sc.nextInt();
        int chuSoCuoi = Math.abs(n % 10);
        System.out.print("Chu so cuoi cung cua so " + n + " la: " + chuSoCuoi);
    }
}
