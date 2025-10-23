import java.util.Scanner;

public class Ex01ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao chuoi muon dao nguoc: ");
        String input = sc.nextLine();
        String reversed = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }
        System.out.println("Chuoi sau khi dao nguoc: " + reversed);
        sc.close();
    }
}
