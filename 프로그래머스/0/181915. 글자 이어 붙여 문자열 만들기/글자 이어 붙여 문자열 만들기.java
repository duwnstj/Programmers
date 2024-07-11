class Solution {
    public String solution(String my_string, int[] index_list) {
        String answer = "";
        for(int i=0;i<index_list.length;i++){
            
            answer += my_string.charAt(index_list[i]);
            //.charAt()메서드를 사용해서 my_string문자열의 index_list[i]에 해당하는 
            //인덱스 값을 단일문자로 가져와 answer 변수에 문자로 더해 문자열을 만들어준다.
            //문자열 + 단일문자는 문자열로 값이 변한다
        }
        return answer;
    }
}