class Solution {
    public String solution(String[] my_strings, int[][] parts) {
        String answer = "";
        for(int i=0;i<my_strings.length;i++){
            String str = my_strings[i];
           answer += str.substring(parts[i][0],parts[i][1]+1);
            //문자열로 조합하기 위해 str 변수에 my_strings의 요소를 담는다
            // .substring()메서드는 첫번째 인덱스부터 마지막 인덱스 번호 미만까지를 가져온다
            // 따라서 +1을해주어 마지막 인덱스 번호까지 가져와 answer 문자열에 더해준다.
            //이렇게 2차원 배열을 사용해주면 처음부터 마지막 인덱스번호까지 구하는 식이 간단해진다.
        }
        return answer;
    }
}