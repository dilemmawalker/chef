import java.io.*;
import java.util.*;
class prob2{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[]args){
        int t=scn.nextInt();
        while(t-->0){
            int n=scn.nextInt();
            int []fuel=new int[n];
            int []cost=new int[n];
            int idx=0;
            for(int i=0;i<n;i++){
                fuel[i]=scn.nextInt();
            }
            for(int i=0;i<n;i++){
                cost[i]=scn.nextInt();
            }
            long min=100000000000000l;
            long a=100000000000000l;
            
            for(int i=0;i<n;i++){
                // for(int j=1;j<=fuel[i];j++){
                    int j=fuel[i];
                    long[]dp=new long [n+1];
                    // for(int k=0;k<dp.length;k++)
                    // for(int l=0;l<dp[0].length;l++)
                    // dp[k][l]=-1;
                    if(j>0)
                   a=solve(fuel,cost,i+1,j-1,fuel[i],i,dp)+j*cost[i];
                   min=Math.min(min,a);
                // }
            }
            System.out.println(min);
        }
    }
    public static long solve(int[]fuel,int[]cost,int idx,int cc,int tc,int end,long[]dp){
        idx=idx%fuel.length;
        if(idx==end){
            return 0;
        }
        if(dp[idx]!=0)
        return dp[idx];

        long ccc=100000000000000l;
        for(int i=0;i<=fuel[idx] && (cc+i)<=tc;i++){
            if((cc+i)>0)
            ccc=Math.min(ccc,(solve(fuel,cost,idx+1,cc+i-1,tc,end,dp)+i*cost[idx]));
        }
        return dp[idx]=ccc;
    }
}