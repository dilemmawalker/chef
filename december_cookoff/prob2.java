import java.io.*;
import java.util.*;
 class prob2{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String []args){
        int t=scn.nextInt();
             while(t-->0){
                 long x=0l,y=0l,k=0l,n=0l;
                     x=scn.nextInt();
                     y=scn.nextInt();
                     k=scn.nextInt();
                     n=scn.nextInt();

                     long a=0l,b=0l;
                  a=Math.min(x,y);
                  b=Math.max(x,y);
                  a=b-a;
                 if(a%(2*k)==0)
                 System.out.println("Yes");
                 else
                 System.out.println("No");
             }
    }
}