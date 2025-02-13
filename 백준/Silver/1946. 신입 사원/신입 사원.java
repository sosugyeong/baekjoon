import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        while(T-- > 0){
            int N = Integer.parseInt(br.readLine());
            int[][] score = new int[N][2];

            for (int i = 0; i < N; i++) {
                st = new StringTokenizer(br.readLine());
                score[i][0] = Integer.parseInt(st.nextToken());
                score[i][1] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(score, Comparator.comparingInt(a->a[0]));

            int count = 0;
            int minRank = Integer.MAX_VALUE;

            for (int[] scores : score){
                int interviewRank = scores[1];

                if (interviewRank < minRank){
                    count++;
                    minRank = interviewRank;
                }
            }
            sb.append(count).append("\n");
        }

        System.out.println(sb);
    }
}