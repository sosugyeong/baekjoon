import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Queue<Integer> queue = new LinkedList<>();

        for (int i = 1; i <= N; i++) {
            queue.offer(i);
        }

        while(queue.size() > 1){
            System.out.println(queue.poll());
            int num = queue.poll();
            queue.offer(num);
        }
        System.out.println(queue.poll());
    }
}