import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao 3 goc cua tam giac(cach nhau bang dau cach): ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a <= 0 || b <= 0 || c <= 0) {
            System.out.print("Goc phai lon hon 0.");
            return;
        }

        if(a + b + c == 180) {
            System.out.print("Day la 3 goc cua tam giac.");
        } else {
            System.out.print("Day khong phai la 3 goc cua tam giac.");
        }
    }
}
