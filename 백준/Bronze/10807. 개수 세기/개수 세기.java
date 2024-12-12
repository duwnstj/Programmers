import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out))) {

            int N = Integer.parseInt(bufferedReader.readLine());
            int[] numbers = new int[N];

            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = Integer.parseInt(stringTokenizer.nextToken());
            }
            int target = Integer.parseInt(bufferedReader.readLine());
            int count = 0;

            for (int number : numbers) {
                if (number == target) {
                    count++;
                }
            }
            bufferedWriter.write(count + "\n");
            bufferedWriter.flush();
        }

    }
}
