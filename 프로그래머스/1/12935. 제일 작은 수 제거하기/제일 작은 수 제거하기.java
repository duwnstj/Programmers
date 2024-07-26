class Solution {
    public int[] solution(int[] arr) {
        
        int[] answer = new int[arr.length-1];
        int min = arr[0];
        for(int i=0;i<arr.length;i++){
            min = Math.min(min,arr[i]);
        }
        if(arr.length==1){
            return new int[]{-1};
        }
        int index =0;
        for(int i=0;i<arr.length;i++){
           if(min==arr[i]){
               continue;
           }else{
               answer[index++] = arr[i];
           }
        }
        return answer;
    }
}