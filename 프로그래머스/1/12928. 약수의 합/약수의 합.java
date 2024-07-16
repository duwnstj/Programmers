
class Solution {
    public int solution(int n) {
        int answer = 0;
        //n의 길이만큼 for문을 돌린다. 
        for(int i=1;i<=n;i++){
            // i를 나눴을 때 나누어 떨어진다면 약수 이기때문에 
            // 그 값을 answer에 계속 더해준다.
            if(n % i ==0){
                answer+=i;
                
                
            }
        }
        return answer;
    }
}