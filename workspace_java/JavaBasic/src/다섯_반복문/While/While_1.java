package 다섯_반복문.While;

public class While_1 {
    public static void main(String[]args){

        /*
        *
        * ~하는 동안
        * while(반복 조건){
        *  - 반복적으로 실행되는 내용작성
        *  }
        * */



        //반복 시작점
        int i = 1; // 1번 해석

        while(i <= 3){  //2번 해석 == 반복 조건
            System.out.println(1);
            i++; // 3번 실행 -> 조건을 만족할 때 까지 반복 | 1씩 추가 ++i, i = i + 1; -> 없으면 무한루프
                 // 반복을 파기 할 조건

        }

    }
}
