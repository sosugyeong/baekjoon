import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //StringTokenizer st = new StringTokenizer(br.readLine());

        String[] nm = br.readLine().split(" ");
        int N = Integer.parseInt(nm[0]);
        int M = Integer.parseInt(nm[1]);

        char[][] matrix = new char[N][M];

        for (int i = 0; i < N; i++) {
            matrix[i] = br.readLine().toCharArray();
        }

        int maxSize = 1;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                for (int k = 1; i+k<N && j+k<M ; k++) {
                    if(matrix[i][j] == matrix[i+k][j] &&
                    matrix[i][j] == matrix[i][j+k] &&
                    matrix[i][j] == matrix[i+k][j+k]){
                        maxSize = Math.max(maxSize, (k+1)*(k+1));
                    }

                }
            }
        }

        System.out.println(maxSize);
    }
}