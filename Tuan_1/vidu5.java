//Vd 5: Nhập tuổi của một sinh viên tính đến năm 2023, hãy tính và in ra năm sinh viên đó.
import java.util.Scanner;

public class vidu5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap vao so tuoi cua sinh vien: ");
        int soTuoi = sc.nextInt();

        int namSinh = 2023 - soTuoi;
        if(soTuoi >= 18) {
        System.out.print("Nam sinh = " + namSinh);
        } else {
            System.out.print("Hay nhap so tuoi >= 18");
        }
    }
}
