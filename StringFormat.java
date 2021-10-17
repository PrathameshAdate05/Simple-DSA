import java.util.*;

public class StringFormat{
    public static void main(String args[])throws ArrayIndexOutOfBoundsException{

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String :");
        String ip=sc.nextLine();
        String op="";
        char[] strarr=ip.toCharArray();

        int count=1;
        int i,j;

        for(i=0;i<strarr.length-1;i++){
            if(strarr[i]==strarr[i+1]){
                count++;
                
            }
            else if(strarr[i]!=strarr[i+1]){
                op=op+strarr[i]+String.valueOf(count)+strarr[i+1];
                count=1;
            }
              
            
           
        }

        System.out.println(op);
    }
}