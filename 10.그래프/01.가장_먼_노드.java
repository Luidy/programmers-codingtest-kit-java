import java.util.*;

class Solution {
    boolean[] visit;
    boolean[][] relations;
    public int solution(int n, int[][] edge) {
        int answer = 0;
        visit = new boolean[n+1];
        relations = new boolean[n+1][n+1];
        
        for(int i=0; i<edge.length; i++){
            int x=edge[i][0];
            int y=edge[i][1];
            relations[x][y]=true;
            relations[y][x]=true;
        }
        
        Queue<Integer> q = new LinkedList<Integer>();
        visit[1]=true;
        q.add(1);
        
        while(!q.isEmpty()){
            answer = q.size();
            
            for(int i=0; i<answer; i++) {
                int cur=q.poll();
                
                for(int j=1; j<n+1; j++){
                    if(!visit[j] && relations[cur][j]){
                        visit[j]=true;
                        q.add(j);
                    }
                }
            }
        }
        
        return answer;
    }
}