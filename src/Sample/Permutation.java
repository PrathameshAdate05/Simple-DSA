package Sample;

import java.util.Arrays;
import java.util.Scanner;

public class Permutation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no :");
        int n = sc.nextInt();

        System.out.println(getSum(n));
    }

    private static int getSum(int n) {

        int large = 0;
        char[] arr = String.valueOf(n).toCharArray();
        Arrays.sort(arr);
        int small = Integer.parseInt(new String(arr));
        large = getReversed(small);
        return small+large;

    }

    private static int getReversed(int n){
        int res = 0;

        while (n!=0){
            int rem = n%10;
            res = (res*10)+rem;
            n /=10;
        }
        return res;
    }
}
