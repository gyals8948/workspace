package 메서드_심화;


//4. Math.random() 메소드를 활용하여
//1~ 50의 수 중 랜덤한 정수를 리턴하는 메소드를 만들고 호출해보자.
public class 심화_4 {
    public static void main(String[] args) {
        System.out.println(test3_4());
    }
    public static int test3_4(){
        //1.0 <= x < 51.0
        return (int)(Math.random() * 50 + 1);
    }


}
