import java.util.*;

class Solution {
    public int solution(int[] nums) {
        Map<Integer, Boolean> map = new HashMap<Integer, Boolean>();
        
        for(int i=0;i<nums.length;i++) {
            map.put(nums[i], true);
        }
        
        if(map.size() < nums.length/2) {
            return map.size();
        }
        return nums.length/2;
    }
}
