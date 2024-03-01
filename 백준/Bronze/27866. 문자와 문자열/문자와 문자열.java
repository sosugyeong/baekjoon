import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		String out = "";
		int num = sc.nextInt();
		char temp;
		
		for(int i = 0; i < s.length(); i++) {
			temp = s.charAt(i);
			
			if(i == num-1) {
				out = s.valueOf(temp);
			}
		}
		
		System.out.printf(out);
	}
}