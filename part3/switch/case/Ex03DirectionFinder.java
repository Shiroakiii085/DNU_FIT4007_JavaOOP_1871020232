import java.util.Scanner;

public class Ex03DirectionFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap N/S/W/E: ");
        String direction = sc.nextLine().toUpperCase();
        switch (direction) {
            case "N":
                System.out.println("North");
                break;
            case "S":
                System.out.println("South");
                break;
            case "W":
                System.out.println("West");
                break;
            case "E":
                System.out.println("East");
                break;
            default:
                System.out.println("Khong xac dinh");
        }
    }
}
