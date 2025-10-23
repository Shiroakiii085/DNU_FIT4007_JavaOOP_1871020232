import java.util.Scanner;

public class Ex11PrintDivisorsOfN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao so nguyen duong N: ");
        int N = sc.nextInt();
        if (N <= 0) {
            System.out.println("Vui long nhap so nguyen duong hop le.");
            return;
        }
        System.out.print("Cac uoc so cua " + N + " la: ");
        //khong dung first 
        for (int i = 1; i <= N; i++) {
            if (N % i == 0) {
                if (i > 1) {
                    System.out.print(" ");
                }
                System.out.print(i);
            }
        }
    }
}
