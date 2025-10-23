public class Ex07ConvertToUppercase {
    public static void main(String[] args) {
        String input = "Malenia!";
        StringBuilder uppercaseString = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (currentChar >= 'a' && currentChar <= 'z') {
                char upperChar = (char) (currentChar - ('a' - 'A'));
                uppercaseString.append(upperChar);
            } else {
                uppercaseString.append(currentChar);
            }
        }
        System.out.println("Chuoi sau khi chuyen thanh chu in hoa: " + uppercaseString.toString());
    }
}
