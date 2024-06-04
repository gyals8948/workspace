package 반복문_1문제;

import java.util.Scanner;

public class Test_16 {
    public static void main(String[] args) {


        //임의의 정수를 입력받아 1부터 입력받은 수까지 중
        //짝수의 개수를 구하여라. for문을 사용하여 풀어보아라


        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int cnt = 0;
        //갯수 셀 때

        for (int i = 1; i < num + 1; i++){

            if (i % 2 == 0){
                cnt++;


            }
            System.out.println(cnt);



        }


    }
}
