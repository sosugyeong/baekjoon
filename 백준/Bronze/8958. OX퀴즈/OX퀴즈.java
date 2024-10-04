import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static public void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String s = "";
        int sum;

        for(int i = 1; i<=N; i++){
            s = br.readLine();
            sum  = 0;
            int k = 0;
            String [] arr = s.split("");

            for(int j = 0; j< arr.length; j++){
                String o = "O";
                if(arr[j].equals(o)){
                    k++;
                    sum = sum + k;
                } else {
                    k = 0;
                    sum = sum + 0;
                }
            }

            System.out.println(sum);
        }
    }
}