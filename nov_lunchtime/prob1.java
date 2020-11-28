import java.io.*;
import java.util.*;
class prob1{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[]args){
        int t=scn.nextInt();
        while(t-->0){
            int n=scn.nextInt();
            int[]arr=new int[n];
            for(int i=0;i<n;i++)
            arr[i]=scn.nextInt();

            int c=0;
            int f=0;
            for(int i=0;i<n;i++){
                int a=arr[i];
                f+=a;
                if(f==0)
                break;
                c+=a;
                f--;
            }
            System.out.println(c);
        }
    }
}