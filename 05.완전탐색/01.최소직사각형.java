class Solution {
    public int solution(int[][] sizes) {
        int maxw=0,maxh=0;
        for(int i=0; i<sizes.length; i++){
            int w=sizes[i][0];
            int h=sizes[i][1];
            
            if(w<h){
                int temp=h;
                h=w;
                w=temp;
            }
            
            if(maxw<w){
                maxw=w;
            }
            if(maxh<h){
                maxh=h;
            }
        }
        
        return maxw*maxh;
    }
}