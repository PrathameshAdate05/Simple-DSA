
//Write a Program to Check Whether Number is Even or
//Odd

package ifelse;



public class Q1 {

    static String evenOdd(int number){
        return (number % 2 == 0) ? "Even" : "Odd";
    }
    public static void main(String[] args) {

        System.out.println(evenOdd(24));

    }
}
