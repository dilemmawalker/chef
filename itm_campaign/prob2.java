import java.io.*;
import java.util.*;
class prob2{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[]args){
       int n=scn.nextInt();
       HashMap<Integer,Integer>arr=new HashMap<>();
       for(int  i=0;i<n;i++){
           int a=scn.nextInt();
           if(!arr.containsKey(a))
           arr.put(a,1);
           else
           arr.put(a,arr.get(a)+1);
       }
       int ans=-1;
       for(int i=0;i<=n;i++){
           int a=scn.nextInt();
            if(!arr.containsKey(a)){
            ans=a;
        }
            if(arr.containsKey(a)){
                if(arr.get(a)==1)
                arr.remove(a);
                else
                arr.put(a,arr.get(a)-1);
            }
           
       }
       System.out.println(ans);
    }
}