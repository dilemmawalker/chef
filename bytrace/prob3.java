import java.io.*;
import java.util.*;
  class prob3{
    public static Scanner scn=new Scanner (System.in);
    public static void main(String[]args){
        int t=scn.nextInt();
        while(t-->0){
            int n=scn.nextInt();
            int []arr=new int[n+1];
            int q=scn.nextInt();
                while(q-->0){
                    int v=1;
                    int l=scn.nextInt();
                    int r=scn.nextInt();

                    for(int i=l;i<=r;i++){
                        arr[i]=arr[i]+v++;
                    }
                }
                for(int i=1;i<=n;i++){
                    System.out.print(arr[i]+" ");
                }
                System.out.println();
            }
        }
    }