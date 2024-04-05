import java.util.*;
import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException
    {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        StringTokenizer st = new StringTokenizer(str, " ");
        System.out.println(st.countTokens());
    }
}