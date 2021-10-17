package dsa;

import java.util.ArrayList;
import java.util.List;

public class ApplesAndOranges {

    static void countApplesOranges(int houseStartPoint,int houseEndPoint,int appleTreePos,int orangeTreePos,List<Integer> apples,List<Integer> oranges ){

        int appleCount = 0;
        int orangeCount = 0;
        for (int loc:apples){
            if(appleTreePos+loc >= houseStartPoint)
                appleCount++;
        }
        for (int loc:oranges){
            if(orangeTreePos+loc <= houseEndPoint)
                orangeCount++;
        }

        System.out.println(appleCount+"\n"+orangeCount);
    }

    public static void main(String[] args) {
        int houseStartPoint = 7;
        int houseEndPoint = 11;
        int appleTreePos = 5;
        int orangeTreePos = 15;
        List<Integer> apples = new ArrayList<>();
        apples.add(-2);
        apples.add(2);
        apples.add(1);
        List<Integer> oranges = new ArrayList<>();
        oranges.add(5);
        oranges.add(-6);

        countApplesOranges(houseStartPoint,houseEndPoint,appleTreePos,orangeTreePos,apples,oranges);
    }
}
