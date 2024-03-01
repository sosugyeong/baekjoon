import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		char temp = 0;
		String output = "";
		
		for(int i = 0; i < s.length(); i++) { //valueOf는 char 타입인 temp를 String으로 변환하는 메스드
			temp = s.charAt(i);
			if(temp>=65 && temp<=90) { //대문자를 소문자로 변환
				output += s.valueOf(temp).toLowerCase(); //String.valueOf(temp)가 반환하는 문자열을 소문자로 변환하여 반환
			}
			else if(temp>=97 && temp<=122) {//소문자를 대문자로 변환
				output += s.valueOf(temp).toUpperCase();
			}
		}
		System.out.println(output);
	}
}