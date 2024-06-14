package object;

public class ObjectTest {
    public static void main(String[] args) {


        //객체생성
        Person p1 = new Person();
        p1.name = "java";
        p1.age = 20;


        Person p2 = new Person();
        p2.name = "java";
        p2.age = 25;
        System.out.println(p1.equals(p2));

        //toString() : 데이터를 문자열로 표현.
        //출력문에 객체명만 넣으면 자동으로 객체의 toString()메서드가 호출된다.
        System.out.println(p1.toString());
        System.out.println(p1);

        //equals() : 매개변수로 들어온 데이터와 현재 데이터가 같은지 판단
        //데이터마다 같다는 기준이 다르기 때문에 기준을 개발자가 재정의해서 사용한다.
        // p1과 p2가 같은지 물어보는것
        p1.equals(p2);











        //object 클래스
        //모든 클래스의 부모클래스
        //모든 클래스에서는 object 클래스의 메서드를 사용 할 수 있다.
        //다향성 개념(부모클래스로 자식클래스의 객체생성가능) 에 따라서
        //object클래스는 모든 클래스의 객체를 생성할 수 있다


        //toString() 메서드의 활용법

        //String 클래스
        //String 클래스는 문자열과 관련된 기능이 정의된 클래스.
        //문자열과 관련된 메서드를 String클래스에서 적절하게 사용(인터넷에서 검색해서 사용해라, 외우기에는 너무 많은 양)


        //interface
        //추상메서드(메서드의 몸통이 없는 메서드)만 존재
        //public void aaa();
        //멤버변수, 생성자 없음 오로지 추상클래스만 작성 가능하다(※입문기준)
        //생성자가 없기 때문에 객체생성을 통해 사용하는 것이 아니다.
        //interface는 클래스에 얹혀서(클래스가 있어야)사용 해야한다(생성자, 멤버변수가 없어서)
        //class 클래스명 implements 인터페이스명{}
        //interface를 구현하는 클래스는 (윗줄 2번째 클래스명)는 반드시 interface 정의된 모든
        //추상메서드를 구현(메서드의 몸통을 만들어야 한다)해야 한다.
        //interface를 구현한 클래스의 생성자 호출을 통해 interface형 객체를 생성 할 수 있다.
























    }
}
