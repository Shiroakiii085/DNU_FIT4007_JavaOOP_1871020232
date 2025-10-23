import java.util.Scanner;

public class Ex07InputPositiveInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Nhap vao so nguyen duong: ");
                int n = sc.nextInt();
                if (n > 0) {
                    System.out.println("So nguyen duong ban vua nhap la: " + n);
                    break;
                } else {
                    System.out.println("Vui long nhap so nguyen duong hop le.");
                }
        } while (true);
    }
}
