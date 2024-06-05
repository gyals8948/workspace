package 여섯_배열;

public class 배열과기본자료형의차이 {
    public static void main(String[] args) {


        // ※ 기본자료형과 참조자료형의 차이

        // ★ 기본자료형은 값이 복사됨
        // ★ 참조자료형은 값이 복사되지 않고, 데이터가 자료형에 저장되지않음.
        // 대신에 내부에 데이터의 주소가 존재


        //배열의 복사
//        int[] c = {1,2,3};
//        int[] d = c.clone(); 이렇게 하면 기본자료형처럼 복사가 됨.





        int[] a = {1,3,5};
        int[] b = a;
        //  int[] b = a; - > b와 a는 서로 자료형이라 성립

        a[0] = 10;
        b[2] = 50;
        // - > 10, 3, 5
        // 순서가 중요

        for(int e : a){
            System.out.print(e+ " ");
        }

        System.out.println();


        for(int e : b){
            System.out.print(e+ " ");
        }



        int a1 = 10;
        int b1 = a1;





//        int a = 10;
//        int b = a;
//        a = 20;
//
//        System.out.println("a = " + a);
//        System.out.println("a = " + b);
//





    }
}
