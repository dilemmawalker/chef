import java.util.Scanner;
public class prob3{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[]args){
        int t=scn.nextInt();
        while(t-->0){
            int n=scn.nextInt();
            String s=scn.next();
            int[]sum=new int[n];
            int o=0,e=0;
            int[]arr=new int[n];
            for(int i=0;i<n;i++){
                int a=s.charAt(i)-'0';
                arr[i]=a;
            }
            int c=0;
            for(int i=n-1;i>=0;i--){
                int a=arr[i];
                if(a==0)
                c++;
                
                sum[i]=c;
            }
            c=0;
            int min=sum[0];
            for(int i=0;i<n;i++){
                int a=arr[i];
               
                min=Math.min(min,(sum[i]+c));
                if(a==1)
                c++;
            }
            min=Math.min(min,c);
            System.out.println(min);
        }
    }
}