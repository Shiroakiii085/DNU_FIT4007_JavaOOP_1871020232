// VD 9: Nhập vào 2 số nguyên a và b, (b khác 0) hãy in ra kết quả của a / b như bên dưới với điều khiện chỉ sử dụng hàm in một lần.
import java.util.Scanner;
public class vidu9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so a: ");
        int a = sc.nextInt();
        System.out.print("Nhap so b (b khac 0): ");
        int b = sc.nextInt();
        if(b != 0) {
            double thuong = (double) a / b;
            System.out.print(a + " / " + b + " = " + thuong);
        } else {
            System.out.print("Hay nhap b khac 0");
        }
    }
}