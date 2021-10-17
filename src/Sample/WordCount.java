package Sample;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class WordCount {

    public static void main(String[] args) {
        String s = "cat batman latt matter cat matter cat cat latt latt";
        int count = 3;

        getWords(s,count);

    }

    private static void getWords(String s, int count) {

        List<String> list = new ArrayList<>();
        list = List.of(s.split(" "));
        System.out.println(list);
        HashSet<String> hashSet = new HashSet<>();
        int counter=0;

        for (int i=0;i<list.size();i++){
            for (String value : list) {
                if (list.get(i).equals(value)) {
                    counter++;
                }
            }
            if (counter >= count)
                hashSet.add(list.get(i));
            counter = 0;
        }
        String res = String.valueOf(hashSet).toString();
        System.out.println(res);
    }
}
