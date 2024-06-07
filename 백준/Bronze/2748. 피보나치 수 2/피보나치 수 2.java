import java.util.*;
import java.io.*;
public class Main {
	
	static long[] arr;
	
	public static void main(String[] args) throws IOException
    {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		arr = new long[N+2];
		arr[0] = 0;
		arr[1] = 1;
		
		System.out.println(pivonachi(N));

		br.close();
    }
	
	public static long pivonachi(int n) {	
		if(n == 0) {
			return arr[0];
		} else if(n == 1) {
			return arr[1];
		} else if(arr[n] != 0){
			return arr[n];
		} else {
			return arr[n] = pivonachi(n-1)+pivonachi(n-2);
		}
	}
}
