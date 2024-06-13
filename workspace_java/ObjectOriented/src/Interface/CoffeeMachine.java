package Interface;


//machine interface를 구현(implements) 한 CoffeeMachine class를 생성한다.
//machine interface에 정의한 메서드를 구현한 CoffeeMachine class를 생성한다.

//interface를 구현한 class는 멤버변수, 생성자 등 나머지 부분은 클래스와 동일하게 사용

public class CoffeeMachine implements Machine{
    public void takecoffee() {
        System.out.println("커피가 나옵니다");
    }

    public void takeMilk() {
        System.out.println("우유가 나옵니다");
    }
}
