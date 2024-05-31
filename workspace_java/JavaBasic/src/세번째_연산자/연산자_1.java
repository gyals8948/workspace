package 세번째_연산자;

public class 연산자_1 {

    public static void main (String[] args){

        //산술 연산자: +, -, *, /, % (정수 / 정수 = 소수점 제외한 값),
        // % mod연산자(나머지를 구하는 연산자)

        System.out.println(10 / 4); //2
        System.out.println(10 % 4); //2
        System.out.println(10 % 3); //1

        //비교 연산자 (크기비교)
        // == (같다), != (같지 않다)
        // >(크다), >=(크거나 같다), <(작다), <=(작거나 같다)
        System.out.println(5 >= 3); // true


        //논리 연산자{맞다(참), 틀리다(거짓)}
        // x가 5보다 크고 10이하다 -> 5 < x <= 10
        //&& (그리고), || (이거나)
        // & (그리고), | (이거나)

        int x = 7;
        boolean r1 = x > 5 && x <= 10;
        // = (대입 연산자) 는 우선순위가 제일낮다
        // 우선순위가 헷갈리면 괄호를 넣어보자 ()





    }
}
