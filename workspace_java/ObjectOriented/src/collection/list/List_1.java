package collection.list;

import java.util.ArrayList;
import java.util.List;

public class List_1 {
    public static void main(String[] args) {

        //ArrayList 객체 생성

//        ArrayList<String> list1 = new ArrayList<>();
        List<String> list1 = new ArrayList<>();

        //<String> 데이터(문자열)를 다수 저장하기 위한 List(통) 생성
        //기본자료형은 사용 못 한다 but wrapper 클래스 쓰면 된다.


        //리스트에 데이터 저장하기
        //list객체명 . add (매개변수- 실제로 저장할 값)
        list1.add("java");
        list1.add("c++");
        list1.add("python");
        list1.add("c++");

        //리스트에 저장된 데이터를 읽는 법
        // 중복된 데이터 가능함. 하나만 뺴기가 어려움, 순번이 존재. java의 순번은 0부터 -> 순번으로 접근하면 됨
        String result = list1.get(1); // -> c++ 이 나온다.

        //리스트에 저장된 데이터 삭제 법 -> 마찬가지로 순번으로(~번째 지우겠다) 접근해야 함
        list1.remove(0); // -> "java" 삭제

        //리스트에 저장된 데이터의 수 // 객체명.size
        System.out.println(list1.size());

        //리스트에 저장된 모든 데이터 출력
        for (int i = 0; i < list1.size(); i++){

            System.out.println(list1.get(i));
            // 여기서 i는 모든 데이터
        }






    }
}