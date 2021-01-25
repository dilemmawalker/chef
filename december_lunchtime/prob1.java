import java.io.*;
import java.util.*;
public class prob1{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[]args){
        int t=scn.nextInt();
        while(t-->0){
            int n=scn.nextInt();
            int k=scn.nextInt();
            int[]arr=new int[n];
            int c=0;
            for(int i=0;i<n;i++){
                int a=scn.nextInt();
                arr[i]=a;
                c+=a;
            }
            if(c%k==0)
            System.out.println(0);
            else
            System.out.println(1);
        }
    }
}