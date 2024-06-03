package IF_문제_심화;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("1 ~ 99 사이의 정수를 입력하시오.>>");

        int num = sc.nextInt(); // 13 짝 36 짝짝 12는 아님 (369게임)

        // 십의 자리 - 10으로 나누기
        int tens = num / 10;

        //일의 자리 -  나누기 10하고 나머지
        int ones = num % 10;

        //박수의 횟수
        int clapCnt = 0;

        //십의 자리가 3, 6, 9 인지 조사 // 십의자리가 3, 6, 9 이면 clapCnt를 1증가
        if (tens  == 3 || tens == 6 || tens == 9){
            //증감 연산자 ++clapCnt;  clapCnt = clapCnt + 1;  clapCnt += 1;  <== 1씩증가
            clapCnt ++;




        }

        //일의 자리가 3, 6, 9 인지 조사 // 일의 자리가 3, 6, 9 이면 clapCnt를 1증가

        if (ones  == 3 || ones == 6 || ones == 9){
                clapCnt++;
                // else if를 사용하지 못 하는 이유 위에 값을 만족 할 때 아래쪽은 계산하지x 때문

            //clapCnt의 값에 따라 출력

            switch(clapCnt){
                case 1:
                    System.out.println("박수 짝");

                case 2 :
                    System.out.println("박수 짝짝");

                    
                    break;
            }

        }

    }
}
