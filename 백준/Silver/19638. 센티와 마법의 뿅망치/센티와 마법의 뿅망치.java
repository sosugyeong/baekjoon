import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); // 거인의 수
        int Hcenti = Integer.parseInt(st.nextToken()); // 센티의 키
        int T = Integer.parseInt(st.nextToken()); // 마법의 뿅망치 사용 횟수 제한

        // 우선순위 큐 (최대 힙)
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        // 거인의 키 입력
        for (int i = 0; i < N; i++) {
            pq.offer(Integer.parseInt(br.readLine()));
        }

        int hammerUsed = 0;

        // 마법의 뿅망치 사용
        while (!pq.isEmpty() && hammerUsed < T) {
            int tallest = pq.poll(); // 현재 가장 큰 키

            if (tallest < Hcenti) {
                // 가장 키가 큰 거인이 이미 센티보다 작으면 종료
                System.out.println("YES");
                System.out.println(hammerUsed);
                return;
            }

            // 키가 1이면 더 이상 줄일 수 없음
            if (tallest == 1) {
                pq.offer(tallest);
                break;
            }

            // 뿅망치 사용
            pq.offer(tallest / 2);
            hammerUsed++;
        }

        // 마법의 뿅망치를 다 사용한 후 결과 확인
        int maxHeight = pq.isEmpty() ? 0 : pq.peek();
        if (maxHeight < Hcenti) {
            System.out.println("YES");
            System.out.println(hammerUsed);
        } else {
            System.out.println("NO");
            System.out.println(maxHeight);
        }
    }
}
