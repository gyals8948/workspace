package class_basic.car;

        //접근제한자 : 클래스, 메서드, 멤버변수에서 사용할 수 있다.
        //1.public : 프로젝트 내에 존재하면 접근 가능 // 패키지 상위
        //2.default: 같은 패키지내에 있으면 접근 가능 // 패키지
        //3.protected // 일단 패스
        //4.private // 변수, 메서드가 선언된 클래스 안에서만 접근 가능 //클래스

        //멤버변수에는 무조건 private
        //메서드에는 무조건 public
    public class Phone {
        private int price;
        String modelName;
        String brand;

        public Phone(){
            //생성자 public 클래스명 == 초기화
            this.price  = 0;
            this.modelName = "";

        }

        public void setPrice(int price){


            if (price < 0){
                this.price = 0;

            }

            else {

            }
        }

    }
