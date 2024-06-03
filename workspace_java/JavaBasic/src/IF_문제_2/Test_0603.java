package IF_문제_2;

import java.util.Scanner;

public class Test_0603 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // If_switch 3번문제

        System.out.print("첫번째 수 :");
        int num1 = sc.nextInt();

         System.out.print("두번째 수 :");
        int num2 = sc.nextInt();

        System.out.print("연산자 :");
        String oper = sc.next();
        //문자는 String, next사용

        if(oper.equals("+")){ // x      +      y
            System.out.println(num1 + " " + oper + " " + num2 + " = " + (num1 + num2));
        }

        else if(oper.equals("/")){

            System.out.println(num1 + " " + oper + " " + num2 + " = " + (num1 / (double)num2));
                                                        //정수+정수=정수      (실수)로 변경
        }

        else if(oper.equals("*")){
            System.out.println(num1 + " " + oper + " " + num2 + " = " + (num1 * num2));
        }

        else if(oper.equals("-")){
            System.out.println(num1 + " " + oper + " " + num2 + " = " + (num1 - num2));
        }

        else{
            System.out.println("연산자를 잘못 입력하였습니다");

        }


    }
}
