import java.util.Scanner;

public class Ex10CheckMutipleOfTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao so a: ");
        int a = sc.nextInt();
        System.out.print("Nhap vao so b: ");
        int b = sc.nextInt();
        System.out.print("Nhap vao so c: ");
        int c = sc.nextInt();
        if (a % b == 0 && a % c == 0) {
            System.out.println("a la boi so cua b va c");
        } else {
            System.out.println("a khong phai la boi so cua b va c");
        }
    }
}
