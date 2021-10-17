import java.util.Scanner;

public class StringToFloat {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value :");
        String input = sc.nextLine();

        System.out.println(findValue(input));
    }

    static float findValue(String input){

        String[] arr = input.split("/");

        float res = Float.parseFloat(arr[0])/Float.parseFloat(arr[1]);

        return res;
    }
}
