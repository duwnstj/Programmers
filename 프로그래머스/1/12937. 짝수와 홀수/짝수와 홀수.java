class Solution {
    public String solution(int num) {
        String answer = "";
        //짝수일 때 
        if(num % 2==0){
            answer="Even";
        // 홀수 일때
        }else{
            
            answer="Odd";
        }
        return answer;
    }
}