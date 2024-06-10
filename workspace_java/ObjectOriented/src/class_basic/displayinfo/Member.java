package class_basic.displayinfo;

public class Member {

    String name;
    String id;
    int password;

    public Member (String name, String id, int password){

        this. name = name;
        this.id = id;
        this.password = password;


    }

    public String getName(){
        return name;
    }
    public void  setName(){
        this.name = name;

    }
    public  String getId(){
        return  id;

    }
    public void setId(){
        this.id = id;
    }
    public int getPassword(){
        return password;
    }
    public void setPassword(){
        this.password = password;

    }



    public void displayInfo(){
        System.out.println("이름 : " + name);
        System.out.println("아이디 : " + id);
        System.out.println("비밀번호 : " + password);

    }




}
