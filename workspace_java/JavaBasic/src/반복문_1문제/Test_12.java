package 반복문_1문제;

public class Test_12 {
    public static void main(String[] args) {


        //1 ~ 100까지 숫자 중 3의 배수인 수의 개수를
        //for문을 사용하여 풀어보아라



        int sum = 0; // 갯수

        for (int i = 3; i < 101; i++){ //1~100까지 숫자

           if(i % 3 == 0){ // 3의 배수

               sum++; // 갯수카운팅
           }
           i++; // 만족할때까지 위로
        }
        System.out.println(sum);
        // 조건 만족후에 반복문에서 벗어남

    }


}
