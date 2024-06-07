package 일곱_메서드;

public class 메서드_5 {
    public static void main(String[] args) {
        int result = getSum(10, 20); //
        System.out.println(result);
        //     ↕ 같은 코드를 간소화
        System.out.println(getSum(10,20));

    }

    //매개변수로 전달된 두 정수의 합을 리턴(외부에서 받아온 것을 밖으로 다시 돌려줌) 하는 메서드.(출력아님)
    public static int getSum(int a, int b){
        return a + b; //(정수 + 정수 = 정수 - > void로 실행 후 int로 변경)
    }



}
