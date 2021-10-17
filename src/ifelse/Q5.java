//Write a Program to Check whether a year entered by
//user is Leap Year or not

package ifelse;

public class Q5 {

    static String checkLeap(int year){
        return (year % 4 == 0) ? "Leap" : "not Leap";
    }

    public static void main(String[] args) {
        System.out.println(checkLeap(2020));
    }
}
