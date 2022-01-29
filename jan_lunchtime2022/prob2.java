import java.util.Scanner;
class prob2{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[]args){
        int t=scn.nextInt();
        while(t-->0){
            int n=scn.nextInt();
            int k=scn.nextInt();
            String str=scn.next();
            int ans=0;

            int s=0,e=n-1;
            while(s<=e){
                int i=(s+e)/2;
                int sum=0;
                for(int j=i;j>=0;j--){  
                    int ch=str.charAt(j)-'0';
                    int temp=(10-((ch+sum)%10))%10;
                    sum+=temp;
                    // System.out.println(sum);
                }
                if(sum<=k){
                    // System.out.println(sum);
                ans=Math.max(ans,i+1);
                s=i+1;
                }
                else{
                    e=i-1;
                }
                
            }
            System.out.println(ans);
        }
    }
}