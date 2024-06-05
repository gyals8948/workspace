package 일곱_메서드;

public class 메서드_4 {
    public static void main(String[] args) {
        introduce("자바", 20, "울산");

        String a = "홍길동";  //== String name = a;
        int b= 40;           //== int age = b;
        String c = "서울";
        // 중요한 것은 자료형
        introduce(a,b,c);
    }

    public static void introduce(String name, int age, String addr){
                                // 매개변수 (,)붙이면 여러개 가능


        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age);
        System.out.println("주소 : " + addr);


    }


}
