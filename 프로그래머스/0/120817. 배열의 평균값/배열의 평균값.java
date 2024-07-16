class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        for(int k : numbers){
            answer+=k;
            
        }
        answer = answer /numbers.length;
        return answer;
    }
}