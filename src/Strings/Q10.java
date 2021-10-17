package Strings;

public class Q10 {

    public static void main(String[] args) {

        String s = "C++ is a general    purpose programming language";

        System.out.println(longest(s));
    }

    public static String longest(String s){

        String[] words = s.split(" ");
        String longest = "";

        for (String w:words){
            if(w.length() > longest.length()){
                longest = w;
            }
        }

        return longest;
    }
}
