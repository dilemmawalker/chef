import java.util.*;
class prob3{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[]args){
        int t=scn.nextInt();
        while(t-->0){
            int n=scn.nextInt();
            int k=scn.nextInt();

            int[]arr=new int[n];
            int[]copy=new int[n];
            int max=0;
            for(int i=0;i<n;i++){
                int a=scn.nextInt();
                arr[i]=a;
                copy[i]=a;
            }
            
            Arrays.sort(copy);
            int val=k/2;
            int c=0;
            int lar=0,idx=0;
            for(int i=n-1;i>=0;i--){
                int a=copy[i];
                if(c==val){
                    lar=a;
                    break;
                }
                c++;
            }
            for(int i=0;i<n;i++){
                int a=arr[i];
                if(a==lar){
                    idx=i;
                    break;
                }
            }
            //median & index.
            int l=k/2;
            if(k%2==0)
            l--;
            int r=k/2;
            System.out.println(lar);

            for(int i=0;i<n;i++){
                int a=arr[i];
                if(lar==a)
                System.out.print(a+" ");
                else if(a>lar){
                    if(r>0){
                        r--;
                        System.out.print(a+" ");
                    }
                }
                else{
                    if(l>0){
                        l--;
                        System.out.print(a+" ");
                    }
                }
            }
        }
    }
}