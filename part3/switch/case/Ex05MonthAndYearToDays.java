
import java.util.Scanner;

public class Ex05MonthAndYearToDays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap thang (1-12): ");
        int month = sc.nextInt();
        System.out.print("Nhap nam: ");
        int year = sc.nextInt();
        int days;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                days = 31;
                System.out.println("Thang " + month + " nam " + year + " co " + days + " ngay.");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                days = 30;
                System.out.println("Thang " + month + " nam " + year + " co " + days + " ngay.");
                break;
            case 2:
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    days = 29;
                    System.out.println("Thang " + month + " nam " + year + " co " + days + " ngay.");
                } else {
                    days = 28;
                    System.out.println("Thang " + month + " nam " + year + " co " + days + " ngay.");
                }
                break;
            default:
                System.out.println("Thang khong hop le. Vui long nhap thang tu 1 den 12.");
                return;
        }
    }
}
