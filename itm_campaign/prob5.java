import java.io.*;
import java.util.*;
class prob5{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[]args){
       
        int t=scn.nextInt();
        while(t-->0){
            int n=scn.nextInt();int total=0;
            int ans=scn.nextInt();
            total+=ans;
            while(--n>0){
                int a=scn.nextInt();
                total+=a;
                if(a%ans!=0){
                    ans=gcd(a,ans);
                }
            }
            
            System.out.println(ans +" "+ (total/ans));
           
        }
       
    }
    static int gcd(int a, int b)
    {
        // Everything divides 0 
        if (a == 0)
          return b;
        if (b == 0)
          return a;
      
        // base case
        if (a == b)
            return a;
      
        // a is greater
        if (a > b)
            return gcd(a-b, b);
        return gcd(a, b-a);
    }
}