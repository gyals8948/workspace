package 여섯_배열;

public class 배열_3 {
    public static void main(String[] args) {
        // 정수를 5개 저장할 수 있는 배열 arr1을 생성해보자
        int[] arr1 = new int[5]; // int 배열= 값을 안넣으면 0,0,0,0,0이 공간에 저장됨
        // -> 하나의 공간을 "요소" 라고 함 =
        // 5개의 ★공간에 첫번째 요소를 0번째, 2번째를 첫번째 요소 라고함(0 부터 세기 때문에)★

        System.out.println(arr1); // 이상한 값이 나옴


        //배열에 저장된 값을 출력할 때는 배열의 요소로 접근한다.
        System.out.println(arr1[0]);
//        System.out.println(arr1[5]);   ->오류->  5는 6번째 == 존재하지 않음

        //arr1의 0~4번째 요소까지의 모든 값을 출력 ->5개
        for (int i = 0; i < 5; i++ ){ // i < (5) 배열의 공간의 개수(공간의 크기) -> 그래서 (arr2.length)를 사용함
            System.out.println(arr1[i]);
        }


        System.out.println();

        // 배열의 크기 == 공간의 개수 (arr2.length)
        int[] arr2 = new int[2];
        int[] arr3 = new int[5];
        int[] arr4 = new int[10];

        // 배열명, length 를 사용하면 배열의 크기를 알 수 있다
        System.out.println(arr2.length); //(arr2.length) arr2의 배열의 크기


















    }
}
