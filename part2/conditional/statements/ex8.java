import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap vao mot so thuc: ");
        float a = sc.nextFloat();

        int intPart = (int) a;

        if (a == intPart) {
            System.out.println("Day la so nguyen.");
        } else {
            System.out.println("Day khong phai la so nguyen.");
        }
        sc.close();
    }
}
