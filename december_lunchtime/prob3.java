import java.io.*;
import java.util.*;
public class prob3{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[]args){
        int t=scn.nextInt();
        while(t-->0){
           String str=scn.next();
           
           int[]ar=new int[26];
           int n=str.length();
           for(int i=0;i<n;i++){
               int ch=str.charAt(i)-'a';
               ar[ch]++;
           }
           ArrayList<Integer>arr=new ArrayList<>();
           for(int i=0;i<26;i++){
               if(ar[i]!=0)
            arr.add(ar[i]);
           }
        //    System.out.println(str);

           Collections.sort(arr);
           int c=0;
           while(arr.size()>1 && arr.get(arr.size()-1)>=2){
                int size=arr.size();
                int a=arr.get(0);
                int b=arr.get(size-1);

                int no=Math.min(a,(b/2));
                arr.set(0,a-no);
                arr.set(size-1,b-2*no);

                c+=no;
                if(arr.get(size-1)==0)
                arr.remove(size-1);

                if(arr.get(0)==0)
                arr.remove(0);
                
                Collections.sort(arr);
           }
           if(arr.size()>=1 && arr.get(arr.size()-1)>=3)
           c+=arr.get(arr.size()-1)/3;
           System.out.println(c);
        }
    }
}