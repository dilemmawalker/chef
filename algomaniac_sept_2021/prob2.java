import java.util.Scanner;
class prob2{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[]args){
        int t=scn.nextInt();
        while(t-->0){
            int n=scn.nextInt();
            int k=scn.nextInt();
            int l=scn.nextInt();

            int[]arr=new int[n];
            int max=0;
            for(int i=0;i<n;i++){
                int a=scn.nextInt();
                arr[i]=a;
                if(i!=n-1)
                max=Math.max(max,a);
            }
            int my=arr[n-1];
            while(k>0 && --l>0){
                my+=k;
            }

            if(my>max)
            System.out.println("Yes");
            else
            System.out.println("No");
        }
    }
}