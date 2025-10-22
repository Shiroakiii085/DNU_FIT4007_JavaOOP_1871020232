import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap vao mot so nguyen: ");
        int number = sc.nextInt();

        if (number % 2 == 0) {
            System.out.println(number + " la so chan.");
        } else {
            System.out.println(number + " la so le.");
        }

        sc.close();
    }
    
}
