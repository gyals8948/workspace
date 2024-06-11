package class_basic.man;

import class_basic.car.Phone;

import javax.crypto.spec.PSource;

public class Man {

    //1. Man 클래스는 이름, 나이, 주소를 멤버로 가지고 있다. 모든 멤버를 선언하세요.
    //2. 멤버 모두의 값을 초기화 할 수 있는 메소드를 만드세요,
    //3. 멤버 각각의 값을 변경하는 메소드를 3개를 만드세요.
    //4. 각 멤버의 값을 리턴하는 메소드를 3개 만드세요.
    //5. 멤버의 모든 정보를 출력하는 메소드를 만드세요.
    //6. Man 클래스로 객체를 만들어 위에서 만든 메소드가 잘 작동되는지 테스트하세요.
    //값을 모를 때는 매개변수로 받는다
//----------------------------------------------------

    //getter : 멤버변수 각각의 값을 return 받는 메서드
    //getter의 이름은 get변수명으로 반드시 지정해야함
    //get 얻다 - > return 값을 돌려주다


    //setter : 멤버변수 '각각의 값을 변경'하는 메서드를 세터(setter) 라고 함
    //setter의 이름은 set변수명으로 반드시 지정해야 함
    //setter - 설정 -> setting  ==   name = name;




    private String name;
    private int age;
    private String addr;
    //private 는 같은 클래스 내에서만
    //사용할 수 있다(잠금장치같은것)

    //모든 값을 변경할 수 있는 생성자
    public Man(String name, int age, String addr) {
        this.name = name;
        this.age = age;
        this.addr = addr;
        // --- 2번 --

    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public  void printMan(){
        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age);
        System.out.println("주소 : " + addr);

    }

}
