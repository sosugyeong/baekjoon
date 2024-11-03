import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        HashMap<String, String> map = new HashMap<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());  // 노래 개수
        int M = Integer.parseInt(st.nextToken());  // 맞히기 시도 횟수

        // 노래 정보 저장
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int T = Integer.parseInt(st.nextToken());  // 제목 길이
            String title = st.nextToken();  // 노래 제목

            // 음 입력을 받아 첫 세 음을 추출
            String firstThreeNotes = st.nextToken() + st.nextToken() + st.nextToken();

            // key = 첫세음, value = 제목
            if (map.containsKey(firstThreeNotes)) {
                map.put(firstThreeNotes, "?");  // 중복인 경우 "?"로 설정
            } else {
                map.put(firstThreeNotes, title);
            }
        }
        
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            String b = st.nextToken() + st.nextToken() + st.nextToken();

            // map에서 해당 첫 세 음을 찾아 결과 출력
            if (map.containsKey(b)) {
                System.out.println(map.get(b));  // 노래 제목 또는 ?
            } else {
                System.out.println("!");  // 해당 음이 없는 경우 !
            }
        }
    }
}