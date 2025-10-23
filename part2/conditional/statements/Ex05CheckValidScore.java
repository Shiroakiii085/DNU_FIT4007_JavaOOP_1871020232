import java.util.Scanner;

public class Ex05CheckValidScore {
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