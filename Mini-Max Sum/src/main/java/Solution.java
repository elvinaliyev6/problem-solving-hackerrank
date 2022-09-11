import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

class Result {

    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here
        long max = arr.get(0);
        long min = arr.get(0);
        long sum = arr.get(0);

        for (int i = 1; i < arr.size(); i++) {
            if (max < arr.get(i))
                max = arr.get(i);

            if (min > arr.get(i))
                min = arr.get(i);

            sum += arr.get(i);
        }

        System.out.printf("%d %d", sum - max, sum - min);
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        Result.miniMaxSum(arr);

        bufferedReader.close();
    }
}
