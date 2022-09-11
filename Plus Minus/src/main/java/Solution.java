import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

class Result {

    public static void plusMinus(List<Integer> arr) {
        // Write your code here
        float zero = 0;
        float negative = 0;
        float pos = 0;

        for (Integer i : arr) {
            if (i < 0) negative++;
            else if (i > 0) pos++;
            else zero++;
        }

        System.out.printf("%1.6f\n", pos / arr.size());
        System.out.printf("%1.6f\n", negative / arr.size());
        System.out.printf("%1.6f", zero / arr.size());
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}
