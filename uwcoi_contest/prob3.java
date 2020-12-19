import java.io.*;
import java.util.*;
public class prob3{
    public  static Scanner scn=new Scanner(System.in);
    public static void main(String[]args){
        int t=scn.nextInt();
        while(t-->0){
            int n=scn.nextInt();
            int k=scn.nextInt();
            int[][]arr=new int[n+1][2];
            for(int i=0;i<n+1;i++){
                int a=scn.nextInt();
                arr[i][0]=a;
                arr[i][1]=i;
            }
            for(int i=0;i<n+1;i++){
                int max=i;
                for(int j=i+1;j<n+1;j++){
                    if(arr[j][0]<arr[max][0])
                    max=j;
                }
                int temp1=arr[i][0];
                int temp2=arr[i][1];
                arr[i][0]=arr[max][0];
                arr[i][1]=arr[max][1];
                arr[max][0]=temp1;
                arr[max][1]=temp2;
            }
                int b=n;
                for(int i=0;i<n;i++){
                    if(k-arr[i][0]<=arr[b][0]){
                        int a=k-arr[i][0];
System.out.println(arr[i][1]+" "+arr[i][0]+" "+ arr[b][1] +" "+a);
                        arr[b][0]-=a;
                }
                else{
                    b=b-1;
                    int a=k-arr[i][0];
System.out.println(arr[i][1]+" "+arr[i][0]+" "+ arr[b][1] +" "+a);
                    arr[b][0]-=a;                    
                }
            }
        }
    }
}