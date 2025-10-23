import java.util.Scanner;

public class Ex11CheckLowercaseLetter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao ki tu: ");
        char ch = sc.next().charAt(0);
        if ((ch >= 'a' && ch <= 'z')) {
            System.out.println(ch + " la chu cai thuong.");
        } else {
            System.out.println(ch + " khong phai la chu cai thuong.");
        }
    }
}