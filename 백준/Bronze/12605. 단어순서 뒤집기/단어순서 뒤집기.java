import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(br.readLine());
        String text = "";
        String[] arr;

        for(int i = 0; i<N; i++){
            text = br.readLine();
            arr = text.split(" ");

            List<String> list = Arrays.asList(arr);
            Collections.reverse(list);

            System.out.println("Case #"+(i+1)+": "+String.join(" ", list));
        }
    }
}