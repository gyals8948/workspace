package Interface;



//Wrap 클래스 : 기본 자료형을 클래스로 표현한 class
//Wrap 클래스는 기본 자료형처럼 사용하면 된다.
//int의 클래스화 : Integer
//double 클래스화 : Double
//boolean -> Boolean
//float(실수) -> Float


public class BoxTest {
    public static void main(String[] args) {
        //정수 10을 클래스화
        Integer a =Integer.valueOf(10);
        Integer c = 10;
        int d = 10;

        Box b = new Box();
        b.setBox(10); //10을 알아서 Integer로 변환해줌



    }


}
