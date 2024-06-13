package object;

public class TvTest {
    public static void main(String[] args) {

        Tv tv = new Tv();

        //객체명, 변수명,    객체명,메서드명 으로 변수와 메서드 호출 가능
        //객체명 만 (.)찍고 사용
        System.out.println(tv.modelName);
        tv.powerOn();

        //Object 클래스는 모든 클래스의 부모클래스다
        //자료형이 다르면 데이터 저장이 불가능하다.
        //다형성에 의해 부모클래스로 자식클래스 객체를 저장할 수 있다.
        Object o1 = new Tv();
//        Object o2 = new








    }

}
