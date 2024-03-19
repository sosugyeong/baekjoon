import java.util.*;
import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException
    {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];
        int M = sc.nextInt();
        int i, j, k;

        for(int l = 0; l<M; l++){
            i = sc.nextInt();
            j = sc.nextInt();
            k = sc.nextInt();
            
            for(int m = i-1; m<=j-1; m++) {
            	arr[m] = k;
            }
        }
        for(int m = 0; m<arr.length; m++) {
        	System.out.print(arr[m] + " ");
        }
    }
}