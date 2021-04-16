import java.util.Scanner;
import java.util.Arrays;
import java.util.HashMap;
public class prob3{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[]args){
       
            int n=scn.nextInt();
            int[]arr=new int[n];
            for(int i=0;i<n;i++){
                int a=scn.nextInt();
                arr[i]=a;
            }
            
            int q=scn.nextInt();
            int point=0;
            HashMap<Integer,Integer>map=new HashMap<>();
            while(q-->0){
                int x=scn.nextInt()-1;  //position
                int k=scn.nextInt();    //no of people

                int p=x;
                long c=0l;
                while(p<n && k>0){
                    if(map.containsKey(p)){
                        p=map.get(p);
                        continue;
                    }
                    int val=arr[p];
                    if(val>k){
                        arr[p]=val-k;
                        c+=(p-x)*k;
                        
                        break;
                    }
                    else{
                        arr[p]=0;
                        c+=(p-x)*val;
                        k-=val;
                    }
                    p++;
                }
                point =p;
                for(int i=x;i<p;i++){
                map.put(i,p);
                }
                System.out.println(c);
            }
    }
}