package dsa;

public class FindDigits {

    public static void main(String[] args) {

        int n=124;

        System.out.println( find(n));
    }

    private static int find(int n) {

        int count=0;
        int num=n;

        while (n != 0){
            int rem = n%10;
            if(rem != 0 && num%rem == 0){
                count++;
            }
            n/=10;
        }
        return count;
    }
}
