import java.util.Scanner;
public class prob3{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[]args){
        int t=scn.nextInt();
        while(t-->0){
         int n=scn.nextInt();
         int[]arr=new int[n];

         int or=0;
         for(int i=0;i<n;i++){
             arr[i]=scn.nextInt();
             or=or|arr[i];
         }

         int x=or;
         or=0;
         for(int i=0;i<n;i++){
             int temp=x^arr[i];
             or=or|temp;
         }
         System.out.println(x+" "+or);

        }
    }
}