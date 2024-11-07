import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        
        Map<String, Integer> map = new HashMap<>();
        for(int i = 0; i<participant.length; i++){
            map.put(participant[i], map.getOrDefault(participant[i], 0)+1);
        }
        
        for(int i = 0; i<completion.length; i++){
            if(map.containsKey(completion[i])){
                if(map.get(completion[i]) >= 1){
                    map.put(completion[i], map.get(completion[i]) - 1);
                } else {
                    map.remove(completion[i]);
                }
            }
        }
        
        for(String key : map.keySet()){
            if(map.get(key) == 1){
                answer = key;
            }
        }
        
        return answer;
    }
}