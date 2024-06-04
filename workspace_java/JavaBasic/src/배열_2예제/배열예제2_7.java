package 배열_2예제;

public class 배열예제2_7 {
    public static void main(String[] args) {
        //1 ~ 10(포함)의 랜덤한 정수


        //0.0(포함) 에서 1.0 실수
        //0.0 <= x < 1.0 실수를 줌
//        double rand = Math.random();

        //0.0 <= x < 1.0  * 10
        // 0.0 <= x < 10.0
        // 1.0 <=  x < 11.0
        int r  =  (int)(Math.random() * 10 + 1);
        System.out.println(r);

        int r1 = (int) Math.random() * 10 + 1;
        //괄호를 안넣으면 실수로 계산되어 무조건 0 나옴






    }
}
