import java.io.*;
import java.util.*;

public class Main {

    public static String schedule(int N, String[][][] schedule){
        HashMap<String, Integer> map = new HashMap<>();
        int[] times = {4, 6, 4, 10}; //근무 시간

        for (int week = 0; week<N; week++){
            for(int time = 0; time<4; time++){

                String[] workers = schedule[week][time];
                for(String worker : workers){
                    if(!worker.equals("-")){
                        map.put(worker, map.getOrDefault(worker, 0)+times[time]);
                    }
                }
            }
        }

        //아무도 근무하지 않는 경우
        if(map.isEmpty()){
            return "Yes";
        }

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int hour : map.values()){
            if(hour < min){
                min = hour;
            }
            if(hour > max){
                max = hour;
            }
        }

        if (max - min <= 12) {
            return "Yes";
        } else {
            return "No";
        }
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine().trim());
        String[][][] schedule = new String[N][4][];

        // 입력 처리
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 4; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine().trim());
                schedule[i][j] = new String[st.countTokens()];
                for (int k = 0; k < schedule[i][j].length; k++) {
                    schedule[i][j][k] = st.nextToken();
                }
            }
        }

        // 결과 출력
        bw.write(schedule(N, schedule));
        bw.newLine();
        bw.flush();
        bw.close();
        br.close();
    }
}