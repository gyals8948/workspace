package 일곱_메서드;






public class 메서드_3 {
    public static void main(String[] args) {
        tellYourName("자바"); //1.
        tellYourName("홍");  //2

//        tellYourName(5); ->  오류 ↓매개변수의 자료형에 String이 들어가서 문자열만 가능

    }

    public static void tellYourName(String name){ // 자료형 + 변수명(마음대로 짓기가능)
                                    //1. ("자바")
                                    //2. ("홍")

        System.out.println("제 이름은 " + name);


    }


}
