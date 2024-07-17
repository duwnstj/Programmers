import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        String a ="";
         String b = n+a;
       
        for(int i=0;i<b.length();i++){
            answer+=Integer.parseInt(b.substring(i,i+1));
        }

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        return answer;
    }
}