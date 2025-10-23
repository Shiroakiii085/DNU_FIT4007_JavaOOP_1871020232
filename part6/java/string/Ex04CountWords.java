public class Ex04CountWords {
    public static void main(String[] args) {
        String input = "Thay Dung dep trai";
        int wordCount = 0;
        boolean inWord = false;
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (currentChar != ' ' && !inWord) {
                inWord = true;
                wordCount++;
            } else if (currentChar == ' ') {
                inWord = false;
            }
        }
        System.out.println("So tu trong chuoi: " + wordCount);
    }
}
