class Solution {
    public int solution(int[][] triangle) {
        int answer = triangle[0][0];
        
        for(int i=1; i<triangle.length; i++){
            for(int j=0; j<triangle[i].length; j++){
                if(j==0){
                    triangle[i][j] += triangle[i-1][j]; 
                    continue;
                }
                
                if(j==i){
                    triangle[i][j] += triangle[i-1][j-1]; 
                    continue;
                }
                
                triangle[i][j] += Math.max(triangle[i-1][j-1], triangle[i-1][j]);
                answer = Math.max(answer, triangle[i][j]);
            }
        }
        return answer;
    }
    
}