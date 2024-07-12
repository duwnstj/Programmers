class Solution {
    public String solution(int[] numLog) {
        String answer = "";
        
        //인덱스 처음 시작은 0이기때문에 i를 1로 정해준다.
        //첫번쨰 값은 비교할 이전 값이 없기 때문에 두번째 값부터 비교 시작
        for(int i=1;i<numLog.length;i++){
            //이문제는 control을 구하는 문제이다
            // 현재값에서 이전 인덱스 값을 뺀 결과가 특정 값이면
            // 그 값에 해당하는 문자를 answer에 추가한다.
        
            if(numLog[i]-numLog[i-1]==1) answer+="w";
            else if(numLog[i]-numLog[i-1]==-1) answer+="s";
            else if(numLog[i]-numLog[i-1]==10) answer+="d";
            else if(numLog[i]-numLog[i-1]==-10) answer+="a";
        }
        return answer;
    }
}