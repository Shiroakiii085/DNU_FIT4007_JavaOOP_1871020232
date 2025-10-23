import java.util.Scanner;

public class Ex08CheckPowerOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao 1 so tu nhien: ");
        int n = sc.nextInt();

        if (n > 0 && (n & (n - 1)) == 0) {
            System.out.println(n + " là luy thua cua 2.");
        } else {
            System.out.println(n + " khong phai la luy thua cua 2.");
        }
    }
}
