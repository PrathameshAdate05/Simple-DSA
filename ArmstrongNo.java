import java.util.*;

public class ArmstrongNo{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a no :");
        int a=sc.nextInt();
        int c=0,n,temp=a;

        while(n>0){
            n=a%10;
            a=a/10;
            c=c+(a*a*a);
        }
        if(temp==c)
            System.out.println("It is armstrong");
        else
            System.out.println("Not armstrong");
    }
}