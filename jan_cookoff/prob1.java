import java.io.*;
import java.util.*;
class prob1{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[]args){
       int t=scn.nextInt();
       while(t-->0){
       String s=scn.next();
      int n=s.length();
      boolean l=false,u=false,d=false,ss=false;
      for(int i=0;i<n;i++){
          char ch=s.charAt(i);
          if(ch>='a' && ch<='z'){
            l=true;
          }
          else if(i!=0 && i!=n-1 && (ch>='A' && ch<='Z')){
            u=true;
          }
          else if(i!=0 && i!=n-1 && (ch>='0' && ch<='9')){
            d=true;
          }
          else if(i!=0 && i!=n-1 && (ch=='@' || ch=='#' || ch=='%' || ch=='&' || ch=='?')){
            ss=true;
          }
      }
      if(l==true && u==true && d==true && ss==true && n>=10)
      System.out.println("YES");
      else
      System.out.println("NO");
    }
       
    }
}