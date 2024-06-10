package class_basic.car;

public class Cartest {
    //연습용class


    public static void main(String[] args) {
        //main에서만 실행이 가능하다.
        Car c1 = new Car();
        //Car 클래스의 새로운 객체생성(설계도Class에서 가져오기)

        //c1의 변수를 출력
        System.out.println(c1.brand);
                        //객체명.변수명 = 변수값 출력
        System.out.println(c1.price);


        //c1 변수의 값을 변경
        c1.brand = "현대";
        c1.price = 100;

        //c1의 변수를 출력
        System.out.println(c1.brand);
        System.out.println(c1.price);

        System.out.println();
        System.out.println();

        Car c2 = new Car();
        c2.printCarInto();
        c2.setBrand("기아");
        //메서드만 호출 = 객체명.메서드명으로 호출(매개 변수명이 같아야 한다)

        c2.setCarName("K3");
        c2.setCarNum("1111");
        c2.setCarPrice(1000);

        c2.printCarInto();





    }


}
