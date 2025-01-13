import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            HashSet<Integer> set = new HashSet<>();
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0; j < N; j++){
                set.add(Integer.parseInt(st.nextToken()));
            }

            int M = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            StringJoiner sj = new StringJoiner("\n");
            for(int j = 0; j < M; j++){
                int num = Integer.parseInt(st.nextToken());
                if(set.contains(num)){
                    sj.add("1");
                } else {
                    sj.add("0");
                }
            }
            System.out.println(sj.toString());
        }
    }
}