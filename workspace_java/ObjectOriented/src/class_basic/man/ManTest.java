package class_basic.man;

public class ManTest {
    public static void main(String[] args) {
        Man man = new Man("홍", 20, "울산");
        //생성자도 메서드 처럼 매개변수를 잘 넣어줘야 함

        //이름 변경
        //man.name = "kim";
        man.setName("kim");
        // System.out.println(name); 오류 private /
        // 이상한 데이터가 들어가는 것을 방지하기 위해서 private로 잠금
        // 잠겨있는 변수를 대신해서 사용하기 위해서 getter setter를 사용한다
        System.out.println(man.getName()); // kim 으로 나온다

        man.printMan();

    }
}
