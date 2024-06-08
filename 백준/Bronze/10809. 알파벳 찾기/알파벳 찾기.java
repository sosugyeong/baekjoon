import java.util.*;
import java.io.*;
public class Main {
	
	static long[] arr;
	
	public static void main(String[] args) throws IOException
    {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String N = br.readLine();
		int[] n = new int[26];
		
		for(int i = 0; i<n.length; i++) {
			n[i] = -1;
		}
		
		for(int i = 0; i<N.length(); i++) {
			char ch = N.charAt(i);
			
			if(n[ch-'a'] == -1) {
				n[ch-'a'] = i;
			}
		}
		
		for(int i:n) {
			System.out.print(i+" ");
		}

		br.close();
    }
}