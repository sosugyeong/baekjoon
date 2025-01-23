import java.io.*;
import java.util.*;

public class Main {

    static int[] visited;
    static ArrayList<Integer>[] lists;
    static int V, E;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int K = Integer.parseInt(st.nextToken());
        for (int i = 0; i < K; i++) {
            st = new StringTokenizer(br.readLine());
            V = Integer.parseInt(st.nextToken());
            E = Integer.parseInt(st.nextToken());

            visited = new int[V+1];
            lists = new ArrayList[V+1];

            for (int j = 1; j <= V; j++) {
                lists[j] = new ArrayList<Integer>();
            }

            for (int j = 0; j < E; j++) {
                st = new StringTokenizer(br.readLine());
                int p1 = Integer.parseInt(st.nextToken());
                int p2 = Integer.parseInt(st.nextToken());

                lists[p1].add(p2);
                lists[p2].add(p1);
            }

            if (isBipartite()) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

    }

    public static boolean isBipartite(){
        Queue<Integer> q = new LinkedList<Integer>();

        for (int i = 1; i <= V; i++) {
            if (visited[i] == 0){
                q.add(i);
                visited[i] = 1;

                while (!q.isEmpty()){
                    int now = q.poll();

                    for (int next : lists[now]){
                        if (visited[next] == 0) {
                            visited[next] = (visited[now] == 1) ? 2 : 1;
                            q.add(next);
                        } else if (visited[next] == visited[now]) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }
}