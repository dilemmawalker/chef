import java.io.*;
import java.util.*;
class prob3{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[]args){
       
        int n=scn.nextInt();
        int m=scn.nextInt();
        int a=scn.nextInt();

        int aa=(int)Math.ceil((n*1.0)/a);
        int b=(int)Math.ceil((m*1.0)/a);

        long c=0l;
        c=(long)aa*b;
        System.out.println(c);
       
    }
}