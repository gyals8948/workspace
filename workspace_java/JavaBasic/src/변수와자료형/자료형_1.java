package 변수와자료형;
//★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★
//자바는 크게 기본 자료형과 참조 자료형으로 데이터의 형태를 구분함.
//자바에서 기본 자료형은 총 8개.
//참조 자료형은 무한대.

//자료형 == 데이터의 형태(숫자, 문자)

//★★★★★★★★★★★★ 자료형이 다르면 데이터 저장 불가★★★★★★★★★★★★

//★★★★★★★★★★★★★★★★★★★★★★★★★★★★
//기본 자료형(소문자)

//정수(정수를 담을 수 있는공간) 타입: byte, short, ★int, long
//실수(소수점-0~1사이) 타입: float, ★double
//논리 타입: boolean (true, false만 들어감)
//문자 타입: char

//*******************
//문자열 타입(문자열데이터를 저장하는)
//== ★String ★★★기본 자료형이 아님 참조자료형★★★

public class 자료형_1 {
    public static void main (String[]args){

        byte n1 = 100;
        //byte 범위 초과로 오류 == byte n2 = 1000;

        int n2 = 100;

        // 오류 int n4 = 10.6;
        double n3 = 10.5;


        //주의사항 : ★boolean은 쌍따옴표 없음
        boolean b1 = true;
        boolean b2 = false; //false에 쌍따옴표 사용하면 그냥 문자로 인식


        //문자열(문자의 나열, 0개 글자 이상 + 쌍 따옴표로 감싸야 함 )
        String s1 = "java";
        String s2 = "false";
        // ★★ String s3 = false; 자료형이 다르면 오류★★★★★
        //String s3 = 'java'



        //★문자(한 글자 + 홀 따옴표로 감싸야 함)
         char c1 = 'j';
            char c2 = 65;
            String aaa = "A";

        char c3 = 'A';
        int c4 = c3;


        System.out.println("c1 = " + c1);
        System.out.println("c2 = " + c2);

        System.out.println("c3 = " + c3);
        System.out.println("c4 = " + c4);







    }
}
