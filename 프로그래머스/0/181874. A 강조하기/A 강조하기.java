class Solution {
    public String solution(String myString) {
        StringBuilder answer = new StringBuilder() ;
        //StringBuilder클래스를 이용해 문자열 조작을 위해서 가변 문자열을 만든다.
        String result = myString.replaceAll("a","A");
        //replaceAll()메서드를 통해서 a를 A로 변환한 값을 result 변수에 담는다.
        for(int i=0; i<result.length(); i++){
            char c = result.charAt(i);
            //result.charAt(i)를 통해 반복문을 통해 나오는 단일 문자를
            // ch 단일문자 변수에 담기
            if(c == 'A'){
                answer.append('A');
                 //append()메서드를 통해 뒤에서부터 가변 문자열에 담기
            }else{
                answer.append(Character.toLowerCase(c));
                 //단일문자는 바로 .toLowerCase()를 사용할 수없기때문에
                //Character.toLowerCase(ch)로 사용
            }
        }
        return answer.toString();
        //StringBuilder의 내용을 문자열로 변환하여 반환
    }
}