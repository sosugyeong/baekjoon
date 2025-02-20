import java.io.*;

public class Main {
    static final int MOD = 1_000_000_000;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int K = Integer.parseInt(input[1]);

        int[][] dp = new int[N+1][K+1];

        for (int i = 0; i <= N ; i++) {
            dp[i][1] = 1;
        }

        for (int k = 2; k <= K; k++) {
            for (int n = 0; n <= N ; n++) {
                for (int x = 0; x <= n; x++){
                    dp[n][k] = (dp[n][k] + dp[n-x][k-1]) % MOD;
                }
            }

        }

        System.out.println(dp[N][K]);
    }
}