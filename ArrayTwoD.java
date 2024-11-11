import java.util.Arrays;

public class ArrayTwoD {
    public static void main(String[] args) {
        int[][] nums = {{1, 2}, {4, 5, 3}, {7, 8, 9, 10}};
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                System.out.print("| " + nums[i][j] + " | ");

            }
            System.out.println();
        }
        String[][] names = {};
        names = new String[3][];
        names[0]  = new String[3];
        names[1]  = new String[4];
        names[2] = new String[5];
        System.out.println(Arrays.deepToString(names));
        
    }
}
