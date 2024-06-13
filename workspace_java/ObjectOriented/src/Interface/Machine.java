package Interface;

public interface Machine {
    //첫글자가 대문자 : class, interface 끗


    //interface는 메서드의 이름만 존재한다.
    //멤버변수, 생성자 없음 -> 생성자가 없어서 객체 생성 불가능
    //interface는 class에 얹혀 살아야 함.

    //class에 interface를 적용하는 문법(class 선언시 적용)
    //public class 클래스명 implements 인터페이스명
    //  ↑ 위의 코드를 해석하면
    // 'interface를 구현한 class를 생성하겠다'
    //  interface 안의 추상메서드는 public을 생략하면 자동으로 public이 붙는다.
    // interface를 구현한 class의 생성자로 interface 객체 생성

    public void takecoffee(); //추상메서드 | 이런 기능이 있다는 뜻
    public void takeMilk();



}
