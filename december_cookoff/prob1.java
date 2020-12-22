import java.io.*;
import java.util.*;
public class prob1{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String []args){
        int t=scn.nextInt();
             while(t-->0){
                 int    n=scn.nextInt();
                 String str=scn.next();
                 int size=str.length();
                 int c=0;
                 for(int i=0;i<size;i++){
                     char ch=str.charAt(i);
                     if(ch=='1')
                     c++;
                 }
                 if((c+120-n)>=90)
                 System.out.println("YES");
                 else
                 System.out.println("NO");
             }
    }
}