import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        String[] strNums = new String[numbers.length];
        for(int i=0; i<numbers.length; i++){
            strNums[i] = String.valueOf(numbers[i]);
        }
        
        Arrays.sort(strNums, new Comparator<String>(){
            @Override
            public int compare(String a, String b){
               return (b+a).compareTo(a+b); 
            }
        });
        
        if(strNums[0].equals("0")) {
            return "0";
        }
        
        String answer = "";
        for(int i=0; i<numbers.length; i++){
            answer += strNums[i];
        }
        return answer;
    }
}