package dsa;

import java.util.ArrayList;
import java.util.List;

public class BeautifulDaysAtTheMovies {

    public static void main(String[] args) {
        int i=123 ,j=456789 ,k=189;

//        System.out.println(countDays(i,j,k));
            countDays(i,j,k);
    }

    static void countDays(int ii,int j,int k){
        int count=0;

        for (int i=ii;i<=j;i++) {

            if(Math.abs(i-reverse(i))%k == 0){
                count++;
            }

        }
        System.out.println(count);
    }

    static int reverse(int n){
        int res = 0;

        while (n!=0){
            int rem = n%10;
            res = res*10+rem;
            n/=10;
        }

        return res;
    }
}
