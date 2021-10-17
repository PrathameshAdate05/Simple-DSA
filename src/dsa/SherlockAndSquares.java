package dsa;

public class SherlockAndSquares {

    public static void main(String[] args) {
        int a=24, b=49;

        findSquares(a,b);
    }

    private static void findSquares(int a, int b) {

        int count=0;
        long d=10;
        for (int i=a;i<=b;i++){
            if(i>0){
                int sroot=(int)Math.sqrt(i);
                if((sroot*sroot)==i){
                    System.out.println(i);
                    count++;
                }
            }
        }
        System.out.println(d);
    }
}
