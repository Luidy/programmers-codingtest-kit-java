class Solution {
    static int answer;
    public int solution(int N, int number) {
        answer = -1;
        dfs(0, 0, N, number);
        
        return answer;
    }
    
    void dfs(int stamp, int curNum, int N, int number){
        if(stamp > 8){
            return;
        }
        
        if(curNum == number){
            if(answer == -1 || answer>stamp){
                answer = stamp;
            }
            return;
        }
        
        int n = 0;
        for(int i=0; i<8; i++){
            n = n*10+N;
            dfs(stamp+i+1, curNum+n, N, number);
            dfs(stamp+i+1, curNum-n, N, number);
            dfs(stamp+i+1, curNum/n, N, number);
            dfs(stamp+i+1, curNum*n, N, number);
        }
    }
}