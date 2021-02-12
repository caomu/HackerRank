/**
 * @author : CAOMU
 * @version : 1.0
 * @project : HackerRank
 * @since : 2021/02/12, Fri, 12:45
 */

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SalesByMatch {

    private static final Scanner scanner = new Scanner(System.in);

    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {
        Map<Integer, Double> pair = new HashMap<>();
        Arrays.stream(ar).forEach(i -> pair.put(i, pair.getOrDefault(i, 0d) + 0.5d));
        return pair.values().stream().mapToInt(Double::intValue).sum();
    }

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[n];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = sockMerchant(n, ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
