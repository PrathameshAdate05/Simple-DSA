package dsa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class ClimbingTheLeaderboard {

    public static void main(String[] args) {

        int[] ranked = {100 ,100 ,50 ,40 ,40 ,20 ,10};
        int[] player = {5 ,25 ,50 ,120};

        getRank(ranked,player);
    }

    private static void getRank(int[] ranked, int[] player) {
        HashSet<Integer> set = new HashSet<>();

        for (int i=0;i<ranked.length;i++){
            set.add(ranked[i]);
        }
        List<Integer> list = new ArrayList<>();
        for (int i:set){
            list.add(i);
        }
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list.indexOf(100));
    }
}
