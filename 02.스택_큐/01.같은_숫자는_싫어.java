import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        ArrayList<Integer> answer = new ArrayList<Integer>();
        int cur = -1;
        
        for(int i=0;i<arr.length;i++){
            if(arr[i] != cur) {
                answer.add(arr[i]);
                cur = arr[i];
            }
        }
        
        return answer.stream().mapToInt(i->i).toArray();
    }
}
