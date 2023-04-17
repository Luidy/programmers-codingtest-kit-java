import java.util.*;

class Solution {
    static int answer;
    public int solution(int[] numbers, int target) {
        answer = 0;
        
        dfs(0, 0, numbers, target);
        return answer;
    }
    
    void dfs(int index, int curNum, int[] numbers, int target){
        if(index == numbers.length){
            if(curNum==target){
                answer++;
            }
            return;
        }
        
        dfs(index+1, curNum+numbers[index], numbers, target);
        dfs(index+1, curNum-numbers[index], numbers, target);
    }
}