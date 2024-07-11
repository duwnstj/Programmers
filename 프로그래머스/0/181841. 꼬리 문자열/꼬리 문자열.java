class Solution {
    public String solution(String[] str_list, String ex) {
        String answer = "";
        for(int i=0;i< str_list.length;i++){
            if(str_list[i].contains(ex)){
                //.contains()메서드를 사용하여 result 변수에 ex를 포함하고 있는 문자열을
                // 제외시킨다.
                String result = str_list[i];
            }else{
                //문자열을 제외하고 남은 배열 요소들을 answer 변수에 문자열로 더해준다.
                answer+=str_list[i];
            }
        }
        return answer;
    }
}