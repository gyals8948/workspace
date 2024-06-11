package class_basic.rect;

public class RectTest {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();    // 생성자 //0000
        Rectangle s = new Rectangle(1,1,2,3); // 생성자

        r.show(); //소문자 + 괄호 = 메서드호출
        s.show();
        System.out.println(s.square()); //square == 넓이
        r.set(-2,2,-1,4);
        r.show();
        System.out.println(r.square());

        if (r.equals(s)) {
            System.out.println("두 사각형의 넓이는 같습니다");
        }


    }


}
