package 네번째_조건문;

import java.util.Scanner;

public class 예제_2 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        //키보드로 정수 하나를 입력 받아,
        //입력받은 정수가 짝수이면 '1'출력
        //그 밖의 숫자는 '2'출력

        //1.문자 출력
        //2.정수를 입력시키는 코드
        //3.대입식넣고
        //4.출력


        System.out.println("정수 입력");
        int num = sc.nextInt();
        //정수를 직접 입력시키겠다

        if(num % 2 == 0){
        //% 나머지를 구하는
            System.out.println(1);
        }
        else{
            System.out.println(2);
        }




    }
}
