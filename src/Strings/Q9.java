package Strings;

import java.util.Locale;

public class Q9 {

    public static void main(String[] args) {

        String s = "cpp string exercises";

        capitalize(s);

    }

    public static void capitalize(String s){

        String[] arr = s.split(" ");

        String res = "";
        for (String i:arr){

            String first = i.substring(0,1);
            String after = i.substring(1);
            res += first.toUpperCase(Locale.ROOT)+after+" ";
        }

        System.out.println(res);
    }
}
