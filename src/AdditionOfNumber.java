import java.util.*;

public class AdditionOfNumber{
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter no :");
        int ip=sc.nextInt();

        addNumber(ip);
       
    }

    public static void addNumber(int ip){

        int n,sum=0;

        while(ip!=0){
            n=ip%10;
            sum+=n;
            ip=ip/10;
        }

        System.out.println(sum);
    }
}