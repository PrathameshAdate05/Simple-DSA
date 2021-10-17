//Write a Program to Find the Number of Vowels, Consonants,
//Digits and White Spaces in a String

package Strings;

import java.util.Scanner;

public class Q2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String :");
        String s = sc.nextLine();
        count(s);
    }

    private static void count(String s) {
        char[] chars = s.toCharArray();

        int vowels = 0;
        int consonants = 0;
        int digits = 0;
        int spaces = 0;

        for (int i=0; i<chars.length; i++){
            if(chars[i] == 'a' || chars[i] == 'e' || chars[i] == 'i' || chars[i] == 'o' || chars[i] == 'u'){
                vowels++;
            }
            else if(chars[i] == '0' ||chars[i] == '1' ||chars[i] == '2' ||chars[i] == '3' ||chars[i] == '4' ||chars[i] == '5' ||chars[i] == '6' ||chars[i] == '7' ||chars[i] == '8' ||chars[i] == '9'){
                digits++;
            }
            else if(chars[i] == ' '){
                spaces++;
            }
            else {
                consonants++;
            }
        }
        System.out.println("\nVowels :"+vowels+"\nConsonants :"+consonants+"\nDigits :"+digits+"\nSpaces :"+spaces);
    }
}
