import java.io.*;
import java.util.*;
public class prob2{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[]args){
        int t=scn.nextInt();
        while(t-->0){
            int n=scn.nextInt();
            int m=scn.nextInt();
            int[][]arr=new int[n][m];
           for(int i=0;i<n;i++){
               for(int j=0;j<m;j++){
                   int a=scn.nextInt();
                   arr[i][j]=a;
               }
           }
           boolean[]check=new boolean[n+m-1];
           int vv=0;
           boolean res=true;
        for(int i=m-1;i>=0;i--){
            int j=0;
            int val=arr[j][i];
            boolean v=true;
            int k=0;
            for(k=i+1,j=j+1;j<n && k<m;k++,j++){
                if(arr[j][k]!=val){
                v=false;
                break;
                }
            }
            check[vv++]=v;
            res=res||v;
        }
        
        for(int i=1;i<n;i++){
            int j=0;
            int val=arr[i][j];
            boolean v=true;
            int k=0;
            for(k=i+1,j=j+1;k<n && j<m ;j++,k++){
                if(arr[k][j]!=val){
                    v=false;
                    break;
            }
        }
        res=res||v;
        check[vv++]=v;
        }           //diagonal array completed

        int q=scn.nextInt();
        while(q-->0){
            int x=scn.nextInt();
            int y=scn.nextInt();
            int v=scn.nextInt();
            arr[x-1][y-1]=v;

            int diag=x-y+(m-1);
            int min=Math.min(x,y);
            int r=x-min;
            int c=y-min;

            boolean bool=true;
            int vall=arr[r++][c++];
            for(;r<n && c<m ;r++,c++){
                if(vall!=arr[r][c]){
                    bool=false;
                    break;
                }
            }
            check[diag]=bool;
            if(!bool)
            System.out.println("No");
            else{
                boolean anss=true;
                for(int i=0;i<(n+m-1);i++){
                    if(!check[i]){
                        anss=false;
                        break;
                    }
                }
                if(anss)
                System.out.println("Yes");
                else
                System.out.println("No");
            }
        }
    }
}
}