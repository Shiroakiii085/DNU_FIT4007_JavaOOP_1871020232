//VD 1: Nhập vào hai số nguyên a và b, tính và in ra tổng, hiệu, tích và thương của 2 số đó.
import java.util.Scanner;

public class vidu1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so a: ");
        int a = sc.nextInt();
        System.out.print("nhap so b: ");
        int b = sc.nextInt();

        int tong = a + b;
        int hieu = a - b;
        int tich = a * b;
        double thuong = (double) a / b;

        if(b != 0) {
            System.out.print("\nTong 2 so la: " + tong);
            System.out.print("\nHieu 2 so la: " + hieu);
            System.out.print("\nTich 2 so la: " + tich);
            System.out.print("\nThuong 2 so la: " + thuong);
        } else {
            System.out.print("\nHay nhap b khac 0 de tinh thuong");
        }
    }
}