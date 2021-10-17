//Write a Program to Make a Simple Calculator to Add, Subtract,
//Multiply or Divide Using Switch case
//The program should takes an arithmetic operator (+, -,
//*
//, /) and
//two operands from a user and performs the operation on those
//two operands depending upon the operator entered by the user.

package Switch;

import java.util.Scanner;

public class Q1 {

    static void calculator(int a,int b,String  operator){
        switch (operator){
            case "+": System.out.println(add(a,b));
                        break;
            case "-": System.out.println(sub(a,b));
                        break;
            case "*": System.out.println(mul(a,b));
                        break;
            case "/":System.out.println(div(a,b));
                     break;
            default:
                System.out.println("Enter valid operator..!!");
        }
    }

    static int add(int a,int b){
        return a+b;
    }
    static int sub(int a,int b){
        return a-b;
    }
    static int mul(int a,int b){
        return a*b;
    }
    static int div(int a,int b){
        return a/b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("+ - * /");
        System.out.println("Enter operator for operation from the above:");
        String operator = sc.next();
        if(operator != "+" && operator!="-" && operator != "*" && operator!="/"){
            System.out.println("Enter valid operator..!!");
            System.exit(0);
        }
        System.out.println("Enter two no :");
        int a = sc.nextInt();
        int b = sc.nextInt();
        calculator(a,b,operator);

    }
}
