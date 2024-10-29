import java.io.*;

class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        long pp = Long.parseLong(p);
        int plength = p.length();
        
        for(int i = 0; i<=t.length()-plength; i++){
            String num = t.substring(i, i+plength);
            long temp = Long.parseLong(num);
            if(temp <= pp){
                answer += 1;
            }
        }
        return answer;
    }
}