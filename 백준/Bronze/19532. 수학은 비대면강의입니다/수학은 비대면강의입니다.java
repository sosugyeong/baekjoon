import java.util.*;
import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException
    {
        Scanner sc = new Scanner(System.in);

        int a, b, c, d, e, f;
        
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();
        e = sc.nextInt();
        f = sc.nextInt();
        
        for(int i = -999; i<=999; i++) {
        	for(int j = -999; j<=999; j++) {
        		if((a*i+b*j) == c && (d*i+e*j) == f) {
        			System.out.printf("%d %d", i, j);
        		}
        	}
        }
    }
}