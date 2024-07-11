class Solution {
    public int solution(String my_string, String is_suffix) {
        int answer = 0;
        if(my_string.endsWith(is_suffix)){
            //endsWith()메서드는 String클래스 내장메서드로 해당하는 문자열이 접미사일 경우
            //true를 반환하고 아닐경우에는 false를 반환한다.
            answer = 1 ;
        }else{
            answer = 0;
        }
        return answer;
    }
}