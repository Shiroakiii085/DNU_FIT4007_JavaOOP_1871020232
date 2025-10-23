import java.util.Scanner;

public class Ex13CompareTwoStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao chuoi a: ");
        String a = sc.nextLine();
        System.out.print("Nhap vao chuoi b: ");
        String b = sc.nextLine();

        if (a.equals(b)) {
            System.out.println("2 chuoi giong nhau.");
        } else {
            System.out.println("2 chuoi khong giong nhau.");
        }
        sc.close();
    }
}
