import java.util.*;
public class prob5{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[]args){
        int t=scn.nextInt();
        while(t-->0){
           int n=scn.nextInt();
           int arr[]=new int[n];
           HashMap<Integer,Integer>map=new HashMap<>();
           int min=Integer.MAX_VALUE;
           for(int i=0;i<n;i++){
               arr[i]=scn.nextInt();
                min=Math.min(min,arr[i]);
           }
           int freq1=0,freq2=0;
           boolean flag=true;

           for(int i=0;i<n;i++){
               int a=arr[i];
               if(min==a)
               freq2++;
               else
               freq1++;

            //    if(a<min){
            //        flag=false;
            //        break;
            //    }

            int val=a-min;
            if(a!=min && a%val!=min){
                flag=false;
                break;
            }
           }

           if(min==0)
           System.out.println(freq1);
           else if(flag){
               System.out.println(freq1);
           }
           else{
               System.out.println(n);
           }
        }
    }
}