public class Ex06CheckPangram {
    public static void main(String[] args) {
        String input = "The quick brown fox jumps over a lazy dog";
        boolean[] alphabetPresent = new boolean[26];
        input = input.toLowerCase();
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (currentChar >= 'a' && currentChar <= 'z') {
                int index = currentChar - 'a';
                alphabetPresent[index] = true;
            }
        }
        boolean isPangram = true;
        for (boolean present : alphabetPresent) {
            if (!present) {
                isPangram = false;
                break;
            }
        }
        if (isPangram) {
            System.out.println("Chuoi la pangram.");
        } else {
            System.out.println("Chuoi khong phai la pangram.");
        }
    }
}
