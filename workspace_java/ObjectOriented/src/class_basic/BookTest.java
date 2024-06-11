package class_basic;

public class BookTest {
    public static void main(String[] args) {
        Book book1 = new Book("java", "kim", 1000); //매개변수 정보가 다르기 때문에 두개 중에 매개변수가 없는 쪽으로 실행 / 매개변수 같으면 둘다 실행
        System.out.println(book1.title);

        Book book2 = new Book("python","lee" ,2000); //매개변수가 3개인 쪽으로 실행
        System.out.println(book2.title);



        Book book3 = book1;
        System.out.println(book1.title);
        System.out.println(book3.title);
        book1.title = "c++";
        System.out.println(book1.title);
        System.out.println(book3.title);


        //하나의 변수는 하나의 값만 저장 가능
        int a = 10;
        int b= a;
        a= 5;
        System.out.println(a);//5
        System.out.println(b);//10


        //기본자료형 = 클래스가 다른게아니라 참조자료형이 다르다





















        //기본자료형
        int num = 5;
    //자료형 변수명 = 값;
        int num2 = num;
        double num3 = num2; // 5.0
        //정수는 실수로 들어갈수있다 // 자동형변환

//        double num4 = 5.5;
//        int num5 = num4;  - 오류 = 실수는 정수로 들어갈 수 없다

//        int num6 = 7;
//        String a = num6; // 정수는 문자열로 들어갈 수 없다.

//        int[] arr1 = {1,3,5};
//        String[] arr2 = arr1; 오류




    }
}
