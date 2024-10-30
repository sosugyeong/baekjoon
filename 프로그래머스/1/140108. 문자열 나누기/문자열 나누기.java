class Solution {
    public int solution(String s) {
        int answer = 0;
        char c = s.charAt(0);
        int one = 0, two = 0;
        
        for(int i = 0; i<s.length(); i++){
            if(c == s.charAt(i)){
                one += 1;
            } else {
                two += 1;
            }
            
            if(one == two){
                answer += 1;
                c = s.charAt((i+1)%s.length());
            }
        }
        if(one != two){
            return answer +1;
        }
        
        return answer;
    }
}