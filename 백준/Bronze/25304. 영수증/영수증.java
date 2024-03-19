import java.util.*;
import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException
    {
        Scanner sc = new Scanner(System.in);

        long X = sc.nextLong();
        int N = sc.nextInt();
        int sum = 0;

        for(int i = 0; i<N; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            sum = sum + a*b;
        }

        if(X == sum){
            System.out.println("Yes");
        } else{
            System.out.println("No");
        }
    }
}