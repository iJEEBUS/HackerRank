import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }
        //printMatrix(arr);
        int max_hourglass = Collections.max(hourGlassTotals(arr));
        System.out.println(max_hourglass);
        scanner.close();
    }

    /**
    *
    * This method loops through the given 6 x 6 2D matrix and generates a 
    * summation of all of the hourglass figures total sums.
    *
    * @param arr - the 6x6 2D matrix
    * @returns List<integer> - the list of all the hourglass totals
    */
    private static List<Integer> hourGlassTotals(int[][] arr) {
        int total_sum = 0;
        int total_rows = arr.length;
        int total_cols = arr[0].length;
        List<Integer> answers = new ArrayList<Integer>();
        
        for (int row = 0; row < total_rows; row++) {
            for (int col = 0; col < total_cols; col++) {
                if (row < total_rows - 2) {
                    if (col < total_cols - 2){
                        total_sum += arr[row][col] + arr[row][col+1] + arr[row][col+2];
                        total_sum += arr[row+1][col+1];
                        total_sum += arr[row+2][col] + arr[row+2][col+1] + arr[row+2][col+2];
                        answers.add(total_sum);
                        total_sum = 0;
                    }
                }
            }
        }
        return answers;
    }
}
