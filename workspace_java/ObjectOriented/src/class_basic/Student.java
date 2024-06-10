package class_basic;

public class Student {
    String name;
    int age;
    int score;
    //↑ 데이터는 변수로 표현 == 멤버변수

    // 클래스내에 호출은 바로 불가능

    //매개변수로 전달된 문자열로 name 값을 변경하는 메서드만들기
        public void setName(String name1){

            name = name1;
        }

    //나이를 변경하는 메서드
    public void setAge(int a){ // 데이터를 받아올 때 매개변수를 사용
            age = 20; //나이를 20으로 변경하는 메서드
    }

    public void introduce(){
    //↑ 기능은 메서드로
        System.out.println("이름은 : " + name);
        System.out.println("나이 : " + name);
        System.out.println("점수 : " + name);

    }


}
