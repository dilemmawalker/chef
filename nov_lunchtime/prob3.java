import java.io.*;
import java.util.*;
class prob3{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[]args){
        int t=scn.nextInt();
        while(t-->0){
            int x=scn.nextInt();
            int y=scn.nextInt();
            int n=scn.nextInt();
            int i=n;
            int c=0;
            for(i=n;i>=0;i--){
                if((x^i)<(y^i)){
                    c++;
                }
                if(x>=y && i<x)
                break;
            }
            System.out.println(c);
        }
    }
}