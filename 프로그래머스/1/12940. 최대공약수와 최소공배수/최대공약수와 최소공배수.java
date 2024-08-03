class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int [2];
        int result = n*m; 
         
        int r=0;
        while(m != 0){
           r =n %m ;
            n =m;
            m =r;
        }
        answer[0] =n;
        answer[1] = result/answer[0];
        
       
        
        return answer;
    }
}