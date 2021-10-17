package dsa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CutTheSticks {

    public static void main(String[] args) {
       List<Integer> list = new ArrayList<>();
       list.add(5);
       list.add(4);
       list.add(4);
       list.add(2);
       list.add(2);
       list.add(8);

        getSticks(list);
    }

    private static void getSticks(List<Integer> list) {


        Collections.sort(list);
        int min = list.get(0);
        System.out.println(list.size());
        for (int i=0;i<list.size();i++){
            if(list.get(i) > min){
                min = list.get(i);
                System.out.println(list.size()-i);
            }
        }

    }
}
