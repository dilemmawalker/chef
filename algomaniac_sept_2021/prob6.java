import java.util.*;
class prob6{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[]args){
        int t=scn.nextInt();
        while(t-->0){
            int n=scn.nextInt();
            
            int[]arr=new int[n];
            int[]copy=new int[n]
            int max=0;
            for(int i=0;i<n;i++){
                int a=scn.nextInt();
                arr[i]=a;
                copy[i]=a;
            }
            Arrays.sort(copy);
            HashMap<Integer,Integer>map=new HashMap<>();
            for(int i=0;i<n;i++){
                map.put(copy[i],i);
            }
            sort(arr,0,n-1,copy);
    }
}
public static int cost=0;
    public static void sort(int[]arr,int lo,int hi,int copy){



        int p1=lo;
        int p2=map.get(copy[p1]);
        while(p2<n && p1<n && arr[p1]==copy[p2]){
            p2++;
            p1++;
        }
        if(p1<n){
            sort(arr,)
        }
    }
}