import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Result {

    /*
     * Complete the 'staircase' function below.
     *
     * The function accepts INTEGER n as parameter.
     */

    public static void staircase(int n) {
        // Write your code here
        int space = n - 1;
        int symbol = 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }

            for (int x = 0; x < symbol; x++) {
                System.out.print("#");
            }
            space--;
            symbol++;
            System.out.println("");
        }

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        Result.staircase(n);

        bufferedReader.close();
    }
}
