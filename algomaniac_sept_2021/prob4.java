import java.util.Scanner;           //The Rumbling(Titans)
class prob4{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[]args){
        int t=scn.nextInt();
        while(t-->0){
            int n=scn.nextInt();
            String str=scn.next();
            int x=scn.nextInt();
            int y=scn.nextInt();

            long[]left=new long[n];
            long[]right=new long[n];
            for(int i=0;i<n;i++){
                left[i]=0l;
                right[i]=0l;
            }

            for(int i=0;i<n;i++){       //east look
                char ch=str.charAt(i);
                long val=0l;
                if(ch=='W'){
                    val=Math.min(x,y)*2;
                }
                else if(ch=='N'){   
                    val=Math.min(x,y*3*1l);
                }   
                else if(ch=='S'){
                    val=Math.min(3*x*1l,y);
                }
                right[i]=0l;
                if(i!=0)
                right[i]=val+right[i-1];
                else
                right[i]=val;
            }
            for(int i=n-1;i>=0;i--){        //west look
                char ch=str.charAt(i);
                long val=0l;
                if(ch=='E'){
                    val=Math.min(x,y)*2;
                }
                else if(ch=='N'){   
                    val=Math.min(3*x*1l,y);
                }   
                else if(ch=='S'){
                    val=Math.min(x,y*3*1l);
                }
                left[i]=0l;
                if(i!=n-1)
                left[i]=val+left[i+1];
                else
                left[i]=val;
            }
            for(int i=0;i<n;i++){
                System.out.print(left[i]+" ");
            }
             for(int i=0;i<n;i++){
                System.out.print(right[i]+" ");
            }
            
            long min=0l;
            min=Math.min(left[0],right[n-1]);
            for(int i=0;i<n-1;i++){
                long val=0l;
                val=right[i]+left[i+1];
                min=Math.min(val,min);
            }
            System.out.println(min);
           
        }
    }
}