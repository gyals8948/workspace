package class_basic;

public class MonitorTest { // 문법 연습용 = 반드시 main 메서드가 필요

    public static void main(String[] args) {

        //모니터 설계도에서 모니터 객체 생성
        //객체 생성 문법 : 클래스명 객체명 = new 클래스명();
        Monitor m1 = new Monitor(); // 모니터 == m1 ||
        // new 객체생성

        //객체의 정보(변수) 값을 확인하는 방법
        //문법 : 객체명.변수명;
        System.out.println(m1.brand); //null(값을 넣지않아 기본값인 null로 출력됨 // m1 모니터의 브랜드명을 출력
        System.out.println(m1.price); //0
        System.out.println(m1.color); //null

        Monitor m2 = new Monitor();

        //객체 변수값 변경
        m2.price = 1000;
        //객체명  = new 클래스명();
        m2.brand = "삼성";
        m2.color = "블랙";
        System.out.println(m2.price);
        //m1.price


    }
}


