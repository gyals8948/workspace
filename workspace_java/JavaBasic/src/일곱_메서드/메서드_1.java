package 일곱_메서드;

public class 메서드_1 {

    //메서드(Method) == 함수(Function)
    //메서드는 반복해서 실행하는 코드를 미리 하나의 기능으로 정의 , 기능상자
    //메서드의 사용은 크게 메서드 정의 부분과 메서드 호출 부분으로 나뉨
    //메서드를 사용 하려면 반드시 메서드 정의 후 '호출'을 해야 함
    //메서드의 정의는 클래스 안 + 다른 메서드 밖에서 선언한다.
    //메서드는 필요한 만큼 무한정 정의할 수 있음
    //메서드명은 중복 불가능 (대소문자를 구분함)
    //메서드명은 항상 소문자로 명명한다.

    //메서드의 호출은 (main)메서드의 정의 안에서 호출
    //메서드를 호출할 때는 정의한 메서드명을 반드시 일치시켜야함.(대소문자를 맞춰야 인식)
    //메서드를 호출할 때는 정의한 메서드의 매개변수 정보를 일치시켜야 함. 소문자();
    //매개변수 정보 : 매개변수의 자료형, 매개변수의 갯수


    //메서드의 정의 문법
    /*
    * 접근제한자 리턴타입 메서드명(매개변수정보){
    * {
    *
    *   public static void 메서드명(){
    * }
    *
    * */

    // 메서드 명은 마음대로 변경해도o 다만, main은 고정

        //메서드의 정의
    public static void hello(){
        System.out.println("hello~");
    }

    public static void main(String[] args) {

        // ★메서드의 호출
        hello();

    }


}
