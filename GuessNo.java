import java.util.*;

public class GuessNo{
    public Random r=new Random();
    public int rn=r.nextInt(100);
    public int n,count=0;

    public void guess(){
        //System.out.println(rn);
        Scanner sc=new Scanner(System.in);
        System.out.println("\nEnter the no :");
        n=sc.nextInt();
        if(n==rn){
            System.out.println("You gussed the no !!!");
            count++;
             System.out.println("Your score is :"+count);
        }
        else if(n>rn){
            System.out.println("You guessed the larger no");
            count++;
            guess();
        }
        else if(n<rn){
            System.out.println("You guessed the small no");
            count++;
            guess();
        }
        
    }

    // public int ip(){
    //      Scanner sc=new Scanner(System.in);
    //     n=sc.nextInt();
    //     return n;
    // }

    public static void main(String args[]){

        GuessNo g=new GuessNo();
        g.guess();
    }
}