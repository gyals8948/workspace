package 메서드_심화;

public class 심화_7 {

    //6. 정수형 배열을 매개변수로 받아 배열의 모든 요소 중
    // 최대값을 리턴하는 메소드를 만들고 호출해보세요.
    public static void main(String[] args) {
        int[] arr = {1,7,5,3,2};
        int max = test3_6(arr);
        System.out.println(max);

    }
    public static int test3_6(int[] array){// 1 7 5 3 2 라고 가정하고 진행ㄱ

            int max = 0;

        for (int i = 0; i < array.length; i++){
            if (max < array[i]){
            // 배열 max값보다 크면 값을 바꾸고 적으면 넘어가는 식으로 진행
                max = array[i];


            }
        }
        return max;
    }

}
