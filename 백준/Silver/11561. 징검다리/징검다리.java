import java.io.*;

public class Main {

    public static long binarySearch(long N){
        long left = 1;
        long right = (long)Math.sqrt(2*N)*2;
        long answer = 1;

        while(left <= right){
            long mid = left+(right-left)/2;
            long sum = (mid * (mid+1))/2;

            if (sum <= N){
                answer = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            long N = Long.parseLong(br.readLine());
            System.out.println(binarySearch(N));
        }

    }
}