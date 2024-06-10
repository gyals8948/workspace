package class_basic.member;

public class Member {
    //회원정보로는 이름, 아이디, 비밀번호, 나이를 관리할 것이다.
    //이 데이터를 가지는 클래스를 만들어 보세요.

    String name;
    String id;
    String password;
    int age;

    public void  setMemberInfo(String name1, String id1, String password1, int age1 ){
        name = name1;
        id =  id1;
        password = password1;
        age = age1;
    }

    public void printMemberInfo(){
        System.out.println("이름 : " + name);
        System.out.println("아이디 : " + id);
        System.out.println("비밀번호 : " + password);
        System.out.println("나이 : " + age);
    }

//    public void setName(String a){
//        name = a;
//    }
//
//    public void setId(String b){
//        id = b;
//    }
//    public void setPassword(String a){
//        password = a;
//    }
//    public void setAge(int c){
//        age = c;
//    }

    //회원이 이름을 변경
    public  void  setName(String name1){
        name = name1;
    }




}
