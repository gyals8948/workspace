package 반복문_1문제;

public class Test_11 {

    public static void main(String[] args) {


        int i  = 1;
        int cnt = 0;


        // 1 ~ 100까지 차례로 반복해서 해당 숫자가 3의 배수인지 확인한다.

        while (i < 101){
            if(i % 3 == 0){
                cnt++;

            }

            i++;
        }

        System.out.println(cnt);














        // 내가 한 거

//        int i = 1;
//
//
//
//        while (i <= 100 ){
//
//
//            if (i % 3 == 0){
//
//                System.out.println(i);
//            }
//
//            i++;
//
//        }



    }


}
