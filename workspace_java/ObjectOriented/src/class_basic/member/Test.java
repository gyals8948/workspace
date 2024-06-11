package class_basic.member;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("첫번째 수 : ");
        int a =sc.nextInt();
        System.out.print("두번째 수 : ");
        int b =sc.nextInt();
        System.out.print("연산자 : ");
        String oper =sc.next();

        switch (oper){
            case "+" :                         //(연산자에 +가 들어있으면 이라는 뜻)
                Add add = new Add();
                add.setValue(a, b);
                System.out.println(a + " + " + b + " = " + add.calculate());
                break;
            case "-" :
                Sub sub = new Sub();
                sub.setValue(a, b);
                System.out.println(a + " - " + b + " = " + sub.calculate());
                break;

            case "*" :
                Mul mul = new Mul();
                mul.setValue(a, b);
                System.out.println(a + " * " + b + " = " + mul.calculate());
                break;

            case "/" :
                Div div = new Div();
                div.setValue(a, b);
                System.out.println(a + " / " + b + " = " + div.calculate());
                break;

             default :                          //(나머지는)
                 System.out.println("연산자를 잘못 입력하였습니다.");
        }

    }
}
