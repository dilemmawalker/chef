import java.util.Scanner;
public class prob4{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[]args){
        int t=scn.nextInt();
        while(t-->0){
            int n=scn.nextInt();
            int k=scn.nextInt();
            int o=0,e=0;
            int[]arr=new int[n];
            for(int i=0;i<n;i++){
                int a=scn.nextInt();
                arr[i]=a;
            }
            int i=0;
            for( i=0;i<n;i++){
                boolean flag=false;
                if(arr[i]%k==0)
                flag=true;
                else
                for(int j=0;j<n;j++){
                    if((arr[i]+arr[j])%k==0){
                        flag=true;
                        break;
                    }
                }

                if(!flag){
                    System.out.println("NO");
                    break;
                }
            }
            if(i==n)
            System.out.println("YES");
        }
    }
}