package Strings;

public class Q6 {

    public static void main(String[] args) {

        String s = "Abcdef3z";

        System.out.println(replace(s));
    }

    private static String replace(String s) {

        s.replace("a","b");
        s.replace("p","q");
        s.replace("z","a");
        return s;
    }
}
