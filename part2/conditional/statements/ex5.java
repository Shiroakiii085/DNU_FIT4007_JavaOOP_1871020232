import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao diem so: ");
        int score = sc.nextInt();
        if(score >= 0 && score <= 10) {
            System.out.print("Diem so hop li.");
        } else {
            System.out.print("Diem so khong hop li.");
        }
        sc.close();
    }
}