package 출력문;


public class Exam3 {
    public static void main(String[] args){

        //★문자열은 "반드시" 쌍따옴표에 감싸서 작성★
        System.out.println("안녕하세요");
        System.out.println("안녕하세요");
        //★숫자는 쌍따옴표(")에 깜싸지 않는다★
        //(") 쌍따옴표가 붙은 숫자는 문자열로 취급하여 연산(계산)이 불가능하다
        System.out.println(10);
        //소괄호 안의 내용이 연산 가능하면 연산 결과가 출력
        System.out.println(10 + 10);
        //문자끼리의 합은 문자를 연결
        System.out.println("java" + "hello");
        //숫자와 문자의 합은 숫자를 문자로 간주하고 나열
        System.out.println(10 + "java");
        //10java

        System.out.println(10 + 20 + "java");
        //30java

        System.out.println(10+"java"+20);
        //10java20

        System.out.println(5+ "java" + 5*10);
        //5java50

        System.out.println(10 > 5);
        System.out.println(10 < 5);

        System.out.println(1 == 1);
        // == 같다는 뜻 '=는 같다가 아님'

        System.out.println(1 != 1);
        // != 다르다는 뜻




    }
}
