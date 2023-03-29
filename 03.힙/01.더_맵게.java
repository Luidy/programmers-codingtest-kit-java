import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        PriorityQueue<Integer> s = new PriorityQueue<Integer>();
        
        for(int i=0; i<scoville.length; i++){
            s.add(scoville[i]);
        }
        
        int count=0;
        while(s.peek()<K){
            if(s.size()==1){
                return -1;
            }
            
            int a=s.poll();
            int b=s.poll();
            s.add(a+b*2);
            count++;
        }
        
        return count;
    }
}
