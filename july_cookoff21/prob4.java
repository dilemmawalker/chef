import java.util.*;
public class prob4{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[]args){
        int t=scn.nextInt();
        while(t-->0){
           int n=scn.nextInt();
           int arr[]=new int[n];
           HashMap<Integer,Integer>map=new HashMap<>();
           for(int i=0;i<n;i++){
               arr[i]=scn.nextInt();
                if(map.containsKey(arr[i])){
                    map.put(arr[i],map.get(arr[i])+1);
                }
                else{
                    map.put(arr[i],1);
                }
           }
           long sum=0l;

           for(int i=0;i<n;i++){
               int a=arr[i];
               if(map.containsKey(a)){
                   int val=map.get(a);
                   
                       sum+=Math.min(a-1,val);
                       map.remove(a);
                   
               }
           }
           System.out.println(sum);
        }
    }
}