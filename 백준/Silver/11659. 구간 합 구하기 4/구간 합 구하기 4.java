import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    /*
     입력
     수의 개수 N , 합을 구해야하는 횟수 M
     N개의 수
     합을 구해야하는 구간 i와 j가 M만큼 있어야함

     출력
     총 M개의 줄에 입력된 i~j수까지의 합을 출력해준다.

      */
    /*
    슈도 코드
    suNo(숫자 개수 ) , quizNo(질의 개수) 저장하기
    for(숫자 개수만큼 반복하기){
    합 배열 생성하기 S[i] = S[i-1]+A[i]
    }
    for(질의 개수만큼 반복하기){
    질의 범위 받기(i~j)
    구간 합 출력하기 S[j]-S[i-1]
    }
     */
    // 최악이 숫자 개수도 10만개, 질의 개수도 10만개이기때문에 Scanner 대신 BufferedReader 사용이 더 좋음
    // 이유는 더 빠르기 때문
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        //입력 값 suNo, quizNo 생성
        int suNo = Integer.parseInt(stringTokenizer.nextToken());
        int quizNo = Integer.parseInt(stringTokenizer.nextToken());

        //합배열 생성
        long[] s = new long[suNo + 1];

        stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        for (int i = 1; i <= suNo; i++) {
            s[i] = s[i - 1] + Integer.parseInt(stringTokenizer.nextToken());
        }
        for (int q = 0; q < quizNo; q++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int i = Integer.parseInt(stringTokenizer.nextToken());
            int j = Integer.parseInt(stringTokenizer.nextToken());

            System.out.println(s[j] - s[i - 1]);

        }


    }
}