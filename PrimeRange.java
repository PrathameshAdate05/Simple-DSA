import java.util.*;

public class PrimeRange{
    public static void main(String[] args){
        int i,j,count=0;
        int flag=0;

        for(i=1;i<=100;i++){
            if(i>1){
                for(j=2;j<=i/2;j++){
                    if(i%j==0){
                        flag=1;
                        break;
                    }
                    else
                        flag=0;
                }
                if(flag==0){
                    System.out.println(i);
                    count++;
                }
            }
        }
        System.out.println("\n"+count);
    }
}