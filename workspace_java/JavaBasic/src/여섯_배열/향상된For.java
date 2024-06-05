package 여섯_배열;

public class 향상된For {

    public static void main(String[] args) {

        //for-each 문 : 배열에서 값을 읽을 때 사용
        int[] arr1 = {3, 7, 10, 5, 1 };
        for (int i = 0;  i< arr1.length; i++){

            System.out.println(arr1[i]);
        }

        System.out.println();

        for (int e : arr1){ //int e = 3; int e = 7; int e = 10; 이런 식으로 순차적으로 반복
            //           (int e : arr1)
            // 왼쪽(저장할 변수)  : 우측(반복을 뭘로 얼마나 돌릴 것 인가)먼저 해석
            // 왼쪽항 : 배열에서 데이터를 하나씩 차례로 뺏을 때 저장할 변수
            // 오른쪽항 : 반복할 배열
            // 오른쪽을 순차적으로 왼쪽에 대입해서 해석


            System.out.println(e);

        }


        System.out.println();


            double[] arr2 = {1.1, 2.2, 3.3};
            for (double c : arr2){

                System.out.println(c);

            }




        System.out.println();


        String[] arr3 = { "a", "b", "c", "d"};

        for (String k : arr3){


        }





    }
}
