import java.util.*;
import java.io.*;
public class Main {
	
	public static void main(String[] args) throws IOException
    {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		
		int result = A%B;
		for(int i=0; i<N-1; i++) {
			result *= 10;
			result %= B;
		}
		
		result *= 10;
		System.out.println(result/B);
		
		
        br.close();
    }
}