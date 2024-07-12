class Solution {
    public int solution(int a, int b, int c) {
        int answer = 0;
        
        //세 주사위 숫자가 다른 경우
        if(a!=b && b !=c&& a!=c){
            answer = a+b+c;
        // 세 숫자 중 어느 두 숫자는 같고 나머지 다른 숫자는 다른 경우
        }else if((a==b&&b!=c) || (b==c&&c!=a)||(a==c&&a!=b)){
            answer = (a+b+c)*((a*a)+(b*b)+(c*c));
            //세 숫자가 모두 같은 경우
        }else{
            answer =(a+b+c)*((a*a)+(b*b)+(c*c))*((a*a*a)+(b*b*b)+(c*c*c));
        }
        return answer;
    }
}