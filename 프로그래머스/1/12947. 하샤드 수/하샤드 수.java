class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        String str = String.valueOf(x);
        int a = 0;
        for(int i=0;i<str.length();i++){
       a += str.charAt(i)-'0';
        }
        if(x % a ==0){
            answer=true;
        }else{
            answer=false;
        }
        
        
        return answer;
    }
}