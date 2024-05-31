package 세번째_연산자;

public class 연산자_3{
    public static void main(String[]args){


    //★증감 연산자★
    int a= 5;

    ++a; // a의 값을 1증가

        System.out.println(a); //6

        a++; // a의 값을 1증가 ++a; 와 같음

        System.out.println(a); //7

        --a; // a의 값을 1감소 a--; 와 같음
        System.out.println(a); //6
        a--;
        System.out.println(a); //5

        System.out.println(); //한줄 개행


        //증감 연산자를 단독(한 줄에 증감 연산자만 사용 했는가)으로 사용하는지
        //다른 코드와 함께 사용하는지에 따라서 결과가 달라짐.
        //다른 코드와 함게 사용하는 경우
        // ++a : 먼저 1증가 후 다른 코드를 실행
        // a++ : 다른 코드를 전부 시행 후에 마지막에 1증가

        int num1 = 10;
        int result = 10 + num1++;
        System.out.println(result);
        System.out.println(num1);



    }
}
