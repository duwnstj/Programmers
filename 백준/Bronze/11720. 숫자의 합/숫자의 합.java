import java.util.Scanner;

public class Main {
    //숫자의 합
    // 입력값이 100자리까지이기때문에 int,long 타입을 쓸수 없음
    // String으로 문제를 풀어야함
    // String을 단일 문자로 변환 후 정수로 변환해서 그 값들을 더해 출력해주면 풀릴것같다

    // 슈도 코드
    //숫자의 자리 수 입력(int)
    // 숫자를 입력(String)
    // 입력받은 숫자를 단일문자 배열로 변경해서 자리수를 담는다.

    // for(단일문자 길이만큼){
    //  Sum += 단일문자->정수
    // }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String sNum = sc.next();
        int sum = 0;

        char[] cNum = sNum.toCharArray();

        for (int i = 0; i < cNum.length; i++) {
            sum += cNum[i] - '0';
        }
        System.out.println(sum);

    }
}