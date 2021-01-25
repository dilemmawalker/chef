import java.io.*;
import java.util.*;
class prob2{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[]args){
       int t=scn.nextInt();
       while(t-->0){
       int l=scn.nextInt();
       int r=scn.nextInt();
      int no=(r-l)+1;
      no=(r*(r+1))/2-(l*(l+1))/2;
      int n=r-l+1;
      n+=r-l;
      System.out.println(n);
    }
       
    }
}