import java.util.Scanner;
public class prob3{
    public static Scanner scn=new Scanner (System.in);
    public static void main(String[]args){
        int t=scn.nextInt();
        while(t-->0){
            int n=scn.nextInt();
            int m=scn.nextInt();
            String[]arr=new String[n];
            for(int i=0;i<n;i++){
                String s=scn.next();
                arr[i]=s;
            }

            int cc=0;
            if(n%2!=0 && m%2!=0){
                for(int i=0;i<n;i++){
                    String s=arr[i];
                    for(int j=0;j<m;j++){
                        char ch=s.charAt(j);
                        int sum=i+j;
                        char c=sum%2==0?'*':'.';
                        if(c!=ch)
                        cc++;
                    }
                }
                System.out.println(cc);
            }
            else{
                for(int i=0;i<n;i++){
                    String s=arr[i];
                    for(int j=0;j<m;j++){
                        char ch=s.charAt(j);
                        int sum=i+j;
                        char c=sum%2==0?'*':'.';
                        if(c!=ch)
                        cc++;
                    }
                }
                int ccc=0;
                for(int i=0;i<n;i++){
                    String s=arr[i];
                    for(int j=0;j<m;j++){
                        char ch=s.charAt(j);
                        int sum=i+j;
                        char c=sum%2==0?'.':'*';
                        if(c!=ch)
                        ccc++;
                    }
                }
                ccc=Math.min(cc,ccc);
                System.out.println(ccc);
            }
        }
    }
}