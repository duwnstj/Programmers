class Solution {
    public int solution(int num) {
        
        int count =0;
        //마지막 경우에 overflow 떠서 long 형으로 변환 
        long a = num;
        if(a ==1){
            return 0;
        }
        
        
        while(a != 1){
            if(a %2 ==0){
                a/=2;
            }else{
               a=a*3+1;
            }
            count++;
            
            if(count>=500){
                return -1;
            }
            
            
        }
        return count;
    }
}