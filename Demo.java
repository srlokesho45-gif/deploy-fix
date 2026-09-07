public class Demo {
    public static void main(String[] args) {
        int num[][] = new int[3][];
        num[0] = new int[3];
        num[1] = new int[2];
        num[2] = new int[1];

        // Fill the jagged array
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                num[i][j] = (int) (Math.random() * 10);
            }
        }

        // Print the array (separate loop, after filling is done)
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                System.out.print(num[i][j] + " ");
            }
            System.out.println();
        }
    }
}