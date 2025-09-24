
import java.util.Scanner;

public class vidu12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so a: ");
        int a = sc.nextInt();
        System.out.print("Nhap so b: ");
        int b = sc.nextInt();

        a = a + b;
        b = a - b;
        a = a - b;
        System.out.print("Sau khi hoan doi, a = " + a + ", b = " + b);
    }
}
