import java.util.Scanner;
import java.util.HashMap;
public class prob22{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[]args){
        int t=scn.nextInt();
        while(t-->0){
            int n=scn.nextInt();
            int q=scn.nextInt();
            int[]arr=new int[n];
            int[]freq=new int[32];
            for(int i=0;i<n;i++){
                int a=scn.nextInt();
                arr[i]=a;
                addi(freq,a);
            }
            System.out.println(printi(freq));
            while(q-->0){
                int x=scn.nextInt()-1;
                int v=scn.nextInt();

                removi(freq,x);
                // System.out.println(printi(freq));
                addi(freq,v);
                System.out.println(printi(freq));
            }
        }
    }
    public static void removi(int[]freq,int x){
        int val=freq[x];
        int mask=0;
        int idx=0;
        while(idx<32){
            mask=(1<<idx);

            if((mask & val)!=0){
                freq[idx]--;
            }
            idx++;
        }
    }
    public static void addi(int[]freq,int val){
       
        int mask=0;
        int idx=0;
        while(idx<32){
            mask=(1<<idx);

            if((mask & val)!=0){
                freq[idx]++;
            }
            idx++;
        }
    }
    public static int printi(int[]freq){
        int ans=0;

        for(int i=0;i<32;i++){
            int val=freq[i];
            if(val>=1){
                ans+=(int)(Math.pow(2,i));
            }
        }
        return ans;
    }
}