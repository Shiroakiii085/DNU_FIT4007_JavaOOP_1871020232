import java.util.Scanner;

public class Ex04CompareTwoIntergers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao mot so nguyen a: ");
        int a = sc.nextInt();
        System.out.print("Nhap vao mot so nguyen b: ");
        int b = sc.nextInt();
        if(a - b > 0) {
            System.out.print(a + " lon hon " + b);
        } else if (a - b < 0) {
            System.out.print(a + " nho hon " + b);
        } else {
            System.out.print(a + " bang " + b);
        }
    }
}
