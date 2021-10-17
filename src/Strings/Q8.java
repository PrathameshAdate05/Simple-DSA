package Strings;

import java.util.List;

public class Q8 {

    public static void main(String[] args) {

        String s = "Prathamesh Adate";

        System.out.println(count(s));
    }

    private static int count(String s) {

        List<String> list = List.of(s.split(" "));

        String[] arr = s.split(" ");
//        return list.size();

        return arr.length;
    }
}
