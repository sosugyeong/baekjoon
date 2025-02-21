import java.io.*;
import java.util.*;

public class Main {
    static HashMap<Long, Long> hash = new HashMap<>();
    static int P, Q;

    public static long solve(long n) {
        if (n == 0) return 1;
        if (hash.containsKey(n)) return hash.get(n);

        long value = 0;
        if (P != 0) value += solve(n / P);
        if (Q != 0) value += solve(n / Q);

        hash.put(n, value);
        return value;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long N = Long.parseLong(st.nextToken());
        P = Integer.parseInt(st.nextToken());
        Q = Integer.parseInt(st.nextToken());

        if (P == 0 || Q == 0) {
            System.out.println(1);
            return;
        }

        System.out.println(solve(N));
    }
}