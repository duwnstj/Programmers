class Solution {
    public int[] solution(long n) {
        String a = Long.toString(n); // n을 문자열로 변환
        int[] answer = new int[a.length()]; // 결과를 담을 배열 생성
        
        for(int i = 0; i < a.length(); i++) {
            // a.substring을 통해서 역순으로 정렬된 숫자를 배열에 추가
            // substring(첫인덱스, 마지막 인덱스 미만)의 형식으로 첫인덱스부터 마지막 인덱스 미만                  까지의 부분 문자열을 반환. 따라서 a.substring(4, 5)는 문자열 a의 인덱스 4의                    문자 하나만 추출한다.
            // 예를 들어 a = "12345"인 경우, a.substring(4, 5)는 "5"를 반환한다.
            answer[i] = Integer.parseInt(a.substring(a.length() - 1 - i, a.length() - i)); 
        }
        return answer; 
    }
}