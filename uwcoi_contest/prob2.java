import java.io.*;
import java.util.*;
 class prob2{
    public  static Scanner scn=new Scanner(System.in);
    public static void main(String[]args){
        int n=scn.nextInt();
        int m=scn.nextInt();
        int min=1000000001;
        long c=0l;
        int aa=scn.nextInt();
        min=Math.min(aa,min);
            for(int i=1;i<n;i++){
                int a=scn.nextInt();
                min=Math.min(a,min);
            }
            // if(min==aa)
            // c=0;
            // else
            // c=1;
            int[]arr=new int[m];
            for(int i=0;i<m;i++){
                int a=scn.nextInt();
                arr[i]=a;
            }
            // for(int i=0;i<m;i++){
            //     int max=i;
            //     for(int j=i+1;j<m;j++){
            //         if(arr[j]<arr[max])
            //         max=j;
            //     }
            //     // if(max==i)
            //     // continue;
            //     int temp1=arr[i];
            //     arr[i]=arr[max];
            //     arr[max]=temp1;
            //     // c++;
            // }

            c=0;
            for(int i=0;i<m;i++){
                if(arr[i]<min)
                c+=n;
            }

            System.out.println(c);
    }
}