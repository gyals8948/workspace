package 반복문_1문제;

public class Test_14 {
    public static void main(String[] args) {


        //1 ~ 100까지의 숫자 중 5의 배수인 수를
        //모두 출력하고, 5의 배수인 수의 개수도 출력

        int cnt = 0;
        //갯수를 셀 때

        for(int i = 1; i < 101; i++){

            if(i % 5 == 0){
                cnt++;
                System.out.println(i);
            }

        }
        System.out.println(cnt);
    }
}
