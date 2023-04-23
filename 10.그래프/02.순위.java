class Solution {
    public int solution(int n, int[][] results) {
        int answer = 0;
        int[][] fightResults = new int[n][n];
        
        for(int i=0; i<results.length; i++){
            int x = results[i][0]-1;
            int y = results[i][1]-1;
            fightResults[x][y] = 1;
            fightResults[y][x] = -1;
        }
        
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++){
                for(int k=0; k<n; k++){
                    if(fightResults[i][k] == 1 && fightResults[k][j] == 1){
                        fightResults[i][j] = 1;
                        fightResults[j][i] = -1;
                    }
                    
                    if(fightResults[i][k] == -1 && fightResults[k][j] == -1){
                        fightResults[i][j] = -1;
                        fightResults[j][i] = 1;
                    }
                }
            }
        }
        
        for(int i=0; i<n; i++){
            int cnt=0;
            for(int j=0; j<n; j++){
                if(fightResults[i][j] != 0) cnt++;
            }
            
            if(cnt == n-1){
                answer++;
            }
        }
        return answer;
    }
}