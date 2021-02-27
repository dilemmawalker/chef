import java.util.Scanner;
public class prob2{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[]args){
        int t=scn.nextInt();
        while(t-->0){
           String str=scn.next();
           int n=str.length();
           str=str.toLowerCase();
           int[]arr=new int[26];
           for(int i=0;i<n;i++){
               char ch=str.charAt(i);

                arr[ch-'a']++;
           }

           int c=0;
           for(int i=0;i<26;i++){
            int a=arr[i];
            if(a%2!=0)
            c++;
           }

           if((n-c)>=(c*2)){
               System.out.println("YES");
           }
           else{
               System.out.println("NO");
           }
        }
    }
}