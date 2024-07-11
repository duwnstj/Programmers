class Solution {
    public String solution(String my_string, String alp) {
        String answer = "";
        answer = my_string.replaceAll(alp,alp.toUpperCase());
        //.replaceAll()메서드는 첫번째 인자를 두번째 인자로 모두 변환시켜준다
        //.toUpperCase()메서드는 소문자를 대문자로 모두 변환시킨다.
        
        // answer에 my_string.replaceAll()메서드를 사용하여 alp 문자열을   
        // alp.toUpperCase()메서드를 통해서 대문자로 변환해준다.
        return answer;
    }
}