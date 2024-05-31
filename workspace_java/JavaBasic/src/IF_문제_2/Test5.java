package IF_문제_2;

import java.util.Scanner;

public class Test5 {
    public static void  main(String[]args){
        Scanner sc = new Scanner(System.in);

//
//        6. 세 정수를 선언하고 scanner로 값을 입력받는다. 그리고 세 수를 큰 순서대로 출력하여보라.(난이도 높음)
//        -출력예시-
//                첫번째 수 : 10
//        두번째 수 : 30
//        세 번째 수 : 20
//        30 > 20 > 10



        int max; // 큰 수를 저장
        int min; // 작은 수를 저장



        System.out.print("첫번째 수 =");
        int num1 = sc.nextInt();

        //println - 자리개행 꼭 확인 할 것

        System.out.println("두번째 수");
        int num2 = sc.nextInt();



        if(num1 > num2){
            max = num1;
            min = num2;
        }

        else{
            max = num2;
            min = num1;

        }
            System.out.println(max + " > " + min) ;

        







//        if(num1 > num2){
//            System.out.println(num1 + " > " + num2);
//        }
//        else {
//            System.out.println(num2 + " > " + num1);
//        }


    }
}
