class Solution {
    public long solution(long n) {
         long answer = 0;
        //Math.sqrt(n)을하면 n의 제곱근을 구해준다
        //예를 들어 121의 제곱근은 11이다.
        long sqrt = (long)Math.sqrt(n);
        
        if(sqrt*sqrt==n){
            answer=(sqrt+1)*(sqrt+1);
        }else{
            answer= -1;
        }
        
       
        return answer;
    }
}