import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> p = new HashMap<String, Integer>();
        
        for(int i=0; i<participant.length; i++){
            if(p.get(participant[i]) != null) {
                p.put(participant[i], p.get(participant[i])+1);    
                continue;
            }
            p.put(participant[i], 1);    
        }
        
        for(int i=0; i<completion.length; i++){
            if(p.get(completion[i]) == 1) {
                p.remove(completion[i]);    
                continue;
            }
            p.put(completion[i], p.get(completion[i])-1);    
        }
        
        return (String)p.keySet().toArray()[0];
    }
}