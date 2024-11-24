import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        int num = 0;

        for (int i = 0; i < N; i++) {
            num = Integer.parseInt(br.readLine());
            if(num != 0){
                stack.push(num);
            } else {
                stack.pop();
            }
        }

        int sum = 0;
        for(int i : stack){
            sum += i;
        }
        System.out.println(sum);
    }
}