import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        int x = 0;

        for(int i = 0; i < N; i++){
            x = Integer.parseInt(br.readLine());
            if(x == 0) {
                if(queue.isEmpty()){
                    System.out.println("0");
                } else {
                    System.out.println(queue.poll());
                }
            } else {
                queue.add(x);
            }
        }
    }
}