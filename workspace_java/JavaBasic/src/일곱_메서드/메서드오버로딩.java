package 일곱_메서드;


    //overloading
    //메소드명은 원래 중복 불가능, 하지만 매개변수의 정보가 다르면 중복이 허용 == method overloading
    //매개변수의 정보: 매개변수의 자료형, 매개변수의 갯수



public class 메서드오버로딩 {

    public static void main(String[] args) {
        System.out.println();
        String s= "aa";
        s.equals("java");
            //메소드 : 소문자, java에서 기본적으로 (제공)만들어진 것 ex) println, equals

        // 자동완성이 떴을 때 앞쪽에 m이라고 적혀있으면 메소드
        // 자동완성이 떴을 때 뒤쪽에 리턴타입 확인가능
        System.out.println();

    }

    public static void println(){ //
        //  ↕   매개변수의 갯수가 달라서 중복 허용

    }
    public static void println(int a){
    }

    public static void println(String a){

    }

    public static void println(String a, int b){
    }


//
//
}
