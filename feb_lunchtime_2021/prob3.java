import java.util.Scanner;
public class prob3{
    public static Scanner scn=new Scanner(System.in);
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
           int max=arr[n-1];
          
           
           boolean flag=false;
           for(int i=0;i<n-1;i++){
            int a=arr[i];
            if(a>max){
                System.out.println("NO");
                flag=true;
                break;
            }
        }
            if(!flag){
                if( max!=min){
                    System.out.println("YES");
                }
                else{
                    System.out.println("NO");
                }
            }
        }
    }
}