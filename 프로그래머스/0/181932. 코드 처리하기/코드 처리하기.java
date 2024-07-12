class Solution {
    public String solution(String code) {
        //StringBuilder를 사용하여 가변문자열을 만든다.
        // String 변수로 ret을 만들어 +=으로 문제를 풀었더니
        // 성능 면에서 실패가 떳다 그래서 StringBuilder를 사용하여
        // 가변 문자열을 이용했다.
        StringBuilder ret = new StringBuilder();
        int mode=0;
        for(int idx=0;idx<code.length();idx++){
            char c = code.charAt(idx);
            
            if(mode ==0){
                if(c != '1'){
                    if(idx % 2==0){
                        //.append()메서드를 사용하여 가변문자열에 값을 추가한다.
                        ret.append(c);
                    }
                }else{
                        mode=1;
                    }
            }else if(mode ==1){
                if(c != '1'){
                    if(idx % 2 == 1){
                        ret.append(c);
                    }
                }else{
                    mode=0;
                }
            }
        }
        //삼항 조건 연산자를 사용하여 ret이 빈 문자열이라면 "EMPTY"가 나오고 
        //빈 문자열이 아니라면 ret을 다시 문자열로 바꿔준다.
        // 삼항 조건 연산자는 조건식 ? true : false 값을 반환한다.
        return ret.length()==0 ? "EMPTY" : ret.toString();
    }
}