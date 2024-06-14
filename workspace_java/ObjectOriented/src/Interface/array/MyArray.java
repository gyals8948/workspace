package Interface.array;

public class MyArray implements MyArrayUtil {
    public static void main(String[] args) {

        MyArray Ar = new MyArray();
    }

    //값이 없으면 임시로 지정

    //arr1 = {1,2,3}
    //arr2 = {4,5,6}
    public double getTwoArrayAvg(int[] arr1, int[] arr2) {
        //평균값 = 실수로 만들어야 함 -> double

        int sum1 = 0;  //arr1 배열의 합
        int sum2 = 0;  //arr2 배열의 합

        for(int i = 0 ; i < arr1.length ; i++){
            sum1 = sum1 + arr1[i]; // arr1의 합을 먼저구함
        }

        //arr2배열의 합
        for(int i = 0 ; i < arr2.length; i++){
            sum2 = sum2 + arr2[i];
        }



        return ( sum1 + sum2) / (double)(arr1.length + arr2.length);
        // 정수 + 정수  / 정수 + 정수 = 실수가 필요. 정수에서 변경이 필요함

    }

    //매개변수로 받은 배열의 모든 요소가 짝수일때만 리턴 true
    //array = {2,1,4}

    public boolean isEvenArray(int[] array) {
        // is가 붙어있으면 보통 boolean 을 사용한다 (관례느낌)

        for (int e : array){
            if (e % 2 == 1){
                //홀수
                return  false;
                //
            }

        }
        return true;
    }
}
