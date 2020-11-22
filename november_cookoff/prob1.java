import java.io.*;
import java.util.*;
public class prob1{
    public static Scanner scn=new Scanner (System.in);
    public static void main(String[]args){
        int n=scn.nextInt();
        int m=scn.nextInt();
        int k=scn.nextInt();
        int count=0;
        for(int i=0;i<n;i++){
            int c=0;
            for(int j=0;j<k;j++){
                c+=scn.nextInt();
            }
            int a=scn.nextInt();
            if(a<=10 && c>=m)
            count++;
        }
        System.out.println(count);
    }
}