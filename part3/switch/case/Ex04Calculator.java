import java.util.Scanner;

public class Ex04Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so nguyen a: ");
        int a = sc.nextInt();
        System.out.print("Nhap so nguyen b: ");
        int b = sc.nextInt();
        System.out.print("Nhap phep toan (+, -, *, /, %): ");
        char operator = sc.next().charAt(0);
        int result;
        switch (operator) {
            case '+':
                result = a + b;
                System.out.println("Ket qua: " + a + " + " + b + " = " + result);
                break;
            case '-':
                result = a - b;
                System.out.println("Ket qua: " + a + " - " + b + " = " + result);
                break;
            case '*':
                result = a * b;
                System.out.println("Ket qua: " + a + " * " + b + " = " + result);
                break;
            case '/':
                if (b == 0) {
                    System.out.println("Loi: Khong the chia cho 0.");
                } else {
                    double divisionResult = (double) a / b;
                    System.out.println("Ket qua: " + a + " / " + b + " = " + divisionResult);
                }
                break;
            case '%':
                if (b == 0) {
                    System.out.println("Loi: Khong the chia cho 0.");
                } else {
                    result = a % b;
                    System.out.println("Ket qua: " + a + " % " + b + " = " + result);
                }
                break;
            default:
                System.out.println("Phep toan khong hop le. Vui long nhap mot trong cac phep toan sau: +, -, *, /, %.");
        }
            
    }
}
