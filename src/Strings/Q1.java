//Write a Program to Find the Frequency of given Character by
//user in a String

package Strings;

import java.util.Scanner;

public class Q1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String :");
        String s = sc.nextLine();

        System.out.println(findFrequency(s));
    }

    private static int findFrequency(String s) {
        char[] charArray = s.toCharArray();
//        return charArray.length;
        return s.length();
    }
}
