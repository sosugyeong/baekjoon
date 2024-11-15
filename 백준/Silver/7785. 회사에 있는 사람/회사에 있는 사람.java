import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        HashMap<String, Integer> hash = new HashMap<>();

        for(int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            String exist = st.nextToken();

            if(exist.equals("enter")){
                hash.put(name, 1);
            }
            if (exist.equals("leave")){
                hash.remove(name);
            }
        }

        List<String> list = new ArrayList<>(hash.keySet());
        Collections.sort(list);
        for(int i = list.size()-1; i>=0; i--){
            System.out.println(list.get(i));
        }
    }
}