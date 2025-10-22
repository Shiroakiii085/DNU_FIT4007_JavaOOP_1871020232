import java.util.Scanner;

public class Ex01NumberToWord {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.print("Nhap vao so tu nhien co mot chu so (1 -> 9): ");
        int n = sc.nextInt();

        if (n < 1 || n > 9) {
            System.out.println("So khong hop le. Vui long nhap so tu 1 den 9.");
            return;
        }

        String word;
        switch (n) {
            case 1:
                word = "Mot";
                break;
            case 2:
                word = "Hai";
                break;
            case 3:
                word = "Ba";
                break;
            case 4:
                word = "Bon";
                break;
            case 5:
                word = "Nam";
                break;
            case 6:
                word = "Sau";
                break;
            case 7:
                word = "Bay";
                break;
            case 8:
                word = "Tam";
                break;
            case 9:
                word = "Chin";
                break;
            default:
                word = "Khong xac dinh";
        }

        System.out.println(word);
    }
}