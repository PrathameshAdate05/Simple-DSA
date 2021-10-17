package dsa;


import java.util.ArrayList;
import java.util.List;

public class DesignerPDFViewer {

    public static void main(String[] args) {

        int[] arr = {1 ,3 ,1, 3, 1 ,4 ,1 ,3 ,2, 5 ,5 ,5 ,5 ,5 ,5, 5 ,5 ,5 ,5 ,5 ,5 ,5 ,5, 5 ,5 ,7};

        String string = "zaba";

        count(arr,string);
    }

    static void count(int[] arr,String s){

        List<Integer> list = new ArrayList<>();
        int j=0;
        int max=0;
        for (int i=0;i<s.length();i++){
           char temp = s.charAt(i);
           max = (max < arr[temp-97] ? arr[temp-97] : max);
        }
//        for (int i=0;i<list.size();i++){
//            if(list.get(i) > max)
//                max = list.get(i);
//        }

        System.out.println(max*s.length());
    }
}
