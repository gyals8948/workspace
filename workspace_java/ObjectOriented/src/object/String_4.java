package object;

public class String_4 {
    public static void main(String[] args) {

        String a = "짜장면";
        String b = "짬뽕";

        //concat : 두 문자열을 나열, '+'와 동일
        System.out.println(a.concat(b));
        a.concat(b);

        //substring : 문자열 일부를 추출
        String str1 = "avcdefg";
        System.out.println(str1.substring(2)); //2번째 글자부터 추출
        System.out.println(str1.substring(2, 4));//2번째 글자부터 추출
        //2번째 글자부터 4번째 글자까지 추출



        //length : 문자열의 길이
        String str2 ="집에가고싶다";
        System.out.println(str2.length());

        String str3 = "피자,치킨,족발";
        String[] result = str3.split(",");
        System.out.println(result[1]);


    }
}
