class Solution {
    public int solution(int[][] sizes) {
        int maxwidth =0 ;
        int maxheight = 0 ;
        
        for(int i=0;i<sizes.length; i++){
            int width = sizes[i][0];
            int height = sizes[i][1];
            
            if(width < height){ // 세로가 가로보다 클 경우 
                int temp = width;
                width = height;
                height = temp;
            }
            if(width>maxwidth){ // 가로의 제일 큰값 구하기
                maxwidth = width;
            }
            if(height > maxheight){ //세로의 제일 큰 값 구하기
                maxheight = height;
            }
            
        }
        return maxwidth * maxheight;
    }
}