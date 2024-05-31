package 변수와자료형;

/*
    * 변수는 데이터를 저장하기 위한 공간
    * 변수 사용을 위해서는 반드시 변수를 선언부터 해야한다
    * 변수의 선언 문법은 ★[자료형 변수명;]★
    * 변수는 원하는만큼 개수 제한없이 선언 가능
    * 변수 각각의 이름은 중복 불가(대,소문자 구분함)
    * 하나의 변수에는 하나의 값만 저장가능
    * ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
    * 변수명의 명명법
    * 변수는 소문자로 선언(관례)
    * 변수는 예약어(문법적으로 미리 사용 중인 것 ex) int int;), 지정어를 사용할 수 없음
    * 변수는 한글로 선언 가능하지만 영어로 사용
    * 변수의 이름은 직관적인 것으로 선언
    * 복합어(합성어)의 변수는 camelCace 기법으로 선언
    * ex)studentNumber -> studentNumber(중간 단어 첫 글자에 대문자), student_Number (언더바)
    * */


public class 변수_2 {

    public static void main(String[] args) {
        //정수를 저장할 수 있는 변수num1을 선언   }
        int num1 ;

        //정수를 저장할 수 있는 변수num2을 선언   }
        int num2 ;

        //num1 변수에  정수 10을 저장   }
        num1 = 10;
        //num2 변수에  정수 20을 저장   }
        num2 = 20;

        //num3라는 정수를 저장할 수 있는 변수 선언
        int num3;

        //num3에는 num1 과 num2 변수가 가진 값의 합을 저장
        num3 = num1 + num2;

        //num1, num2, num3 각각의 변수에 저장된 값을 출력
        System.out.println("num1 = " + num1);
        System.out.println("num1 = " + num2);
        System.out.println("num1 = " + num3);











    }
}
