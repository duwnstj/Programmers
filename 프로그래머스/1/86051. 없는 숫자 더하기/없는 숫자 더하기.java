import java.util.*;
class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        Set<Integer> intSet = new HashSet<>();
        for(int allNumber :numbers){
            intSet.add(allNumber);
        }
        for(int i=0;i<=9;i++){
            if(intSet.contains(i)==false){
                answer+=i;
            }
        }
        return answer;
    }
}