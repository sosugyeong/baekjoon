import java.util.*;

class Solution {
    public int solution(int[] citations) {
        Arrays.sort(citations); // 논문 인용 횟수 정렬
        int n = citations.length;
        
        for (int i = 0; i < n; i++) {
            int h = n - i; // 남은 논문의 개수
            if (citations[i] >= h) { // 현재 논문 인용 횟수가 h 이상이면
                return h; // H-Index는 h의 최댓값
            }
        }
        
        return 0; // H-Index가 없을 경우 (모두 0 인용)
    }
}
