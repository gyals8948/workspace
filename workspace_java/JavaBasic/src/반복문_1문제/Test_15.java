package 반복문_1문제;

import java.util.Scanner;

public class Test_15 {
    public static void main(String[] args) {

    //의의 정수를 입력받아 1부터 입력받은 수까지 중
    // 짝수의 개수를 구하여라. while문 사용

        Scanner sc = new Scanner(System.in);


        System.out.print("정수 입력 : " );
        int num = sc.nextInt(); // num = 10;

        int i = 1;
        int cnt = 0;

        while (i < num + 1 ){
                // == (1 < 11)
            if (i % 2 == 0){
                cnt++;
            }
            i++;


        }
        System.out.println(cnt);






    }
}
