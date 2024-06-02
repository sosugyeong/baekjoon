import java.util.*;
import java.io.*;
public class Main {
	
	public static void main(String[] args) throws IOException
    {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int[] A = new int[N];
		int[] B = new int[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {
			A[i] = Integer.parseInt(st.nextToken());
		}
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {
			B[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(A);
		Arrays.sort(B);
		
		for(int i = 0; i<A.length/2; i++) {
			int temp = A[i];
			A[i] = A[A.length-1-i];
			A[A.length-1-i] = temp;
		}		
		
		int ex = 0;
		for(int i = 0; i<N; i++) {
			ex += (A[i]*B[i]);
		}
		
		System.out.println(ex);

		br.close();
    }
}