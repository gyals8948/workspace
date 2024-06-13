package class_basic.Static;


//static 키워드가 붙은 멤버변수의 초기화 방법
//static 키워드가 붙은 멤버변수는 생성자에서 초기화 안됨
//대신 초기화 구문이 따로 존재함
//static 해석순서에서 우선순위 1등
public class StaticInit {
    int a;
    static int num; //공용 변수

    //static 변수 초기화
    static {
        num = 5;
    }



    public StaticInit(){
        a = 10;
//        num = 5; //생성자에서 static 초기화 금지  ||||
        num++;
        System.out.println("a : " + a);
        System.out.println("num : " + num);

    }
}
