import java.io.*;
import java.util.*;
class prob4{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[]args){
       
        int n=scn.nextInt();
        while(n-->0){
            int a=scn.nextInt();
            int e=0,o=0;
            while(a>0){
                int no=a%10;
                if(no%2==0)
                e+=no;
                else
                o+=no;
                a/=10;
            }
            if(e%4==0 || o%3==0)
            System.out.println("Yes");
            else
            System.out.println("No");
        }
       
    }
}