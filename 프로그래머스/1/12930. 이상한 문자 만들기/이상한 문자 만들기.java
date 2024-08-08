class Solution {
    public String solution(String s) {
        // 각 단어는 하나 이상의 공백 문자로 구분 되어짐
        // 각 단어의 짝수번째 알파벳->대문자 , 각 단어의 홀수번째 알파벳 -> 소문자
        // 문자열 전체의 짝/ 홀수 인덱스가 아니라 단어(공백을 기준)별로 짝/홀수 인덱스를 판단
        // 첫번째 글자는 짝수번째 알파벳으로 처리
        String answer = "";
        String[] result = s.split("");
        
        int idx =0;
        for(int i=0;i<result.length;i++){
                
            if(result[i].equals(" ")){
                idx = 0;
            }else if(idx % 2 ==0){
                result[i] = result[i].toUpperCase();
                idx++;
            }else if(idx % 2 != 0){
                result[i] = result[i].toLowerCase();
                idx++;
            }
            answer += result[i] ; 
        }
        return answer;
    }
}