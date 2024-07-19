import java.util.*;
class Solution {
    public long solution(long n) {
        long answer = 0;
        String[] array= String.valueOf(n).split("");
        
        Arrays.sort(array);
        
        String str = "";
        for(int i=array.length-1;i>=0;i--){
            str+= array[i];
        }
        answer = Long.parseLong(str);
        return answer;
    }
}