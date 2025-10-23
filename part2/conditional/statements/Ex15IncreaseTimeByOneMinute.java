import java.util.Scanner;

public class Ex15IncreaseTimeByOneMinute {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao so gio hien tai: ");
        int h = sc.nextInt();
        if (h <= 0 || h >= 24) {
            System.out.print("So gio khong hop le.");
        }
        System.out.print("Nhap vao so phut hien tai: ");
        int m = sc.nextInt();
        if (m < 0 || m >= 60) {
            System.out.print("So phut khong hop le.");
        }
        if (m == 59) {
            m = 0;
            h++;
            if (h == 24) {
                h = 0;
            }
        } else {
            m++;
        }
        System.out.print("Thoi gian sau 1 phut la: " + h + " gio " + m + " phut");
        sc.close();
    }
}
