class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        // 각 쿼리를 순회하며 arr[i]와 arr[j]의 값을 교환한다.
        for (int[] query : queries) {
            int i = query[0];
            int j = query[1];
            
            // arr[i]와 arr[j]의 값을 교환한다.
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        
        // 수정된 arr 배열을 반환한다.
        return arr;
    }
}
