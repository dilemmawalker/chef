import java.io.*;
import java.util.*;
public class Codechef{
    public static Scanner scn=new Scanner (System.in);
    public static void main(String[]args){
        int t=scn.nextInt();
        while(t-->0){
            String a1=scn.next();
            String b1=scn.next();
            int n=a1.length();
            int[]a=new int[n];
            int[]b=new int[n];
            int c=0;
            for(int i=0;i<n;i++){
                a[i]=a1.charAt(i)-'0';
                b[i]=b1.charAt(i)-'0';
            }
            for(int i=0;i<n;i++){//
                int ch=a[i];
                int ch2=b[i];
                if(ch!=ch2){
                    int j=i+2;
                    while(j<n && (a[j]!=b[j])){
                        a[j]=b[j];
                        j+=2;
                    }
                    c++;
                }
            }
            System.out.println(c);
        }
    }
}