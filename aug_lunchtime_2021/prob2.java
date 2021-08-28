import java.util.*;
class prob2{                        //Crossing blocks
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[]args){
        int t=scn.nextInt();
        while(t-->0){
            int n=scn.nextInt();
            int[]arr=new int[n];
            int[]max=new int[n];
            int []idx=new int[n];
            for(int i=0;i<n;i++){
                int a=scn.nextInt();
                arr[i]=a;
            }
            int maxx=Integer.MIN_VALUE;
            int idxx=0;
            for(int i=n-1;i>=0;i--){
                int a=arr[i];
                if(a>maxx){
                    maxx=a;
                    idxx=i;
                }
                max[i]=maxx;
                idx[i]=idxx;
            }
            long sum=0l;
            int i=0;
            while(i<n-1){
                int a=arr[i];
                int val=max[i+1];
                if(val>a){
                    sum=-1;
                    break;
                }
                int next=idx[i+1];
                i=next;
                sum++;
            }
            System.out.println(sum);
        }
    }
}