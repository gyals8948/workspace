package 메서드_심화;

public class 심화_6 {
    public static void main(String[] args) {
        //4. 정수 하나를 매개변수로 받아,
        // 매개변수가 짝수면 true,
        // 홀수면 false를 리턴하는 메소드를 만들고 활용해보자.
        System.out.println(test3_5(5));

    }
    public static boolean test3_5(int num){

        return num % 2 == 0 ? true : false;
        // ↕ 같은 코드
        // return num % 2 == 0;
    }
}
