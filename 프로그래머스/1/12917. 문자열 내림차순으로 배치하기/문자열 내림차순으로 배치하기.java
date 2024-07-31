import java.util.*;
class Solution {
    
    public String solution(String s) {
        char[] charArray = s.toCharArray();
        
        List<Character> charList = new ArrayList<>();
        for(char b : charArray){
            charList.add(b);
        }
        Collections.sort(charList);
        
        Collections.reverse(charList);
        
        StringBuilder answer = new StringBuilder();
        for(char a : charList){
            answer.append(a);
        }
        
        
        
        return answer.toString();
    }
}