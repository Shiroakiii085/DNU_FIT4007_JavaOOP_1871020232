public class Ex05CheckIfStringContainsDigit {
    public static void main(String[] args) {
        String input = "Hello123World";
        boolean containsDigit = false;
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (currentChar >= '0' && currentChar <= '9') {
                containsDigit = true;
                break;
            }
        }
        if (containsDigit) {
            System.out.println("Chuoi chua it nhat mot chu so.");
        } else {
            System.out.println("Chuoi khong chua chu so nao.");
        }
    }
}
