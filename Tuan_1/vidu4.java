//VD 4: Nhập và 3 cạnh của 1 tam giác, tính và in ra chu vi và diện tích của tam giác đó.
import java.util.Scanner;

public class vidu4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nNhap vao canh thu nhat: ");
        double a = sc.nextDouble();
        System.out.print("Nhap vao canh thu hai: ");
        double b = sc.nextDouble();
        System.out.print("Nhap vao canh thu ba: ");
        double c = sc.nextDouble();

        double chuVi = a + b + c;
        double p = chuVi / 2;
        double dienTich = Math.sqrt(p * (p - a) * (p - b) * (p - c));

        if (a > 0 & b > 0 & c > 0) {
            System.out.print("Chu vi cua hinh tam giac = " + chuVi);
            System.out.print("\nDien tich cua hinh tam giac = " + dienTich);
        } else {
            System.out.print("Hay nhap ba canh cua tam giac > 0");
        }
    }   
}
