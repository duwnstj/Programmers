class Solution {
    public int solution(int[] number) {
        //number중 3명의 값들을 더해서 0이되는 경우의 수  가지 수 구하는 문제
        int answer = 0;
        for(int i=0;i<number.length;i++){
            for(int j=i+1;j<number.length;j++){
                for(int k=j+1;k<number.length;k++){
                    if(number[i]+number[j]+number[k]==0){
                        answer++;
                    }
                }
            }
        }
        
        return answer;
    }
}