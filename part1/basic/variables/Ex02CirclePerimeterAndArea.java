//VD2: Nhập vào bán kính của một hình tròn, tính và in ra chu vi và diện tích của hình tròn đó.
import java.util.Scanner;

public class Ex02CirclePerimeterAndArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ban kinh cua hinh tron: ");
        double banKinh = sc.nextDouble();

        double chuVi = 2 * Math.PI * banKinh;
        double dienTich = Math.PI * banKinh * banKinh;

        if(banKinh > 0) {
            System.out.print("\nChu vi hinh tron = " + chuVi);
            System.out.print("\nDien tich hinh tron = " + dienTich);
        } else {
            System.out.print("Ban kinh hinh tron khong the am");
        }
    }
}
