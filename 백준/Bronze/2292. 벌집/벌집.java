import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long N = Long.parseLong(br.readLine());
        int honey = 6;
        int range = 2;
        int num = 1;

        if(N == 1){
            System.out.println("1");
        }
        else {
            while(range <= N){
                range = range + (honey * num);
                num++;
            }
            System.out.println(num);
        }
    }
}