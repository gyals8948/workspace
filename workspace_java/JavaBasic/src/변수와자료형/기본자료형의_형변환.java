package 변수와자료형;

public class 기본자료형의_형변환 {
    public static void main(String[] args) {

        //정수는 실수에 저장 가능  | ★ 정수와 실수에만 가능
        //자동 형변환(pormotion)
        int num1 = 5;
        double num2 = num1;
        System.out.println("num2 = " + num2);

        //강제 형변환(casting)
        double num3 = 5.5;
        //int num4; = (int)num3; 오류 실수는 정수형에 저장 불가
        int num4 = (int)num3; // 실수 데이터 num3를 int로 강제 형 변환

        System.out.println("num4 = " + num4);




        // 아직 몰라도 되는 것 : 변환 (나중에 많이 씀)

//        //정수 -> 문자열 - String.valueOf
//        String bb = String.valueOf(10); // "10"
//
//        //문자열 -> 정수 - Integer.parseInt
//        int aa = Integer.parseInt("10"); // 10
//

    }
}
