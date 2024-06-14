package collection.list;

import java.util.ArrayList;
import java.util.List;

public class List_1_Test_4 {
    public static void main(String[] args) {
        //리스트에 1~100까지의 랜덤한 정수를 10개 넣어보자.
        // 그 후 저장된 데이터 중 짝수의 개수와 모든 짝수를 출력하는 프로그램을 만드세요.
       // (Math.random()이라는 메소드는 0 <= x < 1의 실수를 리턴)

        List<Integer>list = new ArrayList<>();



        for(int i = 0; i <= 10 ; i++){

            int rand = (int)(Math.random() * 100 + 1 );
                        //1부터 100까지 랜덤한수를 rand에 저장
            list.add(rand);

        }

        //리스트에 저장된 짝수의 개수 및 모든 짝수 출력
            int cnt = 0;
            //짝수의 개수가 저장될 변수
        for (int e : list){
            //list에 저장된 수 하나하나 를 int e 에 저장

            if (e % 2 == 0){
                cnt++;
                //짝수의개수 cnt

                System.out.println(e);
                //짝수의 개수만큼 출력 = 반복문 안에서 출력


            }
        }

        System.out.println("cnt : " + cnt);

    }
}
