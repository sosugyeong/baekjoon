import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());

        for (int i = 0; i < T; i++) {
            String line = br.readLine();
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken()); //세준
            int M = Integer.parseInt(st.nextToken()); //세비
            int sejin = 0;
            int sebi = 0;

            st = new StringTokenizer(br.readLine().trim());
            for (int j = 0; j<N; j++){
                int sj = Integer.parseInt(st.nextToken());
                if(sejin < sj) sejin = sj;
            }

            st = new StringTokenizer(br.readLine().trim());
            for (int k = 0; k<M; k++){
                int sb = Integer.parseInt(st.nextToken());
                if(sebi < sb) sebi = sb;
            }

            if(sejin > sebi){
                System.out.println("S");
            } else if(sebi > sejin){
                System.out.println("B");
            } else {
                System.out.println("S");
            }
        }
    }
}