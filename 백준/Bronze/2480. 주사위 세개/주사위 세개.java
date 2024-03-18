import java.util.*;
import java.io.*;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a!=b && b!=c && a!=c){
            int max;
            if(a>b){
                if(c>a){
                    max = c;
                }
                else{
                    max = a;
                }
            } else{
                if(c>b){
                    max = c;
                }
                else{
                    max = b;
                }
            }
            System.out.println(max*100);

        } else{
            if(a == b && a == c){
                System.out.println(a*1000+10000);
            } else{
                if(a == b || a == c){
                    System.out.println(a*100+1000);
                } else{
                    System.out.println(b*100+1000);
                }
            }
        }
    }
}