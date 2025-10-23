public class Ex09CountOccurences {
    public static void main(String[] args) {
        String input = "hello world hello everyone";
        String target = "hello";
        int count = 0;

        int index = 0;
        while ((index = input.indexOf(target, index)) != -1) {
            count++;
            index += target.length();
        }

        System.out.println("So lan xuat hien cua '" + target + "': " + count);
    }
}
