class Solution {
    public int solution(int n) {
        int answer = 0;
        String r="";
        
        while(n!=0){
            r += String.valueOf(n % 3);
            n = n/3;
        }
         // r = string 0021 
        
        for(int i=0;i<r.length();i++){
            char change = r.charAt(r.length()-1-i);
            int result= Character.getNumericValue(change);
            answer += result * (int)Math.pow(3,i);
            }
        
        return answer;
    }
}