import java.io.*;
import java.util.*;

public class Main {

    static long[] dp;

    public static long wave(int n){
        if(n<4){
            dp[n] = 1;
        }
        if(dp[n] != -1) {
            return dp[n];
        }
        dp[n] = wave(n-2) + wave(n-3);
        return dp[n];
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int N = 0;

        for(int i = 0; i < T; i++){
            N = Integer.parseInt(br.readLine());
            dp = new long[N+1];
            Arrays.fill(dp, -1);
            System.out.println(wave(N));
        }
    }
}