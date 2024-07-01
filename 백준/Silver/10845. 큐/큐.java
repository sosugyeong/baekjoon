import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[] arr;
    static int front = 0;
    static int rear = 0;

    static public void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        arr = new int[N];

        for(int i = 0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String que = st.nextToken();
            int num = 0;
            if(st.hasMoreTokens()){
                num = Integer.parseInt(st.nextToken());
            }

            switch(que){
                case "push":
                    push(num);
                    break;
                case "pop":
                    pop();
                    break;
                case "size":
                    size();
                    break;
                case "empty":
                    empty();
                    break;
                case "front":
                    front();
                    break;
                case "back":
                    back();
                    break;
                default:
                    break;
            }
        }
    }

    public static void push(int n){ //정수 X를 큐에 넣는 연산이다.
        arr[rear++] = n;
    }

    public static void pop(){ //큐에서 가장 앞에 있는 정수를 빼고, 그 수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
        if(front == rear){
            System.out.println(-1);
        } else {
            System.out.println(arr[front++]);
        }
    }

    public static void size(){ //큐에 들어있는 정수의 개수를 출력한다.
        System.out.println(rear-front);
    }

    public static void empty(){ //큐가 비어있으면 1, 아니면 0을 출력한다.
        if(front == rear){
            System.out.println(1);
        } else {
            System.out.println(0); }
    }

    public static void front(){ //큐의 가장 앞에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
        if(front == rear){
            System.out.println(-1);
        } else {
            System.out.println(arr[front]);
        }
    }

    public static void back(){ //큐의 가장 뒤에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
        if(front == rear){
            System.out.println(-1);
        } else{
            System.out.println(arr[rear-1]);
        }
    }
}