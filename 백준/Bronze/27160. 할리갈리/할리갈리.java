import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException{
        HashMap<String, Integer> map = new HashMap<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int X;
        String S;
        StringTokenizer st;


        for(int i = 1; i<=N; i++){
            st = new StringTokenizer(br.readLine());
            S = st.nextToken();
            X = Integer.parseInt(st.nextToken());

            //기존 값에 X를 더하고 다시 map에 저장한다
            map.put(S, map.getOrDefault(S, 0)+X);
        }

        String result = "NO";
        for (String key : map.keySet()) {
            if(map.get(key)==5) {
                result ="YES";
            }
        }
        System.out.println(result);
    }
}