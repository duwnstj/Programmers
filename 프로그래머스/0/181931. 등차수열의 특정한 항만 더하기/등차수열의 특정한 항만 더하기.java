class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        int n = included.length;
        
        //등차 수열을 저장할 배열 생성
        int[] numbers= new int[n];
        
        //등차수열 생성
        for(int i =0 ;i<n;i++){
            //[0]에는 a의 값이 들어가고 for문을 통해 d의 값을 i와 곱하면
            //각 인덱스에 알맞은 값이 들어가는 등차 수열을 만들 수 있다.
            numbers[i]=a+i*d;
        }
        
        //included 배열의 결과에 따라 answer 계산
        for(int i=0;i<n;i++){
            if(included[i]){
                //결과값이 true이면 각 인덱스에 해당하는 등차수열 값을
                //answer변수에 +=을 사용하여 계속 더해준다.
                answer+=numbers[i];
            }
        }
        return answer;
    }
}