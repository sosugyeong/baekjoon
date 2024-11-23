import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int N = 0;

        int[] arr;
        for (int i = 0; i < T; i++) {
            N = Integer.parseInt(br.readLine());
            String maxSchool = "";
            int maxAlcohol = 0;
            for(int j = 0; j < N; j++){
                StringTokenizer st = new StringTokenizer(br.readLine());
                String school = st.nextToken();
                int alcohol = Integer.parseInt(st.nextToken());

                if (alcohol > maxAlcohol){
                    maxAlcohol = alcohol;
                    maxSchool  = school;
                }
            }
            System.out.println(maxSchool);
        }

    }
}