import java.io.*;
import java.util.*;

public class Main {

    static int N, home;
    static int homeSize;
    static boolean[][] visited;
    static int[][] map;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        map = new int[N][N];
        visited = new boolean[N][N];
        home = 0;
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String tmp = st.nextToken();
            for (int j = 0; j < N; j++) {
                map[i][j] = (int)tmp.charAt(j)-48;
            }
        }

        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                if(map[i][j] == 1 && !visited[i][j]){
                    homeSize = 0;
                    dfs(i, j);
                    home++;
                    list.add(homeSize);
                }
            }
        }

        System.out.println(home);
        Collections.sort(list);
        for (int i : list){
            System.out.println(i);
        }
    }

    static void dfs(int x, int y){
        visited[x][y] = true;
        homeSize++;

        for (int i = 0; i < 4; i++) {
            int nx = x+dx[i];
            int ny = y+dy[i];

            if(nx >= 0 && nx < map.length && ny >= 0 && ny < map.length && map[nx][ny] == 1 && !visited[nx][ny]){
                dfs(nx, ny);
            }
        }
    }
}