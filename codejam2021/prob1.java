import java.util.Scanner;
import java.util.Arrays;
public class prob1{
    public static Scanner scn=new Scanner(System.in);
    public static  void main(String[]args){
        int t=scn.nextInt();
        int aa=1;
        while(t-->0){
            int n=scn.nextInt();
            int[]arr=new int[n];
            for(int i=0;i<n;i++){
                int a=scn.nextInt();
                arr[i]=a;
            }
            int c=0;
            for(int i=0;i<n-1;i++){
                int min=arr[i];
                int pos=i;
                for(int j=i;j<n;j++){
                    if(arr[j]<min){
                        min=arr[j];
                        pos=j;
                    }
                }
                sorting(arr,i,pos);
                c+=(pos-i+1);
            }
            System.out.println("Case #"+aa+": "+c);
            aa++;
        }
    }
    public static void sorting(int[]arr,int i,int j){
       while(i<j){
           int temp=arr[i];
           arr[i]=arr[j];
           arr[j]=temp;
           i++;
           j--;
       }
    }
}