import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        String game;

        for (int i = 0; i < T; i++) {
            game = br.readLine();
            int len = game.length();

            // 문자열의 길이가 짝수일 때
            if (len % 2 == 0) {
                StringBuilder firstMemory = new StringBuilder();
                StringBuilder secondMemory = new StringBuilder();

                // 짝수/홀수 인덱스 문자 구분
                for (int j = 0; j < len; j++) {
                    if (j % 2 == 0) {
                        firstMemory.append(game.charAt(j));  // 첫 번째 사람이 기억할 문자
                    } else {
                        secondMemory.append(game.charAt(j));  // 두 번째 사람이 기억할 문자
                    }
                }

                // 첫 번째 사람과 두 번째 사람이 기억할 문자열 출력
                System.out.println(firstMemory.toString());
                System.out.println(secondMemory.toString());
            }
            // 문자열의 길이가 홀수일 때
            else {
                StringBuilder firstMemory = new StringBuilder();
                StringBuilder secondMemory = new StringBuilder();

                // 짝수/홀수 인덱스 문자 구분
                for (int j = 0; j < len; j++) {
                    if (j % 2 == 0) {
                        firstMemory.append(game.charAt(j));  // 첫 번째 사람이 기억할 문자
                    } else {
                        secondMemory.append(game.charAt(j));  // 두 번째 사람이 기억할 문자
                    }
                }

                // 첫 번째 사람과 두 번째 사람이 기억할 문자열 출력
                if(len == 1){
                    System.out.println(firstMemory.toString());
                    System.out.println(firstMemory.toString());
                } else {
                    System.out.println(firstMemory.toString()+secondMemory.toString());
                    System.out.println(secondMemory.toString()+firstMemory.toString());
                }
            }
        }
    }
}