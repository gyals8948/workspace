package object;


import class_basic.Monitor;

//클래스가 상속을 받고 있지 않다면, 자동으로 Object라는 클래스를 상속 받음.
// ★ 모든 클래스는 Object 클래스를 상속 받는다.
public class Tv {//extends Object <= 생략
    String modelName;

    public void powerOn(){
        aaa(5);


        Monitor mm = new Monitor();
        bbb(mm);
       System.out.println("전원을 켭니다");

       ccc(mm);


    }
    public void ccc(Object obj){//Object obj = mm

    }

    public void  bbb(Monitor m){

    }


    public  void aaa(int a){//int a = 10;



    }



}

class LgTv extends Tv{// extnends == 상속

}