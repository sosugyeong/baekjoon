import java.util.*;
import java.io.*;
public class Main {
	
	public static void main(String[] args) throws IOException
    {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		int gcd = gcd(N, M);
        System.out.println(gcd);

        // 최소 공배수 구하기
        int lcm = lcm(N, M, gcd);
        System.out.println(lcm);
        
        br.close();
    }
	
	// 최대 공약수 구하는 함수
    public static int gcd(int a, int b) {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }

    // 최소 공배수 구하는 함수
    public static int lcm(int a, int b, int gcd) {
        return (a * b) / gcd;
    }
}