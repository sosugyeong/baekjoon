import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        float[] arr = new float[T];
        float max = 0f;

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < T; i++){
            arr[i] = Integer.parseInt(st.nextToken());
            if(max<arr[i]){
                max = arr[i];
            }
        }

        float sum = 0.0f;
        float ever = 0.0f;
        for (int i = 0; i < T; i++) {
            sum += (arr[i]/max)*100;
            ever = sum/arr.length;
        }
        System.out.println(ever);
    }
}