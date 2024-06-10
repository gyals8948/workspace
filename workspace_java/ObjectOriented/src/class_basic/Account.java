package class_basic;


    //좋은 클래스의 여건
    //1. 멤버변수는 반드시 초기값을 설정해야한다. null이라도 적어주는게 좋다.
    //2. 초기값 설정은 멤버변수의 선언과는 별도로 진행해야한다.(선언과 동시에 하지마라)

    // ★생성자 : 선언한 변수의 값을 초기화할 용도로 사용
    /*문법
    *   public 클래스명(){
    * }
    *
    *  클래스 안에는 반드시 생성자가 존재해야 한다
    * (객체 생성시 생성자가 반드시 포함)
    *  만약 클래스 안에 생성자를 하나도 선언(생성)하지 않았다면
    *  눈에 보이지 않는 기본 생성자(내용도 없고 매개변수도 없는  생성자)를 자동으로 만들어준다
    *  생성자는 여러개 만들 수 있음
    *  생성자는 매개변수까지 같아야함
    *
    * */


public class Account {

        String accNumber;
        String owner;
        int money; //예금액


        public Account(int a){ // 메서드 오버로딩
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
