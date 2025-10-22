import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so muon kiem tra: ");
        int n = sc.nextInt();
        if (n < 0) {
            System.out.println(n + " khong phai la so chinh phuong.");
        } else {
            int sqrt = (int) Math.sqrt(n);
            if (sqrt * sqrt == n) {
                System.out.println(n + " la so chinh phuong.");
            } else {
                System.out.println(n + " khong phai la so chinh phuong.");
            }
        }
        sc.close();
    }
}
