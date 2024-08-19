class Solution {
    public int solution(String s) {
        int answer = 0;
        // 조건 1 : s가 0으로 시작하는 경우는 없다.
        String[] words = {"zero","one","two","three","four","five","six","seven",
                          "eight","nine"};
        for(int i=0;i<words.length;i++){
            if(s.contains(words[i])){
                s = s.replace(words[i],Integer.toString(i));
            }
            
        }
       answer = Integer.parseInt(s);
        return answer;
    }
}