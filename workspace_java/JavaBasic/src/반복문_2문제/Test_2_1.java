package 반복문_2문제;

public class Test_2_1 {
    public static void main(String[] args) {

        //1. 1이상 100 미만의 정수 중에서 1 ~ 99
        // 7의 배수와 9의 배수를 출력하는 프로그램을 작성하여라.
        //단, 7의 배수이면서 동시에 9의 배수인 수는 한 번만 출력하여야 한다. = 페이크

        for (int i = 1; i < 100; i++){
            if (i % 7 == 0 || i % 9==0)
                System.out.println(i);

            //63
        }




        }
    }
