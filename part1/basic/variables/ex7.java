//VD 7: Nhập vào một số nguyên N có ít nhất 2 chữ số (lớn hơn 9 hoặc nhỏ hơn -9). In ra chữ số gần cuối của N.
import java.util.Scanner;

public class vidu7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao so nguyen N: ");
        int n = sc.nextInt();
        if(n > 9 || n < -9) {
            int chuSoGanCuoi = Math.abs((n / 10) % 10);
            System.out.print("Chu so gan cuoi cung cua so " + n + " la: " + chuSoGanCuoi);
        } else {
            System.out.print("Hay nhap so co it nhat 2 chu so");
        }
    }
}
