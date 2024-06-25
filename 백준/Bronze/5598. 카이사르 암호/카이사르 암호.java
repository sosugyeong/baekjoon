import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String N = br.readLine();
        String[] sArr = N.split("");
        char nn;

        for(int i = 0; i<sArr.length; i++){
            int n = 0;
            if(sArr[i].charAt(0) > 67){
                n = (sArr[i].charAt(0))-3;
            } else  {
                n = (sArr[i].charAt(0))+23;
            }
            nn = (char) n;
            System.out.print(nn);
        }
    }
}