class Solution {
    public String[] solution(String my_string) {
        
        return my_string.trim().split("\\s+");
        //.trim()메서드는 앞,뒤 공백을 제거해주고 .split(\\+s)이렇게 split()메서드를 사용하면 
        //스페이스, 탭, 줄바꿈 등 모든 공백 문자를 포함하므로 이렇게 작성해준다. 
    }
}