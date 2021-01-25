import java.io.*;
import java.util.*;
public class prob4{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[]args){
        int t=scn.nextInt();
        while(t-->0){
           int n=scn.nextInt();
           String s=scn.next();
           String p=scn.next();
            
           int one=0,zero=0;
           int sone=0,szero=0,pone=0,pzero=0;
           int no=0;
           int i=0;
           for(i=0;i<n;i++){
               int no1=s.charAt(i)-'0';
               int no2=p.charAt(i)-'0';

               if(no1==0)
               szero++;
               else
               sone++;
               if(no2==0)
               pzero++;
               else
               pone++;

               if(no1==no2)
               continue;

                if(no1!=no2 && no1==1){
                    no++;
                }
                else{
                    if(no>0){
                        no--;
                    }
                    else
                    break;
                }
           }
           if(i==n && no==0 && sone==pone && szero==pzero)
           System.out.println("Yes");
           else
           System.out.println("No");


        }
    }
}