import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> q = new LinkedList<Integer>();
        for(int i=0;i<progresses.length;i++){
            q.add((100-progresses[i])/speeds[i]+((100-progresses[i])%speeds[i]==0?0:1));
        }
        
        ArrayList<Integer> countList = new ArrayList<Integer>();
        int currentSpeed = q.poll();
        int releaseCount = 1;
        for(Integer item:q) {
            if(item<=currentSpeed){
                releaseCount++;
            } else {
                countList.add(releaseCount);
                releaseCount = 1;
                currentSpeed = item;
            }
        }
        countList.add(releaseCount);
        return countList.stream().mapToInt(i->i).toArray();
    }
}