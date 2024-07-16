import java.math.BigInteger;
class Solution {
    public String solution(String a, String b) {
        String answer = "";
        //예제 2번에 적합하게 int보다 큰값인 long을 넣어서 문제를 풀어봤는데
        //long에서도 정수 값보다 크다는 같은 에러가 떳다.
        //구글링을 해보니 BigInteger를 사용하면 매우 큰 정수를 다룰 수 있다는 것을
        // 알게 되었다. BigInteger 클래스를 사용하여 문제를 해결했다.
        // try catch문을 사용하여 혹시나 예외 처리가 나는것을 방지 해주었다.
        
        try{
            BigInteger bigA = new BigInteger(a);
            BigInteger bigB = new BigInteger(b);
            //BigInteger 클래스의 .add()메서드를 사용하면 값을 더할 수 있다.
            BigInteger bigsum = bigA.add(bigB); 
        answer = bigsum.toString(); //다시 문자열로 변환
        
        }catch(Exception e){
            e.printStackTrace();
        }
        return answer;
    }
}