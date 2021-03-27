import java.util.Scanner;
public class prob3{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[]args){
        int t=scn.nextInt();
        while(t-->0){
           int n=scn.nextInt();
           int[]arr=new int[n];
           for(int i=0;i<n;i++){
               int a=scn.nextInt();
               arr[i]=a;
           }
           long c=0l;
           long[]narr=new long[n];
           for(int i=0;i<n;i++){
               narr[i]=0l;
           }
           for(int i=0;i<n;i++){
               int p=i;
               c=0l;
               int val=arr[i];
               while(--p>=0){
                    if(arr[p]==val)
                    c++;
                    if(arr[p]>val)
                    break;
               }
               p=i;
               while(++p<n){
                if(arr[p]==val)
                c++;
                if(arr[p]>val)
                break;
               }
               narr[i]=c;
           }
           for(int i=0;i<n;i++){
           System.out.print(narr[i]+" ");
           }
           System.out.println();
        }
    }
}