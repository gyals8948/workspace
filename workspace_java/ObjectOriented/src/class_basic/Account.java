package class_basic;


    //좋은 클래스의 여건
    //1. 멤버변수는 반드시 초기값을 설정해야한다. null이라도 적어주는게 좋다.
    //2. 초기값 설정은 멤버변수의 선언과는 별도로 진행해야한다.(선언과 동시에 하지마라)

    // =============== 클래스는 자료형이다.=====================================

    // ★생성자 : 선언한 변수의 값을 초기화할 용도로 사용
    /*문법
    *   public 클래스명(){
    * }
    *
    *  클래스 안에는 반드시 하나 이상의 생성자가 존재해야 한다 == 클래스에는 반드시 하나 이상의 생성자가 있어야 한다.
    *  개발자가 직접 생성자를 하나도 선언하지 않았다면, 자동으로 기본생성자(디폴트생성자)를 만들어준다(null,0.0,0 이 기본값)
    * (객체 생성시 생성자가 반드시 포함)
    *  만약 클래스 안에 생성자를 하나도 선언(생성)하지 않았다면
    *  눈에 보이지 않는 기본 생성자(내용도 없고 매개변수도 없는  생성자)를 자동으로 만들어준다
    *  생성자는 여러개 만들 수 있음(오버로딩 문법은 지켜야한다)
    *  생성자는 매개변수까지 같아야함
    *  객체를 생성할 때에 사용.
    *
    *
    *
    *   //접근제한자(public)
    *   - 멤버변수 및 메서드에 붙어서 접근의 범위를 지정
    *   public(같은 프로젝트안에는 메소드가 접근가능, default(입력하지 않는다), protected, private(같은 클래스 안에서만 가능) // 왼쪽으로 갈수록 허용범위가 크다
    *
    *   멤버변수는 private 무조건 붙이기
    *
    *
    *   this 키워드  == (이 클레스에서 선언된)
    *   배개변수 신경 써서넣기(아니면 수가 많아서 헷갈림
    *   getter, setter
    *
    *
         //getter : 멤버변수 각각의 값을 return 받는 메서드
         //getter의 이름은 get변수명으로 반드시 지정해야함
         //get 얻다 - > return 값을 돌려주다


         //setter : 멤버변수 '각각의 값을 변경'하는 메서드를 세터(setter) 라고 함
         *        : == 멤버변수 하나의 값을 변경하기 위한 메서드
         // public void setMoney(int money) == setMoney - set + 변수명(대문자)
         *    this.money = money;
         *
         //setter의 이름은 set변수명으로 반드시 지정해야 함
         //setter - 설정 -> setting  ==   name = name;

    *
    *
    *
    *
    *
    *
    * */





public class Account {

        String accNumber;
        String owner;
        int money; //예금액


        public Account(int a){ // 메서드 오버로딩 -- 생성자
            money = a;


        }


        // ★ 생성자(변수 (값을)의 초기화)
        public void setAccount(String accNumber, String owner, int money){ //public (리턴타입(void)없이) 클래스명
            //변수명을 a,b,c 같은 것 보다 자세하게 적어두면 ctrl + p 로 내용을 확인할 때에 더 편리하게 가능

            System.out.println(1111111);
            //이 클래스에서 선언한 accNumber -> this
            this.accNumber = accNumber;
            this.owner = owner;
            this.money = money;
        }


        //모든 변수의 값을 초기화하는 메서드
        public void initAacount(){
            accNumber = "미정";
            owner = "미정";
            money = 10000;

        }

        public void printAccount(){
            System.out.println("계좌번호 : " + accNumber);
            System.out.println("계좌주 : " + owner);
            System.out.println("계좌번호 : " + money);
        }






}
