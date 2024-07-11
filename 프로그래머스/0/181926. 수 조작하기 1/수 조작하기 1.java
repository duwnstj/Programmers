class Solution {
    public int solution(int n, String control) {
        
        
        for(int i=0;i<control.length();i++){
            char c = control.charAt(i);
            if(c == 'w'){
                n+=1;
            }else if(c == 's'){
                n-=1;
            }else if(c == 'd'){
                n+=10;
            }else if(c == 'a'){
                n-=10;
            }
//단일 문자는 .equals()메서드를 사용할 수 없고 ==을 사용하여 c와 control의 요소를 비교한다.
//charAt()메서드를 통해 control문자열의 각 인덱스 값을 가져온다.
        }
        return n;
    }
}