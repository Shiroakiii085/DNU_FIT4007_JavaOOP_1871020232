import java.util.Scanner;

public class Ex05PrintArrayInReverseOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
            array[i] = scanner.nextInt();
        }
        for (int i = N - 1; i >= 0; i--) {
            System.out.println(array[i]);
        }
        scanner.close();
    }
}
