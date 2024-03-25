import java.util.*;
import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException
    {
        Scanner sc = new Scanner(System.in);

        int[][] N = new int[2][2];
        int a = 0,b = 0; 
        
        for(int i = 0; i<2; i++) {
        	for(int j = 0; j<2; j++) {
        		N[i][j] = sc.nextInt();
        	}
        }
        for(int i = 0; i<2; i++) {
        	for(int j = 0; j<2; j++) {
        		if(i == j) {
        			a += N[i][j];
        		}
        		else {
        			b += N[i][j];
        		}
        		
        	}
        }
        if(a>b) {
        	System.out.println(b);
        }
        else {
        	System.out.println(a);
        }
    }
}