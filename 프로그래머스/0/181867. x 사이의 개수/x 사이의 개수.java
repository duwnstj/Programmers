class Solution {
    public int[] solution(String myString) {
        //.split("x", -1)메서드를 사용하여 문자열을 "x"를 기준으로 
        //분할한다.
        // 이때, -1을 인자로 주어 문자열 끝에 위치한 "x"로 인해 생기는
        // 빈 문자열도 포함시킨다.
        String[] result = myString.split("x" , -1);
        
        // answer배열의 길이를 result배열의 길이로 생성해준다.
        int[] answer = new int[result.length];
        
        //answer배열의 각 인덱스에 result배열의 각요소들의 
        //문자열의 길이를 저장한다.
        for(int i=0;i<result.length;i++){
            answer[i] = result[i].length();
            
        }
        return answer;
    }
}