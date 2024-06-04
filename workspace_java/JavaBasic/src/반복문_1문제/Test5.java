package 반복문_1문제;

public class Test5 {

    public static void main(String[] args) {

        //1번 방법

//        int i = 2;
//        while (i < 11){
//            System.out.print(i + "");
//            i = i + 2;
//        }


        //2번 방법

        int j = 2;
        while (j < 11){

            //j가 짝수일때만
            if (j % 2 == 0 ){


                System.out.println(j + "");

            }
            j++;


        }




        //내가 한 거


//        int i = 1;
//
//        while (i <= 10 ){
//
//            if (i % 2 == 0){
//
//                System.out.println(i);
//
//            }
//
//            i++;
//        }

    }
}
