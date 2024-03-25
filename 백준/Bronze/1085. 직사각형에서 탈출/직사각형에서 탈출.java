import java.util.*;
import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException
    {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();
        
        int min = 1000;
        
        if(min>w-x) {
        	min = w-x;
        }
        if(min>x-0) {
        	min = x-0;
        }
        if(min>h-y) {
        	min = h-y;
        }
        if(min>y-0) {
        	min = y-0;
        }
        
        System.out.println(min);
    }
}