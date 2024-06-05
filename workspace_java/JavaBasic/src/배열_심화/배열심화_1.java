package 배열_심화;

public class 배열심화_1 {
    public static void main(String[] args) {



        int max = 0;
        int[] array = { 1, 5, 3, 8, 2};

        // max와 array에 저장된 값을 순서대로 비교하고 바꿔버림

        //작성 위치
        for (int i = 0; i < array.length; i++){

            if (max < array[i]){
                max = array[i];




            }

        }

        System.out.println("max: " + max);


    }
}
