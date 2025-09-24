//VD 3: Nhập và chiều dài và chiều rộng của một hình chữ nhật, tính và in ra chu vi và diện tích của hình chữ nhật đó.
import java.util.Scanner;

public class vidu3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap vao chieu dai: ");
        double chieuDai = sc.nextDouble();
        System.out.print("Nhap vao chieu rong: ");
        double chieuRong = sc.nextDouble();

        double chuVi = (chieuDai + chieuRong) * 2;
        double dienTich = chieuDai * chieuRong;

        if(chieuDai > 0 & chieuRong > 0) {
            System.out.print("\nChu vi hinh chu nhat = " + chuVi);
            System.out.print("\nDien tich hinh chu nhat = " + dienTich);
        } else {
            System.out.print("Hay nhap chieu dai va chieu rong > 0");
        }
    }
}
