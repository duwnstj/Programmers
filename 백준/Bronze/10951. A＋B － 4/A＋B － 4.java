import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        String line = "";
        while ((line = bufferedReader.readLine()) != null) {
            StringTokenizer stringTokenizer = new StringTokenizer(line);
            int A = Integer.parseInt(stringTokenizer.nextToken());
            int B = Integer.parseInt(stringTokenizer.nextToken());
            bufferedWriter.write((A + B) + "\n");

        }
        bufferedWriter.flush();

    }
}