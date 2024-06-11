package class_basic.member;

import com.sun.source.tree.IfTree;

public class MemberServiceExample {
    public static void main(String[] args) {
        Member2Service memberService = new Member2Service();
        boolean result = memberService.login("hong","12345");

        if (result){
            System.out.println("로그인 되었습니다.");
            memberService.logout("hong");


        }

        else {

            System.out.println("id 또는 password가 올바르지 않습니다.");
        }


    }






}
