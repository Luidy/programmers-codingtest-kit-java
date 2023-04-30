import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        Queue<Integer> q = new LinkedList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i=0; i<priorities.length; i++){
            pq.add(priorities[i]);
            q.add(i);
            map.put(i, priorities[i]);
        }
        
        int cur = -1;
        int order = 0;
        while(cur != location){
            int highPriority = pq.peek();
            int curQNum = q.peek();
            
            if(map.get(curQNum) == highPriority) {
                cur = curQNum;
                pq.remove();
                q.remove();
                order++;
                continue;
            }
            
            q.remove();
            q.add(curQNum);
        }
        
        return order;
    }
}