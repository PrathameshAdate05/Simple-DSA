package Games;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {



    public Random r = new Random();
    public Scanner sc = new Scanner(System.in);
    public final int rand = r.nextInt(100);
    public int score = 0;

    public void guessNo(){
        System.out.println(rand);

        System.out.println("Enter a no :");
        int n = sc.nextInt();

        if(n == rand){
            score++;
            System.out.println("Congo you guessed the no..!!!!");
            System.out.println("Your score :"+score);
        }
        else if(n > rand){
            score++;
            System.out.println("Entered no is greater than the random no..!!");
            guessNo();
        }
        else {
            score++;
            System.out.println("Entered no is smaller than the random no..!!");
            guessNo();
        }

    }

    public static void main(String[] args) {
        GuessNumber g = new GuessNumber();
        g.guessNo();
    }
}
