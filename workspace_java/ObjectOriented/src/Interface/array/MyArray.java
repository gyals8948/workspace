package Interface.array;

public class MyArray implements MyArrayUtil {
    public static void main(String[] args) {

        MyArray Ar = new MyArray();
    }

    //값이 없으면 임시로 지정

    //arr1 = {1,2,3}
    //arr2 = {4,5,6}
    public double getTwoArrayAvg(int[] arr1, int[] arr2) {
        //arr1배열의 합
        int sum1 = 0;
        int sum2 = 0;

        for(int i = 0 ; i < arr1.length ; i++){
            sum1 = sum1 + arr1[i]; // arr1의 합을 먼저구함
        }

        //arr2배열의 합
        for(int i = 0 ; i < arr2.length; i++){
            sum2 = sum2 + arr2[i];
        }



        return ((double) sum1 + sum2) / (arr1.length + arr2.length);
        // 정수 + 정수  / 정수 + 정수 = 실수가 필요. 정수에서 변경이 필요함

    }


    public boolean inEvenArray(int[] array) {
        return false;
    }
}
