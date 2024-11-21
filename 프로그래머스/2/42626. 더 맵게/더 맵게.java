import java.util.*;
import java.io.*;
import java.util.stream.Collectors;

class Solution {
    public int solution(int[] scoville, int K) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Arrays.stream(scoville).boxed().collect(Collectors.toList()));
        int answer = 0;
        int sum = 0;
        
        while(pq.size() > 1){
            if(pq.peek() >= K){
                return answer;
            }
            
            sum = pq.poll() + (pq.poll() * 2);
            pq.add(sum);
            answer++;
        }
        
        return pq.peek() >= K ? answer : -1;
    }
}