package 배열_2예제;

import java.lang.reflect.Array;
import java.util.Arrays;

public class 배열예제2_8 {
    public static void main(String[] args) {


        // ★ 시험에 그대로 나옴 ★
        //간단한 로또번호 생성기를 만들어보자.
        // 길이가 6인 정수형 배열을 생성하고,
        // 배열의 모든 요소에 1에서 45까지의 랜덤한 정수를 넣어보자.
        // 그리고 배열의 모든 요소를 출력해보자.(1과 45를 포함하고, 중복값은 허용한다.)



                        //0.0 <= x < 1.0 실수

//                int r = (int)(Math.random() * 45 + 1);
//
//                System.out.println(r);







        int[] lotto = new int[6];


                for (int i = 0; i < lotto.length; i++){
                    lotto[i] =  (int)(Math.random() * 45 + 1);
                }

                    System.out.println(Arrays.toString(lotto));











    }
}
