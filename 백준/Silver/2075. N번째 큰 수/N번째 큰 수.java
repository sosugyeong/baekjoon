import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pqueue = new PriorityQueue<>();

        for(int i = 0; i< N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++){
                int num = Integer.parseInt(st.nextToken());
                pqueue.add(num);
            }

        }

        for (int i = 0; i < N*N; i++) {
            if(i < N*N-N){
                pqueue.poll();
            }
        }
        System.out.println(pqueue.poll());
    }
}