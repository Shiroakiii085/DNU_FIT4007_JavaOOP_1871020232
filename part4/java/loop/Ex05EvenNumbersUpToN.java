import java.util.Scanner;

public class Ex05EvenNumbersUpToN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap N (so nguyen duong): ");
        int N = sc.nextInt();
        if (N < 0) {
            System.out.println("Vui long nhap so nguyen duong hop le.");
            return;
        }

        boolean first = true;
        for (int i = 2; i <= N; i += 2) {
            if (!first) System.out.print(" ");
            System.out.print(i);
            first = false;
        }
        System.out.println();
    }
}
