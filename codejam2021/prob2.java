import java.util.Scanner;
public class prob2{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[]args){
        int t=scn.nextInt();
        int mm=1;
        while(t-->0){
            int x=scn.nextInt();
            int y=scn.nextInt();
            String str=scn.next();

            int n=str.length();
            char[]arr=new char[n];
            for(int i=0;i<n;i++){
                arr[i]=str.charAt(i);
            }
            long c=0l;
                int idx=0;
                if(arr[0]=='?'){    
                    while(idx<n && arr[idx]=='?'){
                        idx++;
                    }
                    if(idx<n){
                        arr[0]=arr[idx];
                    }
                    else{
                        arr[0]='C';
                    }
                }
            
            for(int i=1;i<n;i++){
                char ch=arr[i];
                char p=arr[i-1];
               
                if(p=='C'){
                    if(ch=='J')
                    c+=x;
                    else if(ch=='?')
                    arr[i]='C';

                }
                else if(p=='J'){
                    if(ch=='C')
                    c+=y;
                    else if(ch=='?')
                    arr[i]='J';
                }
                else{
                    
                }
            }
            System.out.println("Case #"+mm+": "+c);
            mm++;
        }
    }
}