package 메서드_심화;

public class 심화_8 {
    public static void main(String[] args) {
        //문자열 배열을 매개변수로 받아 배열에 저장된
        //모든 문자열을 나열하여 리턴하는 메소드를 만들고 호출해보세요.
        //"aa","bb","cc"
        String[] ar = {"a", "b", "c"};
        //문자열을 넣기 힘들면 문자열을 먼저 만든다

        String result = test3_7(ar);
        System.out.println(result);

    }
    public static String test3_7(String[] arr){
        //문자가 몇개 있는지 모르기 때문에 for 반복문을 사용
        String result = "";

        for (int i = 0; i< arr.length; i++){
            //합을 구하는 문제 : sum = sum + i 처럼 놓고 시작
             result= result + arr[i];
        }
        return result;
    }

}
