import java.util.*;
import java.io.*;
public class Main {
	
	public static void main(String[] args) throws IOException
    {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int[] arr = new int[N];
		
		for(int i=0; i<N; i++) {
			arr[i] = i+1;
		}
		
		for(int h=0; h<M; h++) {
			st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			n--;
			m--;
			for(int i=n; i<=m; i++) {
				for(int j=i+1; j<=m; j++) {
					int tem = arr[i];
					arr[i] = arr[j];
					arr[j] = tem;
				}
			}
		}

		for(int i=0; i<N; i++) {
			System.out.print(arr[i]+" ");
		}

        br.close();
    }
}