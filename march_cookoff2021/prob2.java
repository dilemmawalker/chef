import java.util.Scanner;
public class prob2{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[]args){
        int t=scn.nextInt();
        while(t-->0){
           int n=scn.nextInt();
           int k=scn.nextInt();

           int[]arr=new int[n];
           int no=0;
           for(int i=0;i<n;i++){
               int a=scn.nextInt();
               arr[i]=a;
               if(a==1)
               no++;
           }

           int[]prefix=new int[n];

           int c=0;
           for(int i=0;i<k;i++){
               c+=arr[i];
           }
           int min=Integer.MAX_VALUE;
           for(int i=0;i<n-k+1 ;i++){
                min=Math.min(min,c);
                if(arr[i]==1)
                c-=1;

                if(i+k<n && arr[i+k]==1)
                c+=1;
           }
           c=0;
           n=min;
           long ans=0l;
           ans=((n*1l)*(n+1))/2;

           ans+=no;
           ans-=min;

           System.out.println(ans);
        }
    }
}