import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap vao chieu dai cua hinh chu nhat:");
        int length = sc.nextInt();

        System.out.print("Nhap vao chieu rong cua hinh chu nhat:");
        int width = sc.nextInt();

        if (length == width) {
            System.out.print("Day la hinh vuong.");
        } else {
            System.out.print("Khong phai la hinh vuong.");
        }

        sc.close();
    }
}
