package dsa;

public class NumberLineJumps {

    static String check(int x1,int x2,int v1,int v2){

        return ((x1-x2) % (v2-v1) == 0) ? "Yes" : "No";
    }

    public static void main(String[] args) {
        System.out.println(check(0,2,5,3));
    }
}
