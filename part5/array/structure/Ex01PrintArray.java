import java.util.Scanner;

public class Ex01PrintArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Nhap phan tu thu " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
        System.out.print("Mang vua nhap la: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        scanner.close();
    }
    
}
