import java.util.*;
import java.io.*;
public class Main {
	
	public static void main(String[] args) throws IOException
    {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int five = 300;
		int one = 60;
		int ten = 10;
		int i = 0,j = 0,k = 0;
		
		if(N>=five) {
			i = N/five;
			N = N % five;
		}
		if(N>=one) {
			j = N/one;
			N = N % one;
		}
		if(N>=ten) {
			k = N/ten;
			N = N % ten;
		}
		
		if (N != 0) {
            System.out.println("-1");
        } else {
        	System.out.printf("%d %d %d\n", i, j, k);
        }
		
        br.close();
    }
}