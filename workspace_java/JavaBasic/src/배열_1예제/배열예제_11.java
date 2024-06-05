package 배열_1예제;

public class 배열예제_11 {
    public static void main(String[] args) {

    //  1, 2, 3, 4, 5, 6 ,7 ,8 로 초기화된 배열을 만들고,//
    //  배열의 요소 중 짝수의 개수를 구하는 프로그램을 만들어라.


//
//        int[] arr = {1,2,3,4,5,6,7,8};
//          int cnt = 0;
//          for(int i = 0 ; i< arr.length; i++){
//
//            if (arr[i] % 2 == 0){
//                 cnt++;
//
//            }
//        }
//
//
//          System.out.println(cnt);


             int[] arr1 = {1,2,3,4,5,6,7,8};
             int cnt = 0;

                for (int e :arr1){
                    //순차적으로 e에 저장

                    if (e % 2 == 0){
                        cnt++;
                    }

                }

        System.out.println(cnt);















//              내가 한 것 (정상출력)
//
//            int[] arr = {1,2,3,4,5,6,7,8};
//            int sum = 0;
//
//            for (int i = 0; i < 8;  i++){
//
//                if (i % 2 == 0){
//
//
//                    sum = sum + 1; // 갯수를 하나씩 세는 것 헷갈리지 않게 변수명을 cnt로
////                    sum = sum + i; // 조건에 맞는 숫자의 합
//
//                }
//
//            }
//                System.out.println(sum);
//            // for문 안에 넣으면 반복 출력되기 때문에 밖에서 출력
//
//


    }
}
