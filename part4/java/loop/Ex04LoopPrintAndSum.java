import java.util.Scanner;

public class Ex04LoopPrintAndSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao 1 so tu nhien: ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
            sum += i;
        }
        System.out.println("Tong cua day so = " + sum);
    }
}
