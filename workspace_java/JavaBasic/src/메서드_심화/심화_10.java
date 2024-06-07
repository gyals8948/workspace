package 메서드_심화;

import java.util.Arrays;

public class 심화_10 {
    public static void main(String[] args) {
    //정수형 배열 하나를 매개변수로 받아 배열의 요소 중
    //홀수를 제거한 새로운 배열을 리턴하는 메소드를 만들어보세요.

        //매개변수로 넘어온 배열 요소 중 짝수의 개수를 먼저 알아야함
         //
        //제시한 배열의 크기가 정확하지 않음 /
        int[]  a = {1,2,3,4,5,6,7,8,9,10};
        int[] result = test3_9(a);
        //★ int[]  int는 다름

        System.out.println(Arrays. toString(result));


    }


    public static int[] test3_9(int[] array){//모르겠으면 숫자를 가정(대입)해보자
        //         ↑배열도 자료형이다.
        int cnt = 0;
        for(int e : array){
            if (e % 2 == 0){
                cnt++;
            }
           //   ↑  e는 배열의 번호(순서)
        }
        //짝수만 저장될 배열 생성
        int[] resultArr = new int[cnt];

        int index = 0;
            for(int i = 0; i < array.length; i++){
                if (array[i] % 2 == 0){
                  resultArr[index] = array[i]; // array[i] 를 resultArr[index] 칸에 저장
                  //0번째    //짝수
                  index++; // 짝수 2칸중에 다음칸으로 이동시킴
            }

        }
            return resultArr;
    }
}
