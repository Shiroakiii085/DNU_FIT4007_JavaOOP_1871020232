import java.util.Scanner;

public class Ex14CompareStringLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao chuoi a: ");
        String a = sc.nextLine();
        System.out.print("Nhap vao chuoi b: ");
        String b = sc.nextLine();
        if (a.length() > b.length()) {
            System.out.println(a);
        } else if (a.length() < b.length()) {
            System.out.println(b);
        } else {
            System.out.println(a);
        }
    }
}
