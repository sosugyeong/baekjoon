import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long N = Long.parseLong(br.readLine());
        long cat = 1L;
        long num = 1L;

        if(N == 0){
            num = 0;
        } else {
            for(long i = 1L; i<N; i++){
                cat = cat*2;

                if(N<=cat){
                    num = i+1;
                    break;
                }
            }
        }

        System.out.println(num);
    }
}