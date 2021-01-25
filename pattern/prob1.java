import java.io.*;
import java.util.*;
 class prob1{
    public static Scanner scn=new Scanner (System.in);
    public static void main(String[]args){
        int t=scn.nextInt();
        while(t-->0){
            int n=scn.nextInt();
            int val=0;
            for(int i=0;i<n;i++){
                val+=1;
                int v=val;
                for(int j=0;j<n;j++){
                    v+=10;
                    System.out.print(v);
                }
                System.out.println();
            }
        }
    }
}