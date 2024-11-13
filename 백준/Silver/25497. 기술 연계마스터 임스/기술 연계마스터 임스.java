import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String skill = br.readLine();
        int lCount = 0;
        int sCount = 0;
        int result = 0;

        for (int i = 0; i < N; i++) {
            char x = skill.charAt(i);
            if (Character.isDigit(x)) {
                result += 1;
            } else if (x == 'L') {
                lCount++;
            } else if (x == 'S') {
                sCount++;
            } else if (x == 'R') {
                if (lCount > 0) {
                    lCount--;
                    result++;
                } else {
                    break;
                }
            } else if (x == 'K') {
                if (sCount > 0) {
                    sCount--;
                    result++;
                } else {
                    break;
                }
            }
        }
        System.out.println(result);
    }
}