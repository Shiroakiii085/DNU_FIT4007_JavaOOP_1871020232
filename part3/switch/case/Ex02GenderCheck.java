import java.util.Scanner;

public class Ex02GenderCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so 0/1/2 (0 = M/ 1 = F/2 = O): ");
        int a = sc.nextInt();
        if (a < 0 || a > 2) {
            System.out.println("So khong hop le. Vui long nhap so 0, 1 hoac 2.");
            return;
        }
        switch (a) {
            case 0:
                System.out.println("Male");
                break;
            case 1:
                System.out.println("Female");
                break;
            case 2:
                System.out.println("Other");
                break;
            default:
                System.out.println("Khong xac dinh");
        }
    }
}
