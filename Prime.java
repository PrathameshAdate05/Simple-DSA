import java.util.*;

public class Prime{
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter no:");
        int a=sc.nextInt();

        int i,j,m=0,flag=0;
      
        if(a==0 || a==1){
            System.out.println(a+" is not Prime");
        }
        else{
            for(i=2;i<=a/2;i++){
                if(a%i==0){
                    flag=1;
                    break;
                }
            }
        }

        if(flag==0)
            System.out.println(a+" is Prime"); 
        else
           System.out.println(a+" is not Prime"); 
        
        
    }
}