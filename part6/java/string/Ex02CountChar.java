public class Ex02CountChar {
    public static void main(String[] args) {
        String input = "hahaha";
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'a' || input.charAt(i) == 'A') {
                count++;
            }
        }
        System.out.println("So ky tu 'a' trong chuoi: " + count);
    }
}

