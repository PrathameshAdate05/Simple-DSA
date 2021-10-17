package dsa;

import java.util.ArrayList;
import java.util.List;

public class Grading {

    static List<Integer> roundGrades(List<Integer> grades){
        List<Integer> returnGrades = new ArrayList<>();
        int add;
        for (int i:grades){
            if(i < 38 || i % 5 <= 2){
                returnGrades.add(i);
            }
            else if(i % 5 > 2){
                add = 5 - (i % 5);
                returnGrades.add(i+add);
            }
        }
        return returnGrades;
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(73);
        list.add(67);
        list.add(38);
        list.add(43);

        System.out.println(list);

        System.out.println(roundGrades(list));
    }
}
