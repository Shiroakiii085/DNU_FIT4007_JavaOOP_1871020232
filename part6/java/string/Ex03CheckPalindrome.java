public class Ex03CheckPalindrome {
    public static void main(String[] args) {
        String input = "racecar";
        String reversed = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }
        if (input.equals(reversed)) {
            System.out.println("Chuoi la chuoi doi xung.");
        } else {
            System.out.println("Chuoi khong phai la chuoi doi xung.");
        }
    }
}
