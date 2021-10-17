import java.util.*;

public class MulTable{
    public static void main(String args[]){

        long i,j,mul=0;

        for(i=1;i<=10;i++){
            for(j=11;j<=20;j++){
                
                mul=i*j;
                System.out.print(" "+mul);
            }
            System.out.println();
        }
    }
}