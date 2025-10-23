import java.util.Scanner;

public class Ex10MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao so nguyen duong N: ");
        int N = sc.nextInt();
        if (N <= 0) {
            System.out.println("Vui long nhap so nguyen duong hop le.");
            return;
        }
        for (int i = 1; i <= 10; i++) {
            System.out.println(N + " x " + i + " = " + (N * i));
        }
    }
}
