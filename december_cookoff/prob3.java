import java.io.*;
import java.util.*;
 class prob3{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String []args){
        int t=scn.nextInt();
             while(t-->0){
                String str=scn.next();
                int n=str.length();
                if(n%2!=0){
                    System.out.println(-1);
                }
                else{
                    int c1=0,c2=0;
                    for(int i=0;i<n;i++){
                        char ch=str.charAt(i);
                        if(ch=='0')
                        c1++;
                        else
                        c2++;
                    }
                    
                    int a=Math.max(c1,c2);
                    
                    int b=Math.min(c1,c2);
                    if(b==0)
                    System.out.println(-1);
                    else
                    System.out.println((a-b)/2);
                }
             }
    }
}