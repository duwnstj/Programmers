class Solution {
    public String solution(String[] arr) {
        String answer = "";
        for(String result : arr){
            
            answer+=result;
        }
        //향상된for문을 사용하여 arr 배열에 있는 요소들을 result 변수에 담고
        //answer에 문자열로 하나씩 더해주면 된다.
        return answer;
    }
}