import java.util.*;
import java.io.*;
public class Main {
	
	static long[] arr;
	
	public static void main(String[] args) throws IOException
    {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int M = Integer.parseInt(br.readLine());
		
		int one = N*(M%10);
		int two = N*((M%100)/10);
		int three = N*(M/100);
		
		System.out.println(one);
		System.out.println(two);
		System.out.println(three);
		
		System.out.println(one+(two*10)+(three*100));

		br.close();
    }
}