package 배열_1예제;

import java.util.Scanner;

public class 배열예제_10 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr =  new int[5];


        //배열의 크기만클 반복해서 입력 값을 배열의 각 요소에 저장
        for (int i = 0; i < arr.length; i++){

            System.out.println(i + "번째 요소 입력 : ");

            arr[i] = sc.nextInt();


        }

        System.out.println("-배열에 저장된 요소");
        for(int i = 0; i  < arr.length; i++){
            System.out.print(arr[i] + " ");
        }


        System.out.println();

        for(int e : arr){
            System.out.print(e + " ");

        }










//        System.out.println("입력 : ");
//        int sum = sc.nextInt();
//
//        int[] arr1 =  new int[5];




//        arr1[0] = sum ;
//        arr1[1] = i ;
//        arr1[2] = i ;
//        arr1[3] = i ;
//        arr1[4] = i ;

//        for (int i = 0; i < 5; i++){
//
//            arr1[i] = sum ;
//            System.out.print(arr1);
//
//        }












    }
}
