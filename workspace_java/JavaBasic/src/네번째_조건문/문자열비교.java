package 네번째_조건문;

public class 문자열비교 {

    public static void main(String[] args) {

        int x = 5;
        int y = 10;
        //byte, short, int, long
        //fload, double
        //boolean
        //char
        //기본자료형 '소문자'시작


        //문자열은 ("") 필수
        System.out.println(x == y);// 숫자비교
        String s1 = "java";
        String s2 = "python";

        System.out.println(s1 == s2); //문자열 비교가 아님
        System.out.println("1"=="1"); //문자열 비교가 아님

        String name = "kim";

        name.equals("kim");
        //name 변수의 값이 "kim"과 같습니까? 라는 뜻
        boolean result = name.equals("kim");
        System.out.println(result);


        String addr = "울산";

        if( addr.equals("울산") ){

        }









    }
}
