class Solution {
    static boolean[] check;
    public int solution(int n, int[][] computers) {
        check = new boolean[n];
        int answer=0;
        
        for(int i=0;i<n;i++){
            if(!check[i]){
                dfs(i, n, computers);
                answer++;
            }
        }
        
        return answer;
    }
    
    static void dfs(int index, int n, int[][] computers) {
        check[index]=true;
        
        
        for(int i=0; i<n; i++){
            if(!check[i] && computers[index][i]==1){
                dfs(i, n, computers);
            }
        }
    }
}