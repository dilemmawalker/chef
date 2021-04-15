import java.util.Scanner;
import java.util.Arrays;
public class prob2{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[]args){
        int t=scn.nextInt();
        while(t-->0){
            int n=scn.nextInt();
            int[]arr1=new int[n];
            int[]arr2=new int[n];
            for(int i=0;i<n;i++){
                int a=scn.nextInt();
                arr1[i]=a;
            }
            for(int i=0;i<n;i++){
                int a=scn.nextInt();
                arr2[i]=a;
            }

            Arrays.sort(arr1);
            Arrays.sort(arr2);

            int c=0;
            for(int i=0;i<n;i++){
                c=Math.max(c,(arr1[i]+arr2[n-i-1]));
            }
            System.out.println(c);
        }
    }
}