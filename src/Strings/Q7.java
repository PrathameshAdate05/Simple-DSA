package Strings;

public class Q7 {

    public static void main(String[] args) {

        String s = "abaa";

        System.out.println(check(s));
    }

    private static String check(String s) {

        StringBuilder stringBuilder = new StringBuilder(s);
        String rev = String.valueOf(stringBuilder.reverse());
        System.out.println(rev);
        if(s.equals(rev)){
            return "Palindrome";
        }
        else
            return "Not Palindrome";
    }
}
