import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        HashMap<String,Boolean> map = new HashMap<String,Boolean>();
        
        for(int i=0;i<phone_book.length;i++){
            map.put(phone_book[i], true);
        }
        
        for(Map.Entry<String,Boolean> m:map.entrySet()){
            for(int i=1;i<m.getKey().length();i++){
                if(map.containsKey(m.getKey().substring(0,i))) {
                    return false;
                }
            }
        }
        return true;
    }
}
