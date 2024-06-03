package 네번째_조건문;



/*

* switch case break
* switch(변수){
*   case 값1 :
*   case 값2 :
*   case 값3 :
* }
*
*
*
*
*
* */


public class Case_1 {

    public static void main(String[] args) {

        System.out.println("시작~");

        int num = 10;

        switch(num){
            case 1 : //num 값이 1일 때 실행 내용, 시작지점을 알려줌(위에서부터 조건이 맞으면 아래쪽 전부 실행함)
                System.out.println(1);
                break; // break 문을 만나면 switch문이 종료됨
            case 3 :
                System.out.println(3);
                break;
            case 5 :
                System.out.println(5);
                System.out.println(5);
                break;
            case 7 :
                System.out.println(7);
                break; // 마지막 문에는 break를 사용하지 않아도 상관x

            default:// 그 밖에는
                System.out.println("해당없음");


        }

        System.out.println("종료~");


    }

}
