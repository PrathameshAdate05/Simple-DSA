package Array;

import java.util.ArrayList;
import java.util.List;

public class SparseArrays {


    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        List<String> queries = new ArrayList<>();

        strings.add("def");
        strings.add("de");
        strings.add("fgh");
//        strings.add("xzxb");

        queries.add("de");
        queries.add("lmn");
        queries.add("fgh");

        System.out.println(calculate(strings,queries));

    }

    private static List<Integer> calculate(List<String> strings, List<String> queries) {

        List<Integer> res = new ArrayList<>();
        int count=0;

        for (int i=0;i<queries.size();i++){
            for (int j=0;j<strings.size();j++){
                if(queries.get(i) == strings.get(j)){
                    count++;
                }
            }
            res.add(count);
            count=0;
        }
        
        return res;
    }
}
