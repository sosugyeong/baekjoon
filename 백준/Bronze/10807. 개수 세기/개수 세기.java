import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] num = new int[N];
		int sum = 0;
		
		for(int i = 0; i < N; i++) {
			num[i] = sc.nextInt();
		}
		int ber = sc.nextInt();
		
		for(int i = 0; i < N; i++) {
			if(num[i] == ber) {
				sum++;
			}
		}
		System.out.println(sum);
	}
}