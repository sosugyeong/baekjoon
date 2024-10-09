import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static public void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(br.readLine());
        int quarter = 25, dime = 10, nickel = 5, penny = 1;
        int money = 0;

        int one, two, three, four;
        for(int i = 0; i<N; i++){
            money = Integer.parseInt(br.readLine());

            one = 0;
            two = 0;
            three = 0;
            four = 0;

            one = money/quarter;
            two = (money%quarter)/dime;
            three = ((money%quarter)%dime)/nickel;
            four = (money%nickel)/penny;

            System.out.printf("%d %d %d %d\n", one, two, three, four);
        }
    }
}