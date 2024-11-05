import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        Map<String, Integer> map = new HashMap<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String s = "";
        String reverseWord;
        String word;
        for (int i = 0; i < N; i++) {
            word = br.readLine();
            int num = word.length();
            map.put(word, num);

            //word를 뒤집어서
            reverseWord = new StringBuilder(word).reverse().toString();

            if(map.containsKey(reverseWord)) {
                s = reverseWord.substring(num/2, num/2+1);
                System.out.print(num+" "+s);
            }
        }
    }
}