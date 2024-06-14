package collection.list;

import java.util.ArrayList;
import java.util.List;

public class List_1_Test_3 {
    public static void main(String[] args) {




        //이름을 저장하는 리스트를 만들고 리스트에 적당히 데이터를 저장한다.
        // 그 후 저장된 이름 중 ‘홍길동’이라는 이름이 있다면 ‘해당 이름이 존재합니다.’
        // 라는 문구를 출력하는 프로그램을 만들어라.

//        List<String>list3 = new ArrayList<>();
//        list3.add("홍길동");
//        list3.add("임꺽정");
//        list3.add("김효민");
//
//        for (int i = 1; i < list3.size(); i++){
//
//            System.out.println(list3.get(i));
//
//            if (list3.get(i).equals("홍길동")){
//              System.out.println("해당 이름이 존재합니다.");
//
//            }
//
//
//        }





        List<String> nameList = new ArrayList<>();
        nameList.add("김자바");
        nameList.add("이자바");
        nameList.add("홍길동");

        for (int i = 0; i < nameList.size(); i++){

            if (nameList.get(i).equals("홍길동")){
                System.out.println("해당 이름이 존재합니다.");
            }


        }









    }
}
