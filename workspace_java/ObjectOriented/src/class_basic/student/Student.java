package class_basic.student;

import java.io.PushbackInputStream;

public class Student {
    //7. Student 클래스는 이름, 나이, 주소, 학번, 연락처를 멤버로 가지고 있습니다.
    //각각의 멤버를 선언하고 모든 멤버를 초기화 하는 메소드를 만드세요.
    //8. Student 클래스에서 멤버 각각의 값을 변경하는 메소드를 만드세요.
    //9. Student 클래스에서 각각의 멤버 값을 리턴하는 메소드를 만드세요.
    //10. Student 클래스에 모든 멤버의 값을 출력하는 메소드를 만드세요.

    String name;
    int age;
    String ad;
    String stuNum;
    String phone;

    //한번에 변경하는용 (getter, setter가 필요한 이유)
//    public void student (String name, int age, String ad, String stuNum, int phone){
//        this.name = name;
//        this.age = age;
//        this.ad = ad;
//        this.stuNum = stuNum;
//        this.phone = phone;
//    }





    public String getName(){
        return name;

    }
    public void  setName(){
        this.name = name;

    }

    public int getAge(){
        return age;
    }


    public void setAge(){
        this.age = age;


    }
    public String getAd(){
        return ad = ad;

    }

    public void setAd(){

        this.ad = ad;
    }
    public String getStuNum(){
        return stuNum;
    }
    public  void setPhone(){
        this.phone = phone;
    }
    public  String getPhone(){
        return phone;
    }




    public void all(){
        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age);
        System.out.println("주소 : " + ad);
        System.out.println("학번 : " + stuNum);
        System.out.println("연락처 : " + phone);


    }



}
