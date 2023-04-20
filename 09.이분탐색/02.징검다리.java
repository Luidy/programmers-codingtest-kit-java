import java.util.*;

class Solution {
    public int solution(int distance, int[] rocks, int n) {
        Arrays.sort(rocks);
        
        int answer = 0;
        int left = 0;
        int right = distance;
        while(left<=right){
            int delCnt = 0;
            int mid = (left+right)/2;
            int before = 0;
            
            for(int i=0; i<rocks.length; i++){
                if(rocks[i]-before < mid){
                    delCnt++;
                    continue;
                }
                before=rocks[i];
            }
            if(distance-before < mid){
                delCnt++;
            }
            
            if(delCnt <= n) {
                answer = mid;
                left = mid+1;
            } else {
                right = mid-1;
            }
        }
        
        return answer;
    }
}