package class_basic;

public class StudentTest {
    public static void main(String[] args) {
        //학생 객체 stu1
        Student stu1 = new Student();

        //stu1 이라는 학생의 이름을 출력
        System.out.println(stu1.name);


        //stu1 학생의 모든 정보 출력
        stu1.introduce();

        stu1.setName("kim");
        stu1.introduce(); //이름, 나이, 점수 전부다 출력

        stu1.age = 30; //직접 값을 입력하는 코드는 사용x
        //↕ 같은 코드지만 위쪽은 사용x /변수값을 직접입력 - 컨트롤이 힘듦
        stu1.setAge(30); //메서드로 불러올시 수습하고 수정하기 편리함
    }
}
