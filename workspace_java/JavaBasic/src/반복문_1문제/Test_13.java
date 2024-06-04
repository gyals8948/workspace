package 반복문_1문제;

public class Test_13 {
    public static void main(String[] args) {


    //1 ~ 100까지의 숫자 중 5의 배수인 수를 모두 출력하고
    // 5의 배수인 수의 개수도 출력하되, while문을 사용하여라.



        int i = 1;
        int cnt = 0;

        while (i < 101){

            if (i % 5 == 0){

                cnt++; //if 조건을 충족시 c++; 실행
                System.out.print(i + " ");

            }

            i++;

        }
        System.out.println();
        System.out.println("5의 배수의 개수: " + cnt);






    }
}
