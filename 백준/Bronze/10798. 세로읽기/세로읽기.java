import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] str = new String[5];

        for (int i = 0; i < str.length; i++) {
            str[i] = br.readLine();
        }

        String sum = "";
        int max = 0;
        for(String s : str){
            max = Math.max(max, s.length());
        }

        for (int i = 0; i < max; i++) {
            for(String word : str){
                if(i < word.length()){
                    char ch = word.charAt(i);
                    sum += ch;
                }
            }
        }
        System.out.println(sum);
    }
}