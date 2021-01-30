import java.util.Scanner;
public class prob2{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[]args){
        int t=scn.nextInt();
        while(t-->0){
            int n=scn.nextInt();
            int o=0,e=0;
            int[]arr=new int[n];
            for(int i=0;i<n;i++){
                int a=scn.nextInt();
                arr[i]=a;
                if(a%2==0)
                e++;
                else
                o++;
            }
            if(o%2==0)
            e=1;
            else 
            e=2;
            System.out.println(e);
        }
    }
}