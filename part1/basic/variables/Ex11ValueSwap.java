//VD 11: Nhập vào 2 số nguyên a và b, hãy hoán đổi giá trị của a và b. Ví dụ nhập a = 7, b = 5. Sau khi thực hiện chương trình thì a = 5, b = 7.
import java.util.Scanner;

public class Ex11ValueSwap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so a: ");
        int a = sc.nextInt();
        System.out.print("Nhap so b: ");
        int b = sc.nextInt();
        
        int c = a;
        a = b;
        b = c;
        
        System.out.print("Sau khi hoan doi, a = " + a + ", b = " + b);
    }
}
