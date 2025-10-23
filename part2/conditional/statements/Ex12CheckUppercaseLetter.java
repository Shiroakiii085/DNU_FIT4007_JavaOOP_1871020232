import java.util.Scanner;

public class Ex12CheckUppercaseLetter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao ki tu: ");
        char ch = sc.next().charAt(0);
        if ((ch >= 'A' && ch <= 'Z')) {
            System.out.println(ch + " la chu cai hoa.");
        } else {
            System.out.println(ch + " khong phai la chu cai hoa.");
        }
    }
}
