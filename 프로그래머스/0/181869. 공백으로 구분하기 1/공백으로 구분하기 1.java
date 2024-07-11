class Solution {
    public String[] solution(String my_string) {
        
        return my_string.trim().split("\\s+");

            //.trim()메서드를 통해서 앞뒤 공백을 제거하고, .split("\\s+")를 사용하여 
        스페이스바,탭,엔터키등 공백처리가 되는 모든 것들을 기준으로 나눠서 배열로 나오게 만든다.
        
    }
}
