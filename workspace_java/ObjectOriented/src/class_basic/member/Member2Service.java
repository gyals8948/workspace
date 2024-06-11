package class_basic.member;

public class Member2Service {

    public boolean login(String id, String password){
        if (id.equals("hong")&& password.equals("12345")){
            return true;
        }
        else {
            return false;
        }
    }

    public void logout(String id){

//        return false;
        System.out.println("로그아웃 되었습니다.");

    }




}
