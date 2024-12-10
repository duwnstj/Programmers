

import java.util.Scanner;

public class Main {
    // 평균 구하기
    /*
    입력  : 첫번째 줄 : 시험을 본 과목 개수 N (<=1000)
            두번째 줄 : 현재 성적 (
    풀이
            현재점수/최대점수*100 = 새로운 성적
            (A/max*100+B/max*100+C/max*100)/3
            ((A+B+C)*100)/(max*3) == 새로운 평균
            새로운 성적/N = 새로운 평균
    출력 : 새로운 평균
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int max = 0;
        int sum = 0;

        for (int i = 0; i < N; i++) {
            int temp = sc.nextInt();
            if (temp > max) {
                max = temp;
            }
            sum += temp;
        }
        double result = (sum * 100.0) / (max * N);
        System.out.println(result);

    }
}
