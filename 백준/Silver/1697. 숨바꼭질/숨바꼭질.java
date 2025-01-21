import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); // 정점 개수
        int K = Integer.parseInt(st.nextToken()); // 간선 개수

        System.out.println(bfs(N,K));
    }

    static int bfs(int start, int end) {

        boolean[] visited = new boolean[100001];
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{start, 0});
        visited[start] = true;

        while (!queue.isEmpty()){
            int[] current = queue.poll();
            int position = current[0];
            int time = current[1];

            if(position == end){
                return time;
            }

            int[] nextPosition = {position-1, position+1, position*2};

            for (int next : nextPosition){
                if(next>=0 && next <= 100000 && !visited[next]){
                    visited[next] = true;
                    queue.add(new int[]{next, time+1});
                }
            }
        }

        return 0; //찾지 못한경우
    }
}