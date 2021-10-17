package Strings;

import java.util.List;

public class Q3 {

    public static void main(String[] args) {

        String s = "Prathamesh121@#$";

        remove(s);
    }

    private static void remove(String s) {

        String res = "";
        char[] arr = s.toCharArray();
        int j=0;

        for (int i=0;i<arr.length;i++){
            if((arr[i] >= 'A' && arr[i] <= 'Z') || (arr[i] >= 'a' && arr[i] <= 'z') ){
                arr[j] = arr[i];
                j++;
            }
        }
        res = String.valueOf(arr).substring(0,j);
        System.out.println(res);
    }
}
