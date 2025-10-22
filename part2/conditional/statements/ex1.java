import java.util.Scanner;

public class ex1 {
    public class KiemTraSoTuNhien {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Nhap vao mot so nguyen N: ");
            int N = sc.nextInt();

            if (N >= 0) {
                System.out.println(N + " la so tu nhien.");
            } else {
                System.out.println(N + " khong phai la so tu nhien.");
            }

            sc.close();
        }
    }
}
