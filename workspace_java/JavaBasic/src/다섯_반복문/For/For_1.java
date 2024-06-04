package 다섯_반복문.For;

public class For_1 {

    public static void main(String[] args) {


//        int i = 1;
//
//        while (1 < 11){
//            System.out.println(i);
//            i++;
//
//        }


//        //////////////////////////////////////////////
//        for (int i = 1; 1 < 11 ; i++){
//
//            // (초기값; 반복조건; 장치)  /////마지막 ; 은 생략
//
//            System.out.println(i);
//            // for문(반복문) 해석 순서  1. int  2.반복조건  3.출력  4.i++;(장치)
//            // - 1번은 최초 1번만 마지막은 2번으로 마무리  ★  나머지 반복
//        }




        //1~10까지 합

        int sum = 0;
        for(int i = 1; i < 11; i++){
            sum = sum + i;

            //순서가 중요 ★  1. int i = 1;(최초만 1회)  | 2. i < 11;
            //3. sum = sum + i; 4. i++ | 5. 조건 만족할 때 까지 234 반복
            //★ 매우 중요
         }

        System.out.println(sum);

        //★반복 조건에 만족 하지 못 해서 밖으로 나와서 출력★








    }
}
