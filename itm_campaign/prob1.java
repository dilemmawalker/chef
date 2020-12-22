import java.io.*;
import java.util.*;
class prob1{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[]args){
       int n=scn.nextInt();
       int k=scn.nextInt();
       while(k-->0){
           if(n%10==0)
            n/=10;
            else
            n-=1;   
       }
       System.out.println(n);
    }
}