
//Write a Program to Find ASCII Value of a Character

package basic;

import  java.util.Scanner;

public class Q7 {

    static int findAscii(char character){
        return (int)character;
    }

    static void printAllAscii(){
        for(int i=0;i<=255;i++){
            System.out.println(i+" = "+(char)i);
        }
    }

    public static void main(String[] args) {
        System.out.println(findAscii('a'));
        printAllAscii();
    }


}

