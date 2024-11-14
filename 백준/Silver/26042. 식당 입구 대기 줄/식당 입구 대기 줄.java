import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Queue<Integer> queue = new LinkedList<>();
        int maxCount = 0;
        int last = -1; //최대 학생수일때 맨 뒤의 학생 번호
        int current = 0;//현재 대기 중인 학생 수

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());

            if(a == 1){
                int student = Integer.parseInt(st.nextToken());
                queue.add(student);
                current++;

                if(current > maxCount || (current == maxCount && student < last)){
                    maxCount = current;
                    last = student;
                }
            } else if (a == 2) {
                queue.poll();
                current--;
            }
        }

        System.out.println(maxCount+" "+last);
    }
}