import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        ArrayList<Integer> answer = new ArrayList<Integer>();
        
        for(int i=0; i<commands.length; i++){
            int[] temp = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
            Arrays.sort(temp);
            answer.add(temp[commands[i][2]-1]);
        }
        
        return answer.stream().mapToInt(i -> i).toArray();
    }
}