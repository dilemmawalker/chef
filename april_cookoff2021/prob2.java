import java.util.Scanner;
import java.util.HashSet;
public class prob2{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[]args){
        int t=scn.nextInt();
        while(t-->0){
            int n=scn.nextInt();
            int q=scn.nextInt();
            int[]arr=new int[n];
            for(int i=0;i<n;i++){
                int a=scn.nextInt();
                arr[i]=a;
            }
            System.out.println(solve(arr));
            while(q-->0){
                int x=scn.nextInt();
                int v=scn.nextInt();

                arr[x-1]=v;
                System.out.println(solve(arr));
            }
        }
    }
    public static int solve(int []arr){
        int n=arr.length;
        int ans=0;
        for(int i=0;i<n;i++){
            int a=arr[i];
            ans|=a;
        }
        return ans;
    }
}