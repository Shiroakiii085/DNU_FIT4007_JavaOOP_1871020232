public class Ex08StarPyramidOneLoop {
    public static void main(String[] args) {
        int height = 5;
        int totalWidth = 2 * height - 1; 
        int totalChars = height * totalWidth; 

        int currentRow = 1;  
        int currentCol = 1;   
        for (int i = 1; i <= totalChars; i++) {
            int numStars = 2 * currentRow - 1;
            int numSpaces = height - currentRow;

            if (currentCol <= numSpaces || currentCol > numSpaces + numStars) {
                System.out.print(" ");
            } else {
                System.out.print("*");
            }

            currentCol++;

            if (currentCol > totalWidth) {
                System.out.println();
                currentRow++;
                currentCol = 1;
            }
        }
    }
}
