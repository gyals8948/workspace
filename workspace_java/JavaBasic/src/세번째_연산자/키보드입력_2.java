package 세번째_연산자;

import java.util.Scanner;

public class 키보드입력_2 {

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);//키보드 입력받는 것

        sc.next(); // 정수를 입력 받을 때는 nextIne 문자는 next

        String r1 = sc.next(); // sc.next(); 키보드로 문자열 하나를 입력 받는 것
        System.out.println("입력받은 글 : " + r1);

       double r2 = sc.nextDouble(); // 키보드로 실수(소수)하나를 입력받음
        System.out.println("입력받은 실수 :" + r2);
    }
}
