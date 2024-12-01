import java.util.*;

class Solution {
    public String solution(String X, String Y) {
        // 각 숫자(0~9)의 개수를 저장할 배열
        int[] countX = new int[10];
        int[] countY = new int[10];
        
        // X의 각 숫자 개수 세기
        for (char ch : X.toCharArray()) {
            countX[ch - '0']++;
        }
        
        // Y의 각 숫자 개수 세기
        for (char ch : Y.toCharArray()) {
            countY[ch - '0']++;
        }
        
        // 결과를 저장
        StringBuilder result = new StringBuilder();
        
        // 9부터 0까지 반복하며 공통 숫자를 추가 (내림차순)
        for (int i = 9; i >= 0; i--) {
            int commonCount = Math.min(countX[i], countY[i]);
            for (int j = 0; j < commonCount; j++) {
                result.append(i);
            }
        }
        
        if (result.length() == 0) {
            return "-1";
        }

        if (result.charAt(0) == '0') {
            return "0";
        }
        
        return result.toString();
    }
}
