package dsa;

public class RepeatedString {

    public static void main(String[] args) {

        String s = "a";
        long rep = 1000000000;

        System.out.println(count(s,rep));
    }

    private static long count(String s, long rep) {



        long count=0;
        if(s.length()==1){
            return rep;
        }
        else if(s.length()==0){
            return 0;
        }

        String res = s.repeat((int)rep);

        char[] arr = res.toCharArray();
        for (int i=0;i<11;i++){
            if(arr[i] == 'a'){
                count++;
            }
        }
        return count;
    }
}
