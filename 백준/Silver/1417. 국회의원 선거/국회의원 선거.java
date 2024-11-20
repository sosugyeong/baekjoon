import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Queue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int N = Integer.parseInt(br.readLine());
        int dasom = Integer.parseInt(br.readLine());
        for(int i = 0; i<N-1; i++){
            pq.add(Integer.parseInt(br.readLine()));
        }

        int result = 0;
        while(!pq.isEmpty() && dasom <= pq.peek()){
            int temp = pq.poll()-1;
            dasom++;
            pq.add(temp);
            result++;
        }

        System.out.println(result);
    }
}