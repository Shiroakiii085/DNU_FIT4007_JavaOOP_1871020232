import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao 3 canh cua tam giac(nhap lien tiep cach nhau bang dau cach): ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a + b > c && a + c > b && b + c > a) {
            System.out.print("Day la 3 canh cua tam giac.");
        } else {
            System.out.print("Day khong phai la 3 canh cua tam giac.");
        }
        sc.close();
    }
}
