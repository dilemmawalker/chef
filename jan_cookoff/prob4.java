import java.util.Scanner;
public class prob4{
    public static Scanner scn=new Scanner (System.in);
    public static void main(String[]args){
        int t=scn.nextInt();
        while(t-->0){
            int n=scn.nextInt();
            int[]arr=new int[n];
            int min=Integer.MAX_VALUE;
            for(int i=0;i<n;i++){
                int a=scn.nextInt();
                arr[i]=a;
                min=Math.min(min,a);
            }
            int c=0;
            int l=0;int r=0;
            boolean flag=false;
            for(int i=0;i<n;i++){
                int a=arr[i];
                if(a==min){
                    l=i;
                break;
                }
            }
            for(int i=n-1;i>=0;i--){
                int a=arr[i];
                if(a==min){
                    r=i;
                    break;
                }
            }
            for(int i=l;i<r;i++){
                
            }

            int ans=0;
            c--;
            ans=(c*(c+1))/2;
            System.out.println(ans);
        }   
    }
}