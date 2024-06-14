package collection.list;

import java.util.ArrayList;
import java.util.List;

public class TestMember {
    public static void main(String[] args) {
    //Member 객체를 저장할 수 있는 list 객체 생성
        List<Member>memberList = new ArrayList<>();


        Member m1 = new Member();

        m1.setId("java");
        m1.setPassword("1111");
        m1.setName("김");
        m1.setAge(20);

        Member m2 = new Member("python", "2222","이",30);
        Member m3 = new Member("c++", "3333","박",0);
        //생성자로 객체생성

        memberList.add(m1);
        memberList.add(m2);
        memberList.add(m3);


        //6번.

        for (Member member : memberList){
            System.out.println(member.toString());
        }

        System.out.println();
        System.out.println();


            //7. List에 저장된 모든 회원의 나이의 합을 출력하여라.
                int sum = 0;
            for (int i = 0; i < memberList.size(); i++){
               sum = sum + memberList.get(i).getAge();


            System.out.println("나이의 합 : " + sum);
            System.out.println();

            //8. List에 저장된 회원 중 id가 java인 회원을 지우는 코드를 작성하세요.

//                memberList.remove(1);
                        //remove (); <- 정수가 들어가야함 / ()번째
                int index = 0;


            for (int i1 = 0; i1 < memberList.size(); i1++){
                if (memberList.get(i).getId().equals("java")){ // member 자료형
                    index = i1;


                }

            }
                memberList.remove(index);





        }








    }
}
