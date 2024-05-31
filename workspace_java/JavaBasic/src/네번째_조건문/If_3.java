package 네번째_조건문;

import java.util.Scanner;

public class If_3 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        //키보드로 정수 하나를 입력받아,
        //입력받은 수가 양수이면 '1'
        //음수이면 '2'
        //0이면 '0'출력

        System.out.println("정수 입력");
        int num = sc.nextInt();
        // if == 만약에, else == 그렇지않으면
        if(num > 0){
            System.out.println(1);
        }
        //else if == 그렇지 않고 만약에..( if와 else 사이에만 올 수 있음)
        else if(num < 0){
            System.out.println(2);
        }
        //그렇지 않으면 (음수도 양수도 아니면 '0'이라서 else 사용),
        // else는 나머지 전부를 충족

        else {
            System.out.println(3);

        }




    }
}
