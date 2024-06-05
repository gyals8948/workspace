package 배열_2예제;

public class 배열예제2_6 {

    public static void main(String[] args) {

        //1,2,3을 초기값으로 갖는 배열 arr1과 4,5,6을
        //초기값으로 갖는 arr2를 만든다. 그 후 새로운 배열 newArr을 만들어
        //arr1과 arr2의 모든 값을 복사해보자. 복사 후 newArr은
        //1,2,3,4,5,6을 가져야 한다.


        // 상수(숫자) 보다 변수로 넣는게 편하고 좋다

        int[] arr1 = {1,2,3};
        int[] arr2 = {4,5,6};

        int[] newArr = new int[arr1.length + arr2.length];

        for(int i = 0; i < arr1.length ; i++){

            newArr[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++){

            newArr[arr1.length + i] = arr2[i];
                    // a[1] = b[1] - b [1]번째 값을 a의 [1]번째 값으로
        }

        for (int e: newArr){
            System.out.print(e + " ");

        }













    }
}
