import java.util.*;
import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException
    {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String num = sc.next();
        int sum = 0;
        
        for(int i = 0; i<N; i++) {
        	sum += num.charAt(i)-'0';
        }
        
        System.out.println(sum);
    }
}