import java.util.*;
import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException
    {
        Scanner sc = new Scanner(System.in);

        int H = sc.nextInt();
        int M = sc.nextInt();
        
        if(M<45) {
        	M = 60 - (45 - M);
        	if(H == 0) {
        		H = 23;
        	}else {H = H - 1;}
        }
        else {
        	M = M - 45;
        }
        
        System.out.printf("%d %d", H, M);
    }
}