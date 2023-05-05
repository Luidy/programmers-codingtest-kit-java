import java.util.*;

class Solution {
    public int solution(int m, int n, int[][] puddles) {
        int mod = 1000000007;
        int[][] arr = new int[m+1][n+1];
        
        for(int i=0; i<puddles.length; i++) {
            arr[puddles[i][0]][puddles[i][1]] = -1;
        }
        
        arr[1][1] = 1;
        for(int i=1; i<m+1; i++) {
            for(int j=1; j<n+1; j++) {       
                if(arr[i][j] < 0) continue;
                if(arr[i-1][j] > 0) arr[i][j] += arr[i-1][j] % mod;
                if(arr[i][j-1] > 0) arr[i][j] += arr[i][j-1] % mod;
            }
        }
        
        return arr[m][n] % mod;
    }
}