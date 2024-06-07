package 메서드_2예제;

public class 메서드예제_9 {
    public static void main(String[] args) {
        System.out.println(test9(9));
    }

    //한 정수를 매개변수로 받아, 1부터 매개변수로 받은 수까지 중
    // 홀수의 합을 리턴하는 메소드를 선언하고 사용해보세요.


    public static int test9(int num){
        int sum = 0;
        for (int i = 1; i < num + 1; i++){
            if (i % 2 == 1){//홀수
                sum = sum + i;
            }

        }

        return sum;
    }
}
