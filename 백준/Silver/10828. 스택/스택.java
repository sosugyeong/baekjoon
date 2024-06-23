import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static  int[] arr;
    static int top = -1;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        arr = new int[N];

        for(int i = 0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String order = st.nextToken();
            int num = 0;
            if(st.hasMoreTokens()){
                num = Integer.parseInt(st.nextToken());
            }

            switch (order){
                case "push" :
                    push(num);
                    break;
                case "pop" :
                    pop();
                    break;
                case "size" :
                    size();
                    break;
                case "empty" :
                    empty();
                    break;
                case "top" :
                    top();
                    break;
                default:
                    break;
            }
        }
    }

    public static void push(int n){//정수 X를 스택에 넣는 연산이다.
        arr[++top] = n;
    }

    public static void pop(){ //스택에서 가장 위에 있는 정수를 빼고, 그 수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
        if(top == -1){
            System.out.println(-1);
        } else {
            System.out.println(arr[top--]);
        }
    }

    public static void size(){ //스택에 들어있는 정수의 개수를 출력한다.
        System.out.println(top+1);
    }

    public static void empty(){ //스택이 비어있으면 1, 아니면 0을 출력한다.
        if(top == -1){
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }

    public static void top(){//스택의 가장 위에 있는 정수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
        if(top == -1){
            System.out.println(-1);
        } else {
            System.out.println(arr[top]);
        }
    }
}