import java.io.*;
import java.util.*;

class Solution {
    public int solution(int[] ingredient) {
        Stack<Integer> stack = new Stack<>();
        int answer = 0;
        
        for(Integer num : ingredient){
            stack.push(num);
            
            if(stack.size() >= 4){
                int len = stack.size();
                if(stack.get(len-4)==1 && stack.get(len-3)==2 && stack.get(len-2)==3 && stack.get(len-1)==1){
                    for(int i = 0; i<4; i++){
                        stack.pop();
                    }
                    answer++;
                }
            }
        }
        
        return answer;
    }
}