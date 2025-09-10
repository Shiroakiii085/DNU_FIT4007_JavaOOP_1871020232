//Vd 10: Nhập vào 1 ký tự thường (từ 'a' đến 'y'), hãy in ra ký tư liền sau ký tự vừa nhập.
import java.util.Scanner;

public class vidu10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao 1 ky tu thuong (tu 'a' den 'y'): ");
        char kyTu = sc.next().charAt(0);
        if(kyTu >= 'a' && kyTu <= 'y') {
            char kyTuLienSau = (char) (kyTu + 1);
            System.out.print("Ky tu lien sau cua " + kyTu + " la: " + kyTuLienSau);
        } else {
            System.out.print("Hay nhap ky tu thuong tu 'a' den 'y'");
        }
    }
}
