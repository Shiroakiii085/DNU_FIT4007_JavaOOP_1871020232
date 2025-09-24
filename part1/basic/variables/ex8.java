// VD 8: Nhập vào tên của bạn, hãy in ra số ký tự trong tên đó.
import java.util.Scanner;

public class vidu8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao ten cua ban: ");
        String ten = sc.nextLine();

        int demTen = ten.length();
        System.out.print("So ky tu trong ten cua ban la: " + demTen);
    }
}
