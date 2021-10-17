//Write a Program to Find Largest Number Among Three
//Numbers entered by users

package ifelse;

public class Q3 {

    static String findLargest(int first, int second, int third){
        if(first > second && first > third)
            return first+" is greater";
        else if(second > first && second > third)
            return second+" is greater";
        else if(third > first && third > second)
            return third+" is greater";
        else
            return "All are equal";
    }
    public static void main(String[] args) {

        System.out.println(findLargest(10,10,10));

    }
}
