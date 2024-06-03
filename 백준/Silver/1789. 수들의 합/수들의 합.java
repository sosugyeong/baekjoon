import java.util.*;
import java.io.*;
public class Main {
	
	public static void main(String[] args) throws IOException
    {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		long N = Long.parseLong(br.readLine());
		
		long i = 0;
		long sum = 0;
		for(i = 0; i<=N; i++) {
			sum += i;
			if(sum >= N) {
				if(sum == N) {
					System.out.println(i);
					break;
				}
				System.out.println(i-1);
				break;
			}
		}

		br.close();
    }
}