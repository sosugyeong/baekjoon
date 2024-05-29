import java.util.*;
import java.io.*;
public class Main {
	
	public static void main(String[] args) throws IOException
    {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//StringTokenizer st = new StringTokenizer(br.readLine());
		
		int T = Integer.parseInt(br.readLine());
		int K,N;
		int a = 0;
		for(int t = 0; t<T; t++) {
			K = Integer.parseInt(br.readLine());//층
			N = Integer.parseInt(br.readLine());//호
			
			int[][] arr = new int[15][15];
			
			for(int i = 0; i<15; i++) {
				arr[0][i] = i+1;
				arr[i][0] = 1;
			}

			for(int i = 1; i<=K; i++) {
				for(int j = 1; j<=N; j++) {
					arr[i][j] = arr[i-1][j]+arr[i][j-1];
				}
			}
			
			System.out.println(arr[K][N-1]);
		}

		br.close();

    }
}