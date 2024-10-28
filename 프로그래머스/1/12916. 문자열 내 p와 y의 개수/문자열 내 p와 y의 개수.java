import java.io.*;
class Solution {
    boolean solution(String s) throws IOException{
        boolean answer = true;

        String upStr = s.toUpperCase();
        String c[] = upStr.split("");
        
        int sum1 = 0;
        int sum2 = 0;
        for(int i = 0; i<s.length(); i++){
            if(c[i].equals("P")){
                sum1 += 1;
            } 
            else if(c[i].equals("Y")){
                sum2 += 1;
            }
        }
        
        if(sum1 == sum2){
            return answer;
        } 
        else {
            answer = false;
            return answer;
        }
    }
}